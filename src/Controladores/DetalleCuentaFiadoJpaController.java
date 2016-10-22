/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.DetalleCuentaFiado;
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
public class DetalleCuentaFiadoJpaController implements Serializable {

    public DetalleCuentaFiadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleCuentaFiado detalleCuentaFiado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleCuentaFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleCuentaFiado detalleCuentaFiado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleCuentaFiado = em.merge(detalleCuentaFiado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleCuentaFiado.getId();
                if (findDetalleCuentaFiado(id) == null) {
                    throw new NonexistentEntityException("The detalleCuentaFiado with id " + id + " no longer exists.");
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
            DetalleCuentaFiado detalleCuentaFiado;
            try {
                detalleCuentaFiado = em.getReference(DetalleCuentaFiado.class, id);
                detalleCuentaFiado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleCuentaFiado with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleCuentaFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleCuentaFiado> findDetalleCuentaFiadoEntities() {
        return findDetalleCuentaFiadoEntities(true, -1, -1);
    }

    public List<DetalleCuentaFiado> findDetalleCuentaFiadoEntities(int maxResults, int firstResult) {
        return findDetalleCuentaFiadoEntities(false, maxResults, firstResult);
    }

    private List<DetalleCuentaFiado> findDetalleCuentaFiadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleCuentaFiado.class));
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

    public DetalleCuentaFiado findDetalleCuentaFiado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleCuentaFiado.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleCuentaFiadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleCuentaFiado> rt = cq.from(DetalleCuentaFiado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
