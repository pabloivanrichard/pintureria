/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Producto;
import Entidades.Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class ProveedorJpaController implements Serializable {

    public ProveedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Proveedor proveedor) {
        if (proveedor.getProductos() == null) {
            proveedor.setProductos(new ArrayList<Producto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = proveedor.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getId());
                proveedor.setProducto(producto);
            }
            List<Producto> attachedProductos = new ArrayList<Producto>();
            for (Producto productosProductoToAttach : proveedor.getProductos()) {
                productosProductoToAttach = em.getReference(productosProductoToAttach.getClass(), productosProductoToAttach.getId());
                attachedProductos.add(productosProductoToAttach);
            }
            proveedor.setProductos(attachedProductos);
            em.persist(proveedor);
            if (producto != null) {
                Proveedor oldProveedorOfProducto = producto.getProveedor();
                if (oldProveedorOfProducto != null) {
                    oldProveedorOfProducto.setProducto(null);
                    oldProveedorOfProducto = em.merge(oldProveedorOfProducto);
                }
                producto.setProveedor(proveedor);
                producto = em.merge(producto);
            }
            for (Producto productosProducto : proveedor.getProductos()) {
                Proveedor oldProveedorOfProductosProducto = productosProducto.getProveedor();
                productosProducto.setProveedor(proveedor);
                productosProducto = em.merge(productosProducto);
                if (oldProveedorOfProductosProducto != null) {
                    oldProveedorOfProductosProducto.getProductos().remove(productosProducto);
                    oldProveedorOfProductosProducto = em.merge(oldProveedorOfProductosProducto);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Proveedor proveedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedor persistentProveedor = em.find(Proveedor.class, proveedor.getId());
            Producto productoOld = persistentProveedor.getProducto();
            Producto productoNew = proveedor.getProducto();
            List<Producto> productosOld = persistentProveedor.getProductos();
            List<Producto> productosNew = proveedor.getProductos();
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getId());
                proveedor.setProducto(productoNew);
            }
            List<Producto> attachedProductosNew = new ArrayList<Producto>();
            for (Producto productosNewProductoToAttach : productosNew) {
                productosNewProductoToAttach = em.getReference(productosNewProductoToAttach.getClass(), productosNewProductoToAttach.getId());
                attachedProductosNew.add(productosNewProductoToAttach);
            }
            productosNew = attachedProductosNew;
            proveedor.setProductos(productosNew);
            proveedor = em.merge(proveedor);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.setProveedor(null);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                Proveedor oldProveedorOfProducto = productoNew.getProveedor();
                if (oldProveedorOfProducto != null) {
                    oldProveedorOfProducto.setProducto(null);
                    oldProveedorOfProducto = em.merge(oldProveedorOfProducto);
                }
                productoNew.setProveedor(proveedor);
                productoNew = em.merge(productoNew);
            }
            for (Producto productosOldProducto : productosOld) {
                if (!productosNew.contains(productosOldProducto)) {
                    productosOldProducto.setProveedor(null);
                    productosOldProducto = em.merge(productosOldProducto);
                }
            }
            for (Producto productosNewProducto : productosNew) {
                if (!productosOld.contains(productosNewProducto)) {
                    Proveedor oldProveedorOfProductosNewProducto = productosNewProducto.getProveedor();
                    productosNewProducto.setProveedor(proveedor);
                    productosNewProducto = em.merge(productosNewProducto);
                    if (oldProveedorOfProductosNewProducto != null && !oldProveedorOfProductosNewProducto.equals(proveedor)) {
                        oldProveedorOfProductosNewProducto.getProductos().remove(productosNewProducto);
                        oldProveedorOfProductosNewProducto = em.merge(oldProveedorOfProductosNewProducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = proveedor.getId();
                if (findProveedor(id) == null) {
                    throw new NonexistentEntityException("The proveedor with id " + id + " no longer exists.");
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
            Proveedor proveedor;
            try {
                proveedor = em.getReference(Proveedor.class, id);
                proveedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The proveedor with id " + id + " no longer exists.", enfe);
            }
            Producto producto = proveedor.getProducto();
            if (producto != null) {
                producto.setProveedor(null);
                producto = em.merge(producto);
            }
            List<Producto> productos = proveedor.getProductos();
            for (Producto productosProducto : productos) {
                productosProducto.setProveedor(null);
                productosProducto = em.merge(productosProducto);
            }
            em.remove(proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Proveedor> findProveedorEntities() {
        return findProveedorEntities(true, -1, -1);
    }

    public List<Proveedor> findProveedorEntities(int maxResults, int firstResult) {
        return findProveedorEntities(false, maxResults, firstResult);
    }

    private List<Proveedor> findProveedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Proveedor.class));
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

    public Proveedor findProveedor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProveedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Proveedor> rt = cq.from(Proveedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
