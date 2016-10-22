/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Detalle_Cuenta_Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class Detalle_Cuenta_ClienteJpaController implements Serializable {

    public Detalle_Cuenta_ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Cuenta_Cliente detalle_Cuenta_Cliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta venta = detalle_Cuenta_Cliente.getVenta();
            if (venta != null) {
                venta = em.getReference(venta.getClass(), venta.getId());
                detalle_Cuenta_Cliente.setVenta(venta);
            }
            em.persist(detalle_Cuenta_Cliente);
            if (venta != null) {
                venta.getDetalle_Cuenta_Clientes().add(detalle_Cuenta_Cliente);
                venta = em.merge(venta);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Cuenta_Cliente detalle_Cuenta_Cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Detalle_Cuenta_Cliente persistentDetalle_Cuenta_Cliente = em.find(Detalle_Cuenta_Cliente.class, detalle_Cuenta_Cliente.getId());
            Venta ventaOld = persistentDetalle_Cuenta_Cliente.getVenta();
            Venta ventaNew = detalle_Cuenta_Cliente.getVenta();
            if (ventaNew != null) {
                ventaNew = em.getReference(ventaNew.getClass(), ventaNew.getId());
                detalle_Cuenta_Cliente.setVenta(ventaNew);
            }
            detalle_Cuenta_Cliente = em.merge(detalle_Cuenta_Cliente);
            if (ventaOld != null && !ventaOld.equals(ventaNew)) {
                ventaOld.getDetalle_Cuenta_Clientes().remove(detalle_Cuenta_Cliente);
                ventaOld = em.merge(ventaOld);
            }
            if (ventaNew != null && !ventaNew.equals(ventaOld)) {
                ventaNew.getDetalle_Cuenta_Clientes().add(detalle_Cuenta_Cliente);
                ventaNew = em.merge(ventaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_Cuenta_Cliente.getId();
                if (findDetalle_Cuenta_Cliente(id) == null) {
                    throw new NonexistentEntityException("The detalle_Cuenta_Cliente with id " + id + " no longer exists.");
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
            Detalle_Cuenta_Cliente detalle_Cuenta_Cliente;
            try {
                detalle_Cuenta_Cliente = em.getReference(Detalle_Cuenta_Cliente.class, id);
                detalle_Cuenta_Cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Cuenta_Cliente with id " + id + " no longer exists.", enfe);
            }
            Venta venta = detalle_Cuenta_Cliente.getVenta();
            if (venta != null) {
                venta.getDetalle_Cuenta_Clientes().remove(detalle_Cuenta_Cliente);
                venta = em.merge(venta);
            }
            em.remove(detalle_Cuenta_Cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Cuenta_Cliente> findDetalle_Cuenta_ClienteEntities() {
        return findDetalle_Cuenta_ClienteEntities(true, -1, -1);
    }

    public List<Detalle_Cuenta_Cliente> findDetalle_Cuenta_ClienteEntities(int maxResults, int firstResult) {
        return findDetalle_Cuenta_ClienteEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Cuenta_Cliente> findDetalle_Cuenta_ClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Cuenta_Cliente.class));
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

    public Detalle_Cuenta_Cliente findDetalle_Cuenta_Cliente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Cuenta_Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_Cuenta_ClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Cuenta_Cliente> rt = cq.from(Detalle_Cuenta_Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
