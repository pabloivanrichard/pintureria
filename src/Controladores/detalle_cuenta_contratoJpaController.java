/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.detalle_cuenta_contrato;
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
public class detalle_cuenta_contratoJpaController implements Serializable {

    public detalle_cuenta_contratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(detalle_cuenta_contrato detalle_cuenta_contrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_cuenta_contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(detalle_cuenta_contrato detalle_cuenta_contrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_cuenta_contrato = em.merge(detalle_cuenta_contrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = detalle_cuenta_contrato.getId();
                if (finddetalle_cuenta_contrato(id) == null) {
                    throw new NonexistentEntityException("The detalle_cuenta_contrato with id " + id + " no longer exists.");
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
            detalle_cuenta_contrato detalle_cuenta_contrato;
            try {
                detalle_cuenta_contrato = em.getReference(detalle_cuenta_contrato.class, id);
                detalle_cuenta_contrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_cuenta_contrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_cuenta_contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<detalle_cuenta_contrato> finddetalle_cuenta_contratoEntities() {
        return finddetalle_cuenta_contratoEntities(true, -1, -1);
    }

    public List<detalle_cuenta_contrato> finddetalle_cuenta_contratoEntities(int maxResults, int firstResult) {
        return finddetalle_cuenta_contratoEntities(false, maxResults, firstResult);
    }

    private List<detalle_cuenta_contrato> finddetalle_cuenta_contratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(detalle_cuenta_contrato.class));
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

    public detalle_cuenta_contrato finddetalle_cuenta_contrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(detalle_cuenta_contrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getdetalle_cuenta_contratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<detalle_cuenta_contrato> rt = cq.from(detalle_cuenta_contrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
