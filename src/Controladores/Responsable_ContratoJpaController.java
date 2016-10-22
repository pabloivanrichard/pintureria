/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Responsable_Contrato;
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
public class Responsable_ContratoJpaController implements Serializable {

    public Responsable_ContratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Responsable_Contrato responsable_Contrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(responsable_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Responsable_Contrato responsable_Contrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            responsable_Contrato = em.merge(responsable_Contrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = responsable_Contrato.getId();
                if (findResponsable_Contrato(id) == null) {
                    throw new NonexistentEntityException("The responsable_Contrato with id " + id + " no longer exists.");
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
            Responsable_Contrato responsable_Contrato;
            try {
                responsable_Contrato = em.getReference(Responsable_Contrato.class, id);
                responsable_Contrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The responsable_Contrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(responsable_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Responsable_Contrato> findResponsable_ContratoEntities() {
        return findResponsable_ContratoEntities(true, -1, -1);
    }

    public List<Responsable_Contrato> findResponsable_ContratoEntities(int maxResults, int firstResult) {
        return findResponsable_ContratoEntities(false, maxResults, firstResult);
    }

    private List<Responsable_Contrato> findResponsable_ContratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Responsable_Contrato.class));
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

    public Responsable_Contrato findResponsable_Contrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Responsable_Contrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getResponsable_ContratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Responsable_Contrato> rt = cq.from(Responsable_Contrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
