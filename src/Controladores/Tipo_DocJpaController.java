/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Tipo_Doc;
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
public class Tipo_DocJpaController implements Serializable {

    public Tipo_DocJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_Doc tipo_Doc) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipo_Doc);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_Doc tipo_Doc) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipo_Doc = em.merge(tipo_Doc);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipo_Doc.getId();
                if (findTipo_Doc(id) == null) {
                    throw new NonexistentEntityException("The tipo_Doc with id " + id + " no longer exists.");
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
            Tipo_Doc tipo_Doc;
            try {
                tipo_Doc = em.getReference(Tipo_Doc.class, id);
                tipo_Doc.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_Doc with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipo_Doc);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_Doc> findTipo_DocEntities() {
        return findTipo_DocEntities(true, -1, -1);
    }

    public List<Tipo_Doc> findTipo_DocEntities(int maxResults, int firstResult) {
        return findTipo_DocEntities(false, maxResults, firstResult);
    }

    private List<Tipo_Doc> findTipo_DocEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_Doc.class));
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

    public Tipo_Doc findTipo_Doc(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_Doc.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_DocCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_Doc> rt = cq.from(Tipo_Doc.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
