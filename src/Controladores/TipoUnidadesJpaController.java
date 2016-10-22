/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.TipoUnidades;
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
public class TipoUnidadesJpaController implements Serializable {

    public TipoUnidadesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoUnidades tipoUnidades) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoUnidades);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoUnidades tipoUnidades) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoUnidades = em.merge(tipoUnidades);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipoUnidades.getId();
                if (findTipoUnidades(id) == null) {
                    throw new NonexistentEntityException("The tipoUnidades with id " + id + " no longer exists.");
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
            TipoUnidades tipoUnidades;
            try {
                tipoUnidades = em.getReference(TipoUnidades.class, id);
                tipoUnidades.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoUnidades with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoUnidades);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoUnidades> findTipoUnidadesEntities() {
        return findTipoUnidadesEntities(true, -1, -1);
    }

    public List<TipoUnidades> findTipoUnidadesEntities(int maxResults, int firstResult) {
        return findTipoUnidadesEntities(false, maxResults, firstResult);
    }

    private List<TipoUnidades> findTipoUnidadesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoUnidades.class));
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

    public TipoUnidades findTipoUnidades(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoUnidades.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoUnidadesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoUnidades> rt = cq.from(TipoUnidades.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
