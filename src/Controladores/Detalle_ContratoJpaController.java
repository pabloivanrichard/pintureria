/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Detalle_Contrato;
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
public class Detalle_ContratoJpaController implements Serializable {

    public Detalle_ContratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Contrato detalle_Contrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Contrato detalle_Contrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Contrato = em.merge(detalle_Contrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_Contrato.getId();
                if (findDetalle_Contrato(id) == null) {
                    throw new NonexistentEntityException("The detalle_Contrato with id " + id + " no longer exists.");
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
            Detalle_Contrato detalle_Contrato;
            try {
                detalle_Contrato = em.getReference(Detalle_Contrato.class, id);
                detalle_Contrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Contrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Contrato> findDetalle_ContratoEntities() {
        return findDetalle_ContratoEntities(true, -1, -1);
    }

    public List<Detalle_Contrato> findDetalle_ContratoEntities(int maxResults, int firstResult) {
        return findDetalle_ContratoEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Contrato> findDetalle_ContratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Contrato.class));
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

    public Detalle_Contrato findDetalle_Contrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Contrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_ContratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Contrato> rt = cq.from(Detalle_Contrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
