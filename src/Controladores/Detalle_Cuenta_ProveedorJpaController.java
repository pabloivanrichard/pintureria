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
import Entidades.Compras;
import Entidades.Detalle_Cuenta_Proveedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class Detalle_Cuenta_ProveedorJpaController implements Serializable {

    public Detalle_Cuenta_ProveedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Cuenta_Proveedor detalle_Cuenta_Proveedor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compras compra = detalle_Cuenta_Proveedor.getCompra();
            if (compra != null) {
                compra = em.getReference(compra.getClass(), compra.getId());
                detalle_Cuenta_Proveedor.setCompra(compra);
            }
            em.persist(detalle_Cuenta_Proveedor);
            if (compra != null) {
                compra.getDetalle_Cuenta_Proveedors().add(detalle_Cuenta_Proveedor);
                compra = em.merge(compra);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Cuenta_Proveedor detalle_Cuenta_Proveedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalle_Cuenta_Proveedor persistentDetalle_Cuenta_Proveedor = em.find(Detalle_Cuenta_Proveedor.class, detalle_Cuenta_Proveedor.getId());
            Compras compraOld = persistentDetalle_Cuenta_Proveedor.getCompra();
            Compras compraNew = detalle_Cuenta_Proveedor.getCompra();
            if (compraNew != null) {
                compraNew = em.getReference(compraNew.getClass(), compraNew.getId());
                detalle_Cuenta_Proveedor.setCompra(compraNew);
            }
            detalle_Cuenta_Proveedor = em.merge(detalle_Cuenta_Proveedor);
            if (compraOld != null && !compraOld.equals(compraNew)) {
                compraOld.getDetalle_Cuenta_Proveedors().remove(detalle_Cuenta_Proveedor);
                compraOld = em.merge(compraOld);
            }
            if (compraNew != null && !compraNew.equals(compraOld)) {
                compraNew.getDetalle_Cuenta_Proveedors().add(detalle_Cuenta_Proveedor);
                compraNew = em.merge(compraNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_Cuenta_Proveedor.getId();
                if (findDetalle_Cuenta_Proveedor(id) == null) {
                    throw new NonexistentEntityException("The detalle_Cuenta_Proveedor with id " + id + " no longer exists.");
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
            Detalle_Cuenta_Proveedor detalle_Cuenta_Proveedor;
            try {
                detalle_Cuenta_Proveedor = em.getReference(Detalle_Cuenta_Proveedor.class, id);
                detalle_Cuenta_Proveedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Cuenta_Proveedor with id " + id + " no longer exists.", enfe);
            }
            Compras compra = detalle_Cuenta_Proveedor.getCompra();
            if (compra != null) {
                compra.getDetalle_Cuenta_Proveedors().remove(detalle_Cuenta_Proveedor);
                compra = em.merge(compra);
            }
            em.remove(detalle_Cuenta_Proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Cuenta_Proveedor> findDetalle_Cuenta_ProveedorEntities() {
        return findDetalle_Cuenta_ProveedorEntities(true, -1, -1);
    }

    public List<Detalle_Cuenta_Proveedor> findDetalle_Cuenta_ProveedorEntities(int maxResults, int firstResult) {
        return findDetalle_Cuenta_ProveedorEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Cuenta_Proveedor> findDetalle_Cuenta_ProveedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Cuenta_Proveedor.class));
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

    public Detalle_Cuenta_Proveedor findDetalle_Cuenta_Proveedor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Cuenta_Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_Cuenta_ProveedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Cuenta_Proveedor> rt = cq.from(Detalle_Cuenta_Proveedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
