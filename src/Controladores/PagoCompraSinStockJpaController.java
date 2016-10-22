/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.PagoCompraSinStock;
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
public class PagoCompraSinStockJpaController implements Serializable {

    public PagoCompraSinStockJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PagoCompraSinStock pagoCompraSinStock) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pagoCompraSinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PagoCompraSinStock pagoCompraSinStock) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pagoCompraSinStock = em.merge(pagoCompraSinStock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = pagoCompraSinStock.getId();
                if (findPagoCompraSinStock(id) == null) {
                    throw new NonexistentEntityException("The pagoCompraSinStock with id " + id + " no longer exists.");
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
            PagoCompraSinStock pagoCompraSinStock;
            try {
                pagoCompraSinStock = em.getReference(PagoCompraSinStock.class, id);
                pagoCompraSinStock.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pagoCompraSinStock with id " + id + " no longer exists.", enfe);
            }
            em.remove(pagoCompraSinStock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PagoCompraSinStock> findPagoCompraSinStockEntities() {
        return findPagoCompraSinStockEntities(true, -1, -1);
    }

    public List<PagoCompraSinStock> findPagoCompraSinStockEntities(int maxResults, int firstResult) {
        return findPagoCompraSinStockEntities(false, maxResults, firstResult);
    }

    private List<PagoCompraSinStock> findPagoCompraSinStockEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PagoCompraSinStock.class));
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

    public PagoCompraSinStock findPagoCompraSinStock(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PagoCompraSinStock.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagoCompraSinStockCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PagoCompraSinStock> rt = cq.from(PagoCompraSinStock.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
