/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Orden_Pago;
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
public class Orden_PagoJpaController implements Serializable {

    public Orden_PagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Orden_Pago orden_Pago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(orden_Pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Orden_Pago orden_Pago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            orden_Pago = em.merge(orden_Pago);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = orden_Pago.getId();
                if (findOrden_Pago(id) == null) {
                    throw new NonexistentEntityException("The orden_Pago with id " + id + " no longer exists.");
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
            Orden_Pago orden_Pago;
            try {
                orden_Pago = em.getReference(Orden_Pago.class, id);
                orden_Pago.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orden_Pago with id " + id + " no longer exists.", enfe);
            }
            em.remove(orden_Pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Orden_Pago> findOrden_PagoEntities() {
        return findOrden_PagoEntities(true, -1, -1);
    }

    public List<Orden_Pago> findOrden_PagoEntities(int maxResults, int firstResult) {
        return findOrden_PagoEntities(false, maxResults, firstResult);
    }

    private List<Orden_Pago> findOrden_PagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orden_Pago.class));
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

    public Orden_Pago findOrden_Pago(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orden_Pago.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrden_PagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orden_Pago> rt = cq.from(Orden_Pago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
