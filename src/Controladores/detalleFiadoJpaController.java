/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.detalleFiado;
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
public class detalleFiadoJpaController implements Serializable {

    public detalleFiadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(detalleFiado detalleFiado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(detalleFiado detalleFiado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleFiado = em.merge(detalleFiado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleFiado.getId();
                if (finddetalleFiado(id) == null) {
                    throw new NonexistentEntityException("The detalleFiado with id " + id + " no longer exists.");
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
            detalleFiado detalleFiado;
            try {
                detalleFiado = em.getReference(detalleFiado.class, id);
                detalleFiado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleFiado with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<detalleFiado> finddetalleFiadoEntities() {
        return finddetalleFiadoEntities(true, -1, -1);
    }

    public List<detalleFiado> finddetalleFiadoEntities(int maxResults, int firstResult) {
        return finddetalleFiadoEntities(false, maxResults, firstResult);
    }

    private List<detalleFiado> finddetalleFiadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(detalleFiado.class));
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

    public detalleFiado finddetalleFiado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(detalleFiado.class, id);
        } finally {
            em.close();
        }
    }

    public int getdetalleFiadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<detalleFiado> rt = cq.from(detalleFiado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
