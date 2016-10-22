/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Tipo_Cliente;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Pablo
 */
public class Tipo_ClienteJpaController implements Serializable {

    public Tipo_ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_Cliente tipo_Cliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipo_Cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_Cliente tipo_Cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipo_Cliente = em.merge(tipo_Cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipo_Cliente.getId();
                if (findTipo_Cliente(id) == null) {
                    throw new NonexistentEntityException("The tipo_Cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_Cliente tipo_Cliente;
            try {
                tipo_Cliente = em.getReference(Tipo_Cliente.class, id);
                tipo_Cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_Cliente with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipo_Cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_Cliente> findTipo_ClienteEntities() {
        return findTipo_ClienteEntities(true, -1, -1);
    }

    public List<Tipo_Cliente> findTipo_ClienteEntities(int maxResults, int firstResult) {
        return findTipo_ClienteEntities(false, maxResults, firstResult);
    }

    private List<Tipo_Cliente> findTipo_ClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Tipo_Cliente findTipo_Cliente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_ClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_Cliente> rt = cq.from(Tipo_Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
