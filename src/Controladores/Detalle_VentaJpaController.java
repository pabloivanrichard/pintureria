/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Detalle_Venta;
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
public class Detalle_VentaJpaController implements Serializable {

    public Detalle_VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Venta detalle_Venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Venta detalle_Venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Venta = em.merge(detalle_Venta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_Venta.getId();
                if (findDetalle_Venta(id) == null) {
                    throw new NonexistentEntityException("The detalle_Venta with id " + id + " no longer exists.");
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
            Detalle_Venta detalle_Venta;
            try {
                detalle_Venta = em.getReference(Detalle_Venta.class, id);
                detalle_Venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Venta with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Venta> findDetalle_VentaEntities() {
        return findDetalle_VentaEntities(true, -1, -1);
    }

    public List<Detalle_Venta> findDetalle_VentaEntities(int maxResults, int firstResult) {
        return findDetalle_VentaEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Venta> findDetalle_VentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Venta.class));
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

    public Detalle_Venta findDetalle_Venta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_VentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Venta> rt = cq.from(Detalle_Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
