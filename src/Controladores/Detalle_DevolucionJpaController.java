/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Detalle_Devolucion;
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
public class Detalle_DevolucionJpaController implements Serializable {

    public Detalle_DevolucionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Devolucion detalle_Devolucion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Devolucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Devolucion detalle_Devolucion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Devolucion = em.merge(detalle_Devolucion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_Devolucion.getId();
                if (findDetalle_Devolucion(id) == null) {
                    throw new NonexistentEntityException("The detalle_Devolucion with id " + id + " no longer exists.");
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
            Detalle_Devolucion detalle_Devolucion;
            try {
                detalle_Devolucion = em.getReference(Detalle_Devolucion.class, id);
                detalle_Devolucion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Devolucion with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Devolucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Devolucion> findDetalle_DevolucionEntities() {
        return findDetalle_DevolucionEntities(true, -1, -1);
    }

    public List<Detalle_Devolucion> findDetalle_DevolucionEntities(int maxResults, int firstResult) {
        return findDetalle_DevolucionEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Devolucion> findDetalle_DevolucionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Devolucion.class));
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

    public Detalle_Devolucion findDetalle_Devolucion(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Devolucion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_DevolucionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Devolucion> rt = cq.from(Detalle_Devolucion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
