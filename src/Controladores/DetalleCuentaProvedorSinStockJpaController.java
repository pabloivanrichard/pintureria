/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.DetalleCuentaProvedorSinStock;
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
public class DetalleCuentaProvedorSinStockJpaController implements Serializable {

    public DetalleCuentaProvedorSinStockJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleCuentaProvedorSinStock detalleCuentaProvedorSinStock) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleCuentaProvedorSinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleCuentaProvedorSinStock detalleCuentaProvedorSinStock) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleCuentaProvedorSinStock = em.merge(detalleCuentaProvedorSinStock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleCuentaProvedorSinStock.getId();
                if (findDetalleCuentaProvedorSinStock(id) == null) {
                    throw new NonexistentEntityException("The detalleCuentaProvedorSinStock with id " + id + " no longer exists.");
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
            DetalleCuentaProvedorSinStock detalleCuentaProvedorSinStock;
            try {
                detalleCuentaProvedorSinStock = em.getReference(DetalleCuentaProvedorSinStock.class, id);
                detalleCuentaProvedorSinStock.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleCuentaProvedorSinStock with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleCuentaProvedorSinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleCuentaProvedorSinStock> findDetalleCuentaProvedorSinStockEntities() {
        return findDetalleCuentaProvedorSinStockEntities(true, -1, -1);
    }

    public List<DetalleCuentaProvedorSinStock> findDetalleCuentaProvedorSinStockEntities(int maxResults, int firstResult) {
        return findDetalleCuentaProvedorSinStockEntities(false, maxResults, firstResult);
    }

    private List<DetalleCuentaProvedorSinStock> findDetalleCuentaProvedorSinStockEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleCuentaProvedorSinStock.class));
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

    public DetalleCuentaProvedorSinStock findDetalleCuentaProvedorSinStock(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleCuentaProvedorSinStock.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleCuentaProvedorSinStockCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleCuentaProvedorSinStock> rt = cq.from(DetalleCuentaProvedorSinStock.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
