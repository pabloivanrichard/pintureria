/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Datos_cheque;
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
public class Datos_chequeJpaController implements Serializable {

    public Datos_chequeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Datos_cheque datos_cheque) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos_cheque);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Datos_cheque datos_cheque) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_cheque = em.merge(datos_cheque);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = datos_cheque.getId();
                if (findDatos_cheque(id) == null) {
                    throw new NonexistentEntityException("The datos_cheque with id " + id + " no longer exists.");
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
            Datos_cheque datos_cheque;
            try {
                datos_cheque = em.getReference(Datos_cheque.class, id);
                datos_cheque.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datos_cheque with id " + id + " no longer exists.", enfe);
            }
            em.remove(datos_cheque);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Datos_cheque> findDatos_chequeEntities() {
        return findDatos_chequeEntities(true, -1, -1);
    }

    public List<Datos_cheque> findDatos_chequeEntities(int maxResults, int firstResult) {
        return findDatos_chequeEntities(false, maxResults, firstResult);
    }

    private List<Datos_cheque> findDatos_chequeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Datos_cheque.class));
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

    public Datos_cheque findDatos_cheque(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Datos_cheque.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatos_chequeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Datos_cheque> rt = cq.from(Datos_cheque.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
