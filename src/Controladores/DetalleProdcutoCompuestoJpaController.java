/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.DetalleProdcutoCompuesto;
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
public class DetalleProdcutoCompuestoJpaController implements Serializable {

    public DetalleProdcutoCompuestoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleProdcutoCompuesto detalleProdcutoCompuesto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleProdcutoCompuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleProdcutoCompuesto detalleProdcutoCompuesto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleProdcutoCompuesto = em.merge(detalleProdcutoCompuesto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleProdcutoCompuesto.getId();
                if (findDetalleProdcutoCompuesto(id) == null) {
                    throw new NonexistentEntityException("The detalleProdcutoCompuesto with id " + id + " no longer exists.");
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
            DetalleProdcutoCompuesto detalleProdcutoCompuesto;
            try {
                detalleProdcutoCompuesto = em.getReference(DetalleProdcutoCompuesto.class, id);
                detalleProdcutoCompuesto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleProdcutoCompuesto with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleProdcutoCompuesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleProdcutoCompuesto> findDetalleProdcutoCompuestoEntities() {
        return findDetalleProdcutoCompuestoEntities(true, -1, -1);
    }

    public List<DetalleProdcutoCompuesto> findDetalleProdcutoCompuestoEntities(int maxResults, int firstResult) {
        return findDetalleProdcutoCompuestoEntities(false, maxResults, firstResult);
    }

    private List<DetalleProdcutoCompuesto> findDetalleProdcutoCompuestoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleProdcutoCompuesto.class));
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

    public DetalleProdcutoCompuesto findDetalleProdcutoCompuesto(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleProdcutoCompuesto.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleProdcutoCompuestoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleProdcutoCompuesto> rt = cq.from(DetalleProdcutoCompuesto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
