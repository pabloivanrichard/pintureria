/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.cuenta_contrato;
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
public class cuenta_contratoJpaController implements Serializable {

    public cuenta_contratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(cuenta_contrato cuenta_contrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuenta_contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(cuenta_contrato cuenta_contrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuenta_contrato = em.merge(cuenta_contrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cuenta_contrato.getId();
                if (findcuenta_contrato(id) == null) {
                    throw new NonexistentEntityException("The cuenta_contrato with id " + id + " no longer exists.");
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
            cuenta_contrato cuenta_contrato;
            try {
                cuenta_contrato = em.getReference(cuenta_contrato.class, id);
                cuenta_contrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuenta_contrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuenta_contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<cuenta_contrato> findcuenta_contratoEntities() {
        return findcuenta_contratoEntities(true, -1, -1);
    }

    public List<cuenta_contrato> findcuenta_contratoEntities(int maxResults, int firstResult) {
        return findcuenta_contratoEntities(false, maxResults, firstResult);
    }

    private List<cuenta_contrato> findcuenta_contratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(cuenta_contrato.class));
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

    public cuenta_contrato findcuenta_contrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(cuenta_contrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getcuenta_contratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<cuenta_contrato> rt = cq.from(cuenta_contrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
