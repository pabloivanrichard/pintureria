/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.DetalledeComprasinStock;
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
public class DetalledeComprasinStockJpaController implements Serializable {

    public DetalledeComprasinStockJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalledeComprasinStock detalledeComprasinStock) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalledeComprasinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalledeComprasinStock detalledeComprasinStock) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalledeComprasinStock = em.merge(detalledeComprasinStock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalledeComprasinStock.getId();
                if (findDetalledeComprasinStock(id) == null) {
                    throw new NonexistentEntityException("The detalledeComprasinStock with id " + id + " no longer exists.");
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
            DetalledeComprasinStock detalledeComprasinStock;
            try {
                detalledeComprasinStock = em.getReference(DetalledeComprasinStock.class, id);
                detalledeComprasinStock.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalledeComprasinStock with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalledeComprasinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalledeComprasinStock> findDetalledeComprasinStockEntities() {
        return findDetalledeComprasinStockEntities(true, -1, -1);
    }

    public List<DetalledeComprasinStock> findDetalledeComprasinStockEntities(int maxResults, int firstResult) {
        return findDetalledeComprasinStockEntities(false, maxResults, firstResult);
    }

    private List<DetalledeComprasinStock> findDetalledeComprasinStockEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalledeComprasinStock.class));
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

    public DetalledeComprasinStock findDetalledeComprasinStock(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalledeComprasinStock.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalledeComprasinStockCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalledeComprasinStock> rt = cq.from(DetalledeComprasinStock.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
