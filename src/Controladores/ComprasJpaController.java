/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Compras;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Detalle_Cuenta_Proveedor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class ComprasJpaController implements Serializable {

    public ComprasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Compras compras) {
        if (compras.getDetalle_Cuenta_Proveedors() == null) {
            compras.setDetalle_Cuenta_Proveedors(new ArrayList<Detalle_Cuenta_Proveedor>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Detalle_Cuenta_Proveedor> attachedDetalle_Cuenta_Proveedors = new ArrayList<Detalle_Cuenta_Proveedor>();
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsDetalle_Cuenta_ProveedorToAttach : compras.getDetalle_Cuenta_Proveedors()) {
                detalle_Cuenta_ProveedorsDetalle_Cuenta_ProveedorToAttach = em.getReference(detalle_Cuenta_ProveedorsDetalle_Cuenta_ProveedorToAttach.getClass(), detalle_Cuenta_ProveedorsDetalle_Cuenta_ProveedorToAttach.getId());
                attachedDetalle_Cuenta_Proveedors.add(detalle_Cuenta_ProveedorsDetalle_Cuenta_ProveedorToAttach);
            }
            compras.setDetalle_Cuenta_Proveedors(attachedDetalle_Cuenta_Proveedors);
            em.persist(compras);
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor : compras.getDetalle_Cuenta_Proveedors()) {
                Compras oldCompraOfDetalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor = detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor.getCompra();
                detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor.setCompra(compras);
                detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor = em.merge(detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor);
                if (oldCompraOfDetalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor != null) {
                    oldCompraOfDetalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor.getDetalle_Cuenta_Proveedors().remove(detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor);
                    oldCompraOfDetalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor = em.merge(oldCompraOfDetalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Compras compras) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compras persistentCompras = em.find(Compras.class, compras.getId());
            List<Detalle_Cuenta_Proveedor> detalle_Cuenta_ProveedorsOld = persistentCompras.getDetalle_Cuenta_Proveedors();
            List<Detalle_Cuenta_Proveedor> detalle_Cuenta_ProveedorsNew = compras.getDetalle_Cuenta_Proveedors();
            List<Detalle_Cuenta_Proveedor> attachedDetalle_Cuenta_ProveedorsNew = new ArrayList<Detalle_Cuenta_Proveedor>();
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsNewDetalle_Cuenta_ProveedorToAttach : detalle_Cuenta_ProveedorsNew) {
                detalle_Cuenta_ProveedorsNewDetalle_Cuenta_ProveedorToAttach = em.getReference(detalle_Cuenta_ProveedorsNewDetalle_Cuenta_ProveedorToAttach.getClass(), detalle_Cuenta_ProveedorsNewDetalle_Cuenta_ProveedorToAttach.getId());
                attachedDetalle_Cuenta_ProveedorsNew.add(detalle_Cuenta_ProveedorsNewDetalle_Cuenta_ProveedorToAttach);
            }
            detalle_Cuenta_ProveedorsNew = attachedDetalle_Cuenta_ProveedorsNew;
            compras.setDetalle_Cuenta_Proveedors(detalle_Cuenta_ProveedorsNew);
            compras = em.merge(compras);
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsOldDetalle_Cuenta_Proveedor : detalle_Cuenta_ProveedorsOld) {
                if (!detalle_Cuenta_ProveedorsNew.contains(detalle_Cuenta_ProveedorsOldDetalle_Cuenta_Proveedor)) {
                    detalle_Cuenta_ProveedorsOldDetalle_Cuenta_Proveedor.setCompra(null);
                    detalle_Cuenta_ProveedorsOldDetalle_Cuenta_Proveedor = em.merge(detalle_Cuenta_ProveedorsOldDetalle_Cuenta_Proveedor);
                }
            }
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor : detalle_Cuenta_ProveedorsNew) {
                if (!detalle_Cuenta_ProveedorsOld.contains(detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor)) {
                    Compras oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor = detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor.getCompra();
                    detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor.setCompra(compras);
                    detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor = em.merge(detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor);
                    if (oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor != null && !oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor.equals(compras)) {
                        oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor.getDetalle_Cuenta_Proveedors().remove(detalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor);
                        oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor = em.merge(oldCompraOfDetalle_Cuenta_ProveedorsNewDetalle_Cuenta_Proveedor);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = compras.getId();
                if (findCompras(id) == null) {
                    throw new NonexistentEntityException("The compras with id " + id + " no longer exists.");
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
            Compras compras;
            try {
                compras = em.getReference(Compras.class, id);
                compras.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The compras with id " + id + " no longer exists.", enfe);
            }
            List<Detalle_Cuenta_Proveedor> detalle_Cuenta_Proveedors = compras.getDetalle_Cuenta_Proveedors();
            for (Detalle_Cuenta_Proveedor detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor : detalle_Cuenta_Proveedors) {
                detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor.setCompra(null);
                detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor = em.merge(detalle_Cuenta_ProveedorsDetalle_Cuenta_Proveedor);
            }
            em.remove(compras);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Compras> findComprasEntities() {
        return findComprasEntities(true, -1, -1);
    }

    public List<Compras> findComprasEntities(int maxResults, int firstResult) {
        return findComprasEntities(false, maxResults, firstResult);
    }

    private List<Compras> findComprasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compras.class));
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

    public Compras findCompras(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compras.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Compras> rt = cq.from(Compras.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
