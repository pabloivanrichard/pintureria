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
import Entidades.Detalle_Cuenta_Cliente;
import Entidades.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class VentaJpaController implements Serializable {

    public VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Venta venta) {
        if (venta.getDetalle_Cuenta_Clientes() == null) {
            venta.setDetalle_Cuenta_Clientes(new ArrayList<Detalle_Cuenta_Cliente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Detalle_Cuenta_Cliente> attachedDetalle_Cuenta_Clientes = new ArrayList<Detalle_Cuenta_Cliente>();
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesDetalle_Cuenta_ClienteToAttach : venta.getDetalle_Cuenta_Clientes()) {
                detalle_Cuenta_ClientesDetalle_Cuenta_ClienteToAttach = em.getReference(detalle_Cuenta_ClientesDetalle_Cuenta_ClienteToAttach.getClass(), detalle_Cuenta_ClientesDetalle_Cuenta_ClienteToAttach.getId());
                attachedDetalle_Cuenta_Clientes.add(detalle_Cuenta_ClientesDetalle_Cuenta_ClienteToAttach);
            }
            venta.setDetalle_Cuenta_Clientes(attachedDetalle_Cuenta_Clientes);
            em.persist(venta);
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesDetalle_Cuenta_Cliente : venta.getDetalle_Cuenta_Clientes()) {
                Venta oldVentaOfDetalle_Cuenta_ClientesDetalle_Cuenta_Cliente = detalle_Cuenta_ClientesDetalle_Cuenta_Cliente.getVenta();
                detalle_Cuenta_ClientesDetalle_Cuenta_Cliente.setVenta(venta);
                detalle_Cuenta_ClientesDetalle_Cuenta_Cliente = em.merge(detalle_Cuenta_ClientesDetalle_Cuenta_Cliente);
                if (oldVentaOfDetalle_Cuenta_ClientesDetalle_Cuenta_Cliente != null) {
                    oldVentaOfDetalle_Cuenta_ClientesDetalle_Cuenta_Cliente.getDetalle_Cuenta_Clientes().remove(detalle_Cuenta_ClientesDetalle_Cuenta_Cliente);
                    oldVentaOfDetalle_Cuenta_ClientesDetalle_Cuenta_Cliente = em.merge(oldVentaOfDetalle_Cuenta_ClientesDetalle_Cuenta_Cliente);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta persistentVenta = em.find(Venta.class, venta.getId());
            List<Detalle_Cuenta_Cliente> detalle_Cuenta_ClientesOld = persistentVenta.getDetalle_Cuenta_Clientes();
            List<Detalle_Cuenta_Cliente> detalle_Cuenta_ClientesNew = venta.getDetalle_Cuenta_Clientes();
            List<Detalle_Cuenta_Cliente> attachedDetalle_Cuenta_ClientesNew = new ArrayList<Detalle_Cuenta_Cliente>();
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesNewDetalle_Cuenta_ClienteToAttach : detalle_Cuenta_ClientesNew) {
                detalle_Cuenta_ClientesNewDetalle_Cuenta_ClienteToAttach = em.getReference(detalle_Cuenta_ClientesNewDetalle_Cuenta_ClienteToAttach.getClass(), detalle_Cuenta_ClientesNewDetalle_Cuenta_ClienteToAttach.getId());
                attachedDetalle_Cuenta_ClientesNew.add(detalle_Cuenta_ClientesNewDetalle_Cuenta_ClienteToAttach);
            }
            detalle_Cuenta_ClientesNew = attachedDetalle_Cuenta_ClientesNew;
            venta.setDetalle_Cuenta_Clientes(detalle_Cuenta_ClientesNew);
            venta = em.merge(venta);
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesOldDetalle_Cuenta_Cliente : detalle_Cuenta_ClientesOld) {
                if (!detalle_Cuenta_ClientesNew.contains(detalle_Cuenta_ClientesOldDetalle_Cuenta_Cliente)) {
                    detalle_Cuenta_ClientesOldDetalle_Cuenta_Cliente.setVenta(null);
                    detalle_Cuenta_ClientesOldDetalle_Cuenta_Cliente = em.merge(detalle_Cuenta_ClientesOldDetalle_Cuenta_Cliente);
                }
            }
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente : detalle_Cuenta_ClientesNew) {
                if (!detalle_Cuenta_ClientesOld.contains(detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente)) {
                    Venta oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente = detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente.getVenta();
                    detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente.setVenta(venta);
                    detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente = em.merge(detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente);
                    if (oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente != null && !oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente.equals(venta)) {
                        oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente.getDetalle_Cuenta_Clientes().remove(detalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente);
                        oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente = em.merge(oldVentaOfDetalle_Cuenta_ClientesNewDetalle_Cuenta_Cliente);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = venta.getId();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
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
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            List<Detalle_Cuenta_Cliente> detalle_Cuenta_Clientes = venta.getDetalle_Cuenta_Clientes();
            for (Detalle_Cuenta_Cliente detalle_Cuenta_ClientesDetalle_Cuenta_Cliente : detalle_Cuenta_Clientes) {
                detalle_Cuenta_ClientesDetalle_Cuenta_Cliente.setVenta(null);
                detalle_Cuenta_ClientesDetalle_Cuenta_Cliente = em.merge(detalle_Cuenta_ClientesDetalle_Cuenta_Cliente);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
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

    public Venta findVenta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
