/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.ProductoCompuesto;
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
public class ProductoCompuestoJpaController implements Serializable {

    public ProductoCompuestoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ProductoCompuesto productoCompuesto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(productoCompuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ProductoCompuesto productoCompuesto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            productoCompuesto = em.merge(productoCompuesto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = productoCompuesto.getId();
                if (findProductoCompuesto(id) == null) {
                    throw new NonexistentEntityException("The productoCompuesto with id " + id + " no longer exists.");
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
            ProductoCompuesto productoCompuesto;
            try {
                productoCompuesto = em.getReference(ProductoCompuesto.class, id);
                productoCompuesto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productoCompuesto with id " + id + " no longer exists.", enfe);
            }
            em.remove(productoCompuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ProductoCompuesto> findProductoCompuestoEntities() {
        return findProductoCompuestoEntities(true, -1, -1);
    }

    public List<ProductoCompuesto> findProductoCompuestoEntities(int maxResults, int firstResult) {
        return findProductoCompuestoEntities(false, maxResults, firstResult);
    }

    private List<ProductoCompuesto> findProductoCompuestoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ProductoCompuesto.class));
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

    public ProductoCompuesto findProductoCompuesto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ProductoCompuesto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCompuestoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ProductoCompuesto> rt = cq.from(ProductoCompuesto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
