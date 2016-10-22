/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.CuentaFiado;
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
public class CuentaFiadoJpaController implements Serializable {

    public CuentaFiadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CuentaFiado cuentaFiado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuentaFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CuentaFiado cuentaFiado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuentaFiado = em.merge(cuentaFiado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cuentaFiado.getId();
                if (findCuentaFiado(id) == null) {
                    throw new NonexistentEntityException("The cuentaFiado with id " + id + " no longer exists.");
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
            CuentaFiado cuentaFiado;
            try {
                cuentaFiado = em.getReference(CuentaFiado.class, id);
                cuentaFiado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuentaFiado with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuentaFiado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CuentaFiado> findCuentaFiadoEntities() {
        return findCuentaFiadoEntities(true, -1, -1);
    }

    public List<CuentaFiado> findCuentaFiadoEntities(int maxResults, int firstResult) {
        return findCuentaFiadoEntities(false, maxResults, firstResult);
    }

    private List<CuentaFiado> findCuentaFiadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CuentaFiado.class));
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

    public CuentaFiado findCuentaFiado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CuentaFiado.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuentaFiadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CuentaFiado> rt = cq.from(CuentaFiado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
