/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.DetalleTicketCocina;
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
public class DetalleTicketCocinaJpaController implements Serializable {

    public DetalleTicketCocinaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DetalleTicketCocina detalleTicketCocina) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalleTicketCocina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetalleTicketCocina detalleTicketCocina) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalleTicketCocina = em.merge(detalleTicketCocina);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalleTicketCocina.getId();
                if (findDetalleTicketCocina(id) == null) {
                    throw new NonexistentEntityException("The detalleTicketCocina with id " + id + " no longer exists.");
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
            DetalleTicketCocina detalleTicketCocina;
            try {
                detalleTicketCocina = em.getReference(DetalleTicketCocina.class, id);
                detalleTicketCocina.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalleTicketCocina with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalleTicketCocina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetalleTicketCocina> findDetalleTicketCocinaEntities() {
        return findDetalleTicketCocinaEntities(true, -1, -1);
    }

    public List<DetalleTicketCocina> findDetalleTicketCocinaEntities(int maxResults, int firstResult) {
        return findDetalleTicketCocinaEntities(false, maxResults, firstResult);
    }

    private List<DetalleTicketCocina> findDetalleTicketCocinaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DetalleTicketCocina.class));
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

    public DetalleTicketCocina findDetalleTicketCocina(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetalleTicketCocina.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalleTicketCocinaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DetalleTicketCocina> rt = cq.from(DetalleTicketCocina.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
