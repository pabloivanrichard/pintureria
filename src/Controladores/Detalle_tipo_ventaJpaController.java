/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Detalle_tipo_venta;
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
public class Detalle_tipo_ventaJpaController implements Serializable {

    public Detalle_tipo_ventaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_tipo_venta detalle_tipo_venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_tipo_venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_tipo_venta detalle_tipo_venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_tipo_venta = em.merge(detalle_tipo_venta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_tipo_venta.getId();
                if (findDetalle_tipo_venta(id) == null) {
                    throw new NonexistentEntityException("The detalle_tipo_venta with id " + id + " no longer exists.");
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
            Detalle_tipo_venta detalle_tipo_venta;
            try {
                detalle_tipo_venta = em.getReference(Detalle_tipo_venta.class, id);
                detalle_tipo_venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_tipo_venta with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_tipo_venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_tipo_venta> findDetalle_tipo_ventaEntities() {
        return findDetalle_tipo_ventaEntities(true, -1, -1);
    }

    public List<Detalle_tipo_venta> findDetalle_tipo_ventaEntities(int maxResults, int firstResult) {
        return findDetalle_tipo_ventaEntities(false, maxResults, firstResult);
    }

    private List<Detalle_tipo_venta> findDetalle_tipo_ventaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_tipo_venta.class));
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

    public Detalle_tipo_venta findDetalle_tipo_venta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_tipo_venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_tipo_ventaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_tipo_venta> rt = cq.from(Detalle_tipo_venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
