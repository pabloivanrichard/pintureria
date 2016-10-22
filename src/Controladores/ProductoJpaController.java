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
import Entidades.Proveedor;
import Entidades.Precio;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        if (producto.getProveedors() == null) {
            producto.setProveedors(new ArrayList<Proveedor>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedor proveedor = producto.getProveedor();
            if (proveedor != null) {
                proveedor = em.getReference(proveedor.getClass(), proveedor.getId());
                producto.setProveedor(proveedor);
            }
            Precio precio = producto.getPrecio();
            if (precio != null) {
                precio = em.getReference(precio.getClass(), precio.getId());
                producto.setPrecio(precio);
            }
            List<Proveedor> attachedProveedors = new ArrayList<Proveedor>();
            for (Proveedor proveedorsProveedorToAttach : producto.getProveedors()) {
                proveedorsProveedorToAttach = em.getReference(proveedorsProveedorToAttach.getClass(), proveedorsProveedorToAttach.getId());
                attachedProveedors.add(proveedorsProveedorToAttach);
            }
            producto.setProveedors(attachedProveedors);
            em.persist(producto);
            if (proveedor != null) {
                proveedor.getProductos().add(producto);
                proveedor = em.merge(proveedor);
            }
            if (precio != null) {
                Producto oldProductoOfPrecio = precio.getProducto();
                if (oldProductoOfPrecio != null) {
                    oldProductoOfPrecio.setPrecio(null);
                    oldProductoOfPrecio = em.merge(oldProductoOfPrecio);
                }
                precio.setProducto(producto);
                precio = em.merge(precio);
            }
            for (Proveedor proveedorsProveedor : producto.getProveedors()) {
                Producto oldProductoOfProveedorsProveedor = proveedorsProveedor.getProducto();
                proveedorsProveedor.setProducto(producto);
                proveedorsProveedor = em.merge(proveedorsProveedor);
                if (oldProductoOfProveedorsProveedor != null) {
                    oldProductoOfProveedorsProveedor.getProveedors().remove(proveedorsProveedor);
                    oldProductoOfProveedorsProveedor = em.merge(oldProductoOfProveedorsProveedor);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getId());
            Proveedor proveedorOld = persistentProducto.getProveedor();
            Proveedor proveedorNew = producto.getProveedor();
            Precio precioOld = persistentProducto.getPrecio();
            Precio precioNew = producto.getPrecio();
            List<Proveedor> proveedorsOld = persistentProducto.getProveedors();
            List<Proveedor> proveedorsNew = producto.getProveedors();
            if (proveedorNew != null) {
                proveedorNew = em.getReference(proveedorNew.getClass(), proveedorNew.getId());
                producto.setProveedor(proveedorNew);
            }
            if (precioNew != null) {
                precioNew = em.getReference(precioNew.getClass(), precioNew.getId());
                producto.setPrecio(precioNew);
            }
            List<Proveedor> attachedProveedorsNew = new ArrayList<Proveedor>();
            for (Proveedor proveedorsNewProveedorToAttach : proveedorsNew) {
                proveedorsNewProveedorToAttach = em.getReference(proveedorsNewProveedorToAttach.getClass(), proveedorsNewProveedorToAttach.getId());
                attachedProveedorsNew.add(proveedorsNewProveedorToAttach);
            }
            proveedorsNew = attachedProveedorsNew;
            producto.setProveedors(proveedorsNew);
            producto = em.merge(producto);
            if (proveedorOld != null && !proveedorOld.equals(proveedorNew)) {
                proveedorOld.getProductos().remove(producto);
                proveedorOld = em.merge(proveedorOld);
            }
            if (proveedorNew != null && !proveedorNew.equals(proveedorOld)) {
                proveedorNew.getProductos().add(producto);
                proveedorNew = em.merge(proveedorNew);
            }
            if (precioOld != null && !precioOld.equals(precioNew)) {
                precioOld.setProducto(null);
                precioOld = em.merge(precioOld);
            }
            if (precioNew != null && !precioNew.equals(precioOld)) {
                Producto oldProductoOfPrecio = precioNew.getProducto();
                if (oldProductoOfPrecio != null) {
                    oldProductoOfPrecio.setPrecio(null);
                    oldProductoOfPrecio = em.merge(oldProductoOfPrecio);
                }
                precioNew.setProducto(producto);
                precioNew = em.merge(precioNew);
            }
            for (Proveedor proveedorsOldProveedor : proveedorsOld) {
                if (!proveedorsNew.contains(proveedorsOldProveedor)) {
                    proveedorsOldProveedor.setProducto(null);
                    proveedorsOldProveedor = em.merge(proveedorsOldProveedor);
                }
            }
            for (Proveedor proveedorsNewProveedor : proveedorsNew) {
                if (!proveedorsOld.contains(proveedorsNewProveedor)) {
                    Producto oldProductoOfProveedorsNewProveedor = proveedorsNewProveedor.getProducto();
                    proveedorsNewProveedor.setProducto(producto);
                    proveedorsNewProveedor = em.merge(proveedorsNewProveedor);
                    if (oldProductoOfProveedorsNewProveedor != null && !oldProductoOfProveedorsNewProveedor.equals(producto)) {
                        oldProductoOfProveedorsNewProveedor.getProveedors().remove(proveedorsNewProveedor);
                        oldProductoOfProveedorsNewProveedor = em.merge(oldProductoOfProveedorsNewProveedor);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = producto.getId();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            Proveedor proveedor = producto.getProveedor();
            if (proveedor != null) {
                proveedor.getProductos().remove(producto);
                proveedor = em.merge(proveedor);
            }
            Precio precio = producto.getPrecio();
            if (precio != null) {
                precio.setProducto(null);
                precio = em.merge(precio);
            }
            List<Proveedor> proveedors = producto.getProveedors();
            for (Proveedor proveedorsProveedor : proveedors) {
                proveedorsProveedor.setProducto(null);
                proveedorsProveedor = em.merge(proveedorsProveedor);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
