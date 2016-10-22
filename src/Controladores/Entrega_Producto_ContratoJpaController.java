/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Entrega_Producto_Contrato;
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
public class Entrega_Producto_ContratoJpaController implements Serializable {

    public Entrega_Producto_ContratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Entrega_Producto_Contrato entrega_Producto_Contrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(entrega_Producto_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Entrega_Producto_Contrato entrega_Producto_Contrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            entrega_Producto_Contrato = em.merge(entrega_Producto_Contrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = entrega_Producto_Contrato.getId();
                if (findEntrega_Producto_Contrato(id) == null) {
                    throw new NonexistentEntityException("The entrega_Producto_Contrato with id " + id + " no longer exists.");
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
            Entrega_Producto_Contrato entrega_Producto_Contrato;
            try {
                entrega_Producto_Contrato = em.getReference(Entrega_Producto_Contrato.class, id);
                entrega_Producto_Contrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entrega_Producto_Contrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(entrega_Producto_Contrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Entrega_Producto_Contrato> findEntrega_Producto_ContratoEntities() {
        return findEntrega_Producto_ContratoEntities(true, -1, -1);
    }

    public List<Entrega_Producto_Contrato> findEntrega_Producto_ContratoEntities(int maxResults, int firstResult) {
        return findEntrega_Producto_ContratoEntities(false, maxResults, firstResult);
    }

    private List<Entrega_Producto_Contrato> findEntrega_Producto_ContratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Entrega_Producto_Contrato.class));
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

    public Entrega_Producto_Contrato findEntrega_Producto_Contrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Entrega_Producto_Contrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntrega_Producto_ContratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Entrega_Producto_Contrato> rt = cq.from(Entrega_Producto_Contrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
