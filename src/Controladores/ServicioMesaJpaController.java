/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.ServicioMesa;
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
public class ServicioMesaJpaController implements Serializable {

    public ServicioMesaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ServicioMesa servicioMesa) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(servicioMesa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ServicioMesa servicioMesa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            servicioMesa = em.merge(servicioMesa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = servicioMesa.getId();
                if (findServicioMesa(id) == null) {
                    throw new NonexistentEntityException("The servicioMesa with id " + id + " no longer exists.");
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
            ServicioMesa servicioMesa;
            try {
                servicioMesa = em.getReference(ServicioMesa.class, id);
                servicioMesa.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicioMesa with id " + id + " no longer exists.", enfe);
            }
            em.remove(servicioMesa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ServicioMesa> findServicioMesaEntities() {
        return findServicioMesaEntities(true, -1, -1);
    }

    public List<ServicioMesa> findServicioMesaEntities(int maxResults, int firstResult) {
        return findServicioMesaEntities(false, maxResults, firstResult);
    }

    private List<ServicioMesa> findServicioMesaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ServicioMesa.class));
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

    public ServicioMesa findServicioMesa(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ServicioMesa.class, id);
        } finally {
            em.close();
        }
    }

    public int getServicioMesaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ServicioMesa> rt = cq.from(ServicioMesa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
