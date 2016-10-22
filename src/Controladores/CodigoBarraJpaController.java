/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.CodigoBarra;
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
public class CodigoBarraJpaController implements Serializable {

    public CodigoBarraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CodigoBarra codigoBarra) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(codigoBarra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CodigoBarra codigoBarra) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            codigoBarra = em.merge(codigoBarra);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = codigoBarra.getId();
                if (findCodigoBarra(id) == null) {
                    throw new NonexistentEntityException("The codigoBarra with id " + id + " no longer exists.");
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
            CodigoBarra codigoBarra;
            try {
                codigoBarra = em.getReference(CodigoBarra.class, id);
                codigoBarra.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The codigoBarra with id " + id + " no longer exists.", enfe);
            }
            em.remove(codigoBarra);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CodigoBarra> findCodigoBarraEntities() {
        return findCodigoBarraEntities(true, -1, -1);
    }

    public List<CodigoBarra> findCodigoBarraEntities(int maxResults, int firstResult) {
        return findCodigoBarraEntities(false, maxResults, firstResult);
    }

    private List<CodigoBarra> findCodigoBarraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CodigoBarra.class));
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

    public CodigoBarra findCodigoBarra(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CodigoBarra.class, id);
        } finally {
            em.close();
        }
    }

    public int getCodigoBarraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CodigoBarra> rt = cq.from(CodigoBarra.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
