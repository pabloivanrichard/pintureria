/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.ComprasinStock;
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
public class ComprasinStockJpaController implements Serializable {

    public ComprasinStockJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ComprasinStock comprasinStock) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(comprasinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ComprasinStock comprasinStock) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            comprasinStock = em.merge(comprasinStock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = comprasinStock.getId();
                if (findComprasinStock(id) == null) {
                    throw new NonexistentEntityException("The comprasinStock with id " + id + " no longer exists.");
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
            ComprasinStock comprasinStock;
            try {
                comprasinStock = em.getReference(ComprasinStock.class, id);
                comprasinStock.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The comprasinStock with id " + id + " no longer exists.", enfe);
            }
            em.remove(comprasinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ComprasinStock> findComprasinStockEntities() {
        return findComprasinStockEntities(true, -1, -1);
    }

    public List<ComprasinStock> findComprasinStockEntities(int maxResults, int firstResult) {
        return findComprasinStockEntities(false, maxResults, firstResult);
    }

    private List<ComprasinStock> findComprasinStockEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ComprasinStock.class));
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

    public ComprasinStock findComprasinStock(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ComprasinStock.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprasinStockCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ComprasinStock> rt = cq.from(ComprasinStock.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
