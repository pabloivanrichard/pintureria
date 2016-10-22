/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Tipo_Pago;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Tipo_Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class Tipo_PagoJpaController implements Serializable {

    public Tipo_PagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_Pago tipo_Pago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_Venta tipo_Venta = tipo_Pago.getTipo_Venta();
            if (tipo_Venta != null) {
                tipo_Venta = em.getReference(tipo_Venta.getClass(), tipo_Venta.getId());
                tipo_Pago.setTipo_Venta(tipo_Venta);
            }
            em.persist(tipo_Pago);
            if (tipo_Venta != null) {
                Tipo_Pago oldTipo_pagoOfTipo_Venta = tipo_Venta.getTipo_pago();
                if (oldTipo_pagoOfTipo_Venta != null) {
                    oldTipo_pagoOfTipo_Venta.setTipo_Venta(null);
                    oldTipo_pagoOfTipo_Venta = em.merge(oldTipo_pagoOfTipo_Venta);
                }
                tipo_Venta.setTipo_pago(tipo_Pago);
                tipo_Venta = em.merge(tipo_Venta);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_Pago tipo_Pago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_Pago persistentTipo_Pago = em.find(Tipo_Pago.class, tipo_Pago.getId());
            Tipo_Venta tipo_VentaOld = persistentTipo_Pago.getTipo_Venta();
            Tipo_Venta tipo_VentaNew = tipo_Pago.getTipo_Venta();
            if (tipo_VentaNew != null) {
                tipo_VentaNew = em.getReference(tipo_VentaNew.getClass(), tipo_VentaNew.getId());
                tipo_Pago.setTipo_Venta(tipo_VentaNew);
            }
            tipo_Pago = em.merge(tipo_Pago);
            if (tipo_VentaOld != null && !tipo_VentaOld.equals(tipo_VentaNew)) {
                tipo_VentaOld.setTipo_pago(null);
                tipo_VentaOld = em.merge(tipo_VentaOld);
            }
            if (tipo_VentaNew != null && !tipo_VentaNew.equals(tipo_VentaOld)) {
                Tipo_Pago oldTipo_pagoOfTipo_Venta = tipo_VentaNew.getTipo_pago();
                if (oldTipo_pagoOfTipo_Venta != null) {
                    oldTipo_pagoOfTipo_Venta.setTipo_Venta(null);
                    oldTipo_pagoOfTipo_Venta = em.merge(oldTipo_pagoOfTipo_Venta);
                }
                tipo_VentaNew.setTipo_pago(tipo_Pago);
                tipo_VentaNew = em.merge(tipo_VentaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipo_Pago.getId();
                if (findTipo_Pago(id) == null) {
                    throw new NonexistentEntityException("The tipo_Pago with id " + id + " no longer exists.");
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
            Tipo_Pago tipo_Pago;
            try {
                tipo_Pago = em.getReference(Tipo_Pago.class, id);
                tipo_Pago.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_Pago with id " + id + " no longer exists.", enfe);
            }
            Tipo_Venta tipo_Venta = tipo_Pago.getTipo_Venta();
            if (tipo_Venta != null) {
                tipo_Venta.setTipo_pago(null);
                tipo_Venta = em.merge(tipo_Venta);
            }
            em.remove(tipo_Pago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_Pago> findTipo_PagoEntities() {
        return findTipo_PagoEntities(true, -1, -1);
    }

    public List<Tipo_Pago> findTipo_PagoEntities(int maxResults, int firstResult) {
        return findTipo_PagoEntities(false, maxResults, firstResult);
    }

    private List<Tipo_Pago> findTipo_PagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_Pago.class));
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

    public Tipo_Pago findTipo_Pago(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_Pago.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_PagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_Pago> rt = cq.from(Tipo_Pago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
