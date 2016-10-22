/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Tipo_Factura;
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
public class Tipo_FacturaJpaController implements Serializable {

    public Tipo_FacturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_Factura tipo_Factura) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipo_Factura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_Factura tipo_Factura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipo_Factura = em.merge(tipo_Factura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipo_Factura.getId();
                if (findTipo_Factura(id) == null) {
                    throw new NonexistentEntityException("The tipo_Factura with id " + id + " no longer exists.");
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
            Tipo_Factura tipo_Factura;
            try {
                tipo_Factura = em.getReference(Tipo_Factura.class, id);
                tipo_Factura.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_Factura with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipo_Factura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_Factura> findTipo_FacturaEntities() {
        return findTipo_FacturaEntities(true, -1, -1);
    }

    public List<Tipo_Factura> findTipo_FacturaEntities(int maxResults, int firstResult) {
        return findTipo_FacturaEntities(false, maxResults, firstResult);
    }

    private List<Tipo_Factura> findTipo_FacturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_Factura.class));
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

    public Tipo_Factura findTipo_Factura(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_Factura.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_FacturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_Factura> rt = cq.from(Tipo_Factura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
