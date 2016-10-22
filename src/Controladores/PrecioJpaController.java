/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Precio;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class PrecioJpaController implements Serializable {

    public PrecioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Precio precio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = precio.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getId());
                precio.setProducto(producto);
            }
            em.persist(precio);
            if (producto != null) {
                Precio oldPrecioOfProducto = producto.getPrecio();
                if (oldPrecioOfProducto != null) {
                    oldPrecioOfProducto.setProducto(null);
                    oldPrecioOfProducto = em.merge(oldPrecioOfProducto);
                }
                producto.setPrecio(precio);
                producto = em.merge(producto);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Precio precio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Precio persistentPrecio = em.find(Precio.class, precio.getId());
            Producto productoOld = persistentPrecio.getProducto();
            Producto productoNew = precio.getProducto();
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getId());
                precio.setProducto(productoNew);
            }
            precio = em.merge(precio);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.setPrecio(null);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                Precio oldPrecioOfProducto = productoNew.getPrecio();
                if (oldPrecioOfProducto != null) {
                    oldPrecioOfProducto.setProducto(null);
                    oldPrecioOfProducto = em.merge(oldPrecioOfProducto);
                }
                productoNew.setPrecio(precio);
                productoNew = em.merge(productoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = precio.getId();
                if (findPrecio(id) == null) {
                    throw new NonexistentEntityException("The precio with id " + id + " no longer exists.");
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
            Precio precio;
            try {
                precio = em.getReference(Precio.class, id);
                precio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The precio with id " + id + " no longer exists.", enfe);
            }
            Producto producto = precio.getProducto();
            if (producto != null) {
                producto.setPrecio(null);
                producto = em.merge(producto);
            }
            em.remove(precio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Precio> findPrecioEntities() {
        return findPrecioEntities(true, -1, -1);
    }

    public List<Precio> findPrecioEntities(int maxResults, int firstResult) {
        return findPrecioEntities(false, maxResults, firstResult);
    }

    private List<Precio> findPrecioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Precio.class));
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

    public Precio findPrecio(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Precio.class, id);
        } finally {
            em.close();
        }
    }

    public int getPrecioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Precio> rt = cq.from(Precio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
