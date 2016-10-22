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
import Entidades.Tipo_Pago;
import Entidades.Tipo_Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class Tipo_VentaJpaController implements Serializable {

    public Tipo_VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_Venta tipo_Venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_Pago tipo_pago = tipo_Venta.getTipo_pago();
            if (tipo_pago != null) {
                tipo_pago = em.getReference(tipo_pago.getClass(), tipo_pago.getId());
                tipo_Venta.setTipo_pago(tipo_pago);
            }
            em.persist(tipo_Venta);
            if (tipo_pago != null) {
                Tipo_Venta oldTipo_VentaOfTipo_pago = tipo_pago.getTipo_Venta();
                if (oldTipo_VentaOfTipo_pago != null) {
                    oldTipo_VentaOfTipo_pago.setTipo_pago(null);
                    oldTipo_VentaOfTipo_pago = em.merge(oldTipo_VentaOfTipo_pago);
                }
                tipo_pago.setTipo_Venta(tipo_Venta);
                tipo_pago = em.merge(tipo_pago);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_Venta tipo_Venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_Venta persistentTipo_Venta = em.find(Tipo_Venta.class, tipo_Venta.getId());
            Tipo_Pago tipo_pagoOld = persistentTipo_Venta.getTipo_pago();
            Tipo_Pago tipo_pagoNew = tipo_Venta.getTipo_pago();
            if (tipo_pagoNew != null) {
                tipo_pagoNew = em.getReference(tipo_pagoNew.getClass(), tipo_pagoNew.getId());
                tipo_Venta.setTipo_pago(tipo_pagoNew);
            }
            tipo_Venta = em.merge(tipo_Venta);
            if (tipo_pagoOld != null && !tipo_pagoOld.equals(tipo_pagoNew)) {
                tipo_pagoOld.setTipo_Venta(null);
                tipo_pagoOld = em.merge(tipo_pagoOld);
            }
            if (tipo_pagoNew != null && !tipo_pagoNew.equals(tipo_pagoOld)) {
                Tipo_Venta oldTipo_VentaOfTipo_pago = tipo_pagoNew.getTipo_Venta();
                if (oldTipo_VentaOfTipo_pago != null) {
                    oldTipo_VentaOfTipo_pago.setTipo_pago(null);
                    oldTipo_VentaOfTipo_pago = em.merge(oldTipo_VentaOfTipo_pago);
                }
                tipo_pagoNew.setTipo_Venta(tipo_Venta);
                tipo_pagoNew = em.merge(tipo_pagoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipo_Venta.getId();
                if (findTipo_Venta(id) == null) {
                    throw new NonexistentEntityException("The tipo_Venta with id " + id + " no longer exists.");
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
            Tipo_Venta tipo_Venta;
            try {
                tipo_Venta = em.getReference(Tipo_Venta.class, id);
                tipo_Venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_Venta with id " + id + " no longer exists.", enfe);
            }
            Tipo_Pago tipo_pago = tipo_Venta.getTipo_pago();
            if (tipo_pago != null) {
                tipo_pago.setTipo_Venta(null);
                tipo_pago = em.merge(tipo_pago);
            }
            em.remove(tipo_Venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_Venta> findTipo_VentaEntities() {
        return findTipo_VentaEntities(true, -1, -1);
    }

    public List<Tipo_Venta> findTipo_VentaEntities(int maxResults, int firstResult) {
        return findTipo_VentaEntities(false, maxResults, firstResult);
    }

    private List<Tipo_Venta> findTipo_VentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_Venta.class));
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

    public Tipo_Venta findTipo_Venta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_VentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_Venta> rt = cq.from(Tipo_Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
