/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.TicketCocina;
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
public class TicketCocinaJpaController implements Serializable {

    public TicketCocinaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TicketCocina ticketCocina) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ticketCocina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TicketCocina ticketCocina) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ticketCocina = em.merge(ticketCocina);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = ticketCocina.getId();
                if (findTicketCocina(id) == null) {
                    throw new NonexistentEntityException("The ticketCocina with id " + id + " no longer exists.");
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
            TicketCocina ticketCocina;
            try {
                ticketCocina = em.getReference(TicketCocina.class, id);
                ticketCocina.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ticketCocina with id " + id + " no longer exists.", enfe);
            }
            em.remove(ticketCocina);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TicketCocina> findTicketCocinaEntities() {
        return findTicketCocinaEntities(true, -1, -1);
    }

    public List<TicketCocina> findTicketCocinaEntities(int maxResults, int firstResult) {
        return findTicketCocinaEntities(false, maxResults, firstResult);
    }

    private List<TicketCocina> findTicketCocinaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TicketCocina.class));
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

    public TicketCocina findTicketCocina(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TicketCocina.class, id);
        } finally {
            em.close();
        }
    }

    public int getTicketCocinaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TicketCocina> rt = cq.from(TicketCocina.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
