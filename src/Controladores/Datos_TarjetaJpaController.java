/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Datos_Tarjeta;
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
public class Datos_TarjetaJpaController implements Serializable {

    public Datos_TarjetaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Datos_Tarjeta datos_Tarjeta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos_Tarjeta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Datos_Tarjeta datos_Tarjeta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_Tarjeta = em.merge(datos_Tarjeta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = datos_Tarjeta.getId();
                if (findDatos_Tarjeta(id) == null) {
                    throw new NonexistentEntityException("The datos_Tarjeta with id " + id + " no longer exists.");
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
            Datos_Tarjeta datos_Tarjeta;
            try {
                datos_Tarjeta = em.getReference(Datos_Tarjeta.class, id);
                datos_Tarjeta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datos_Tarjeta with id " + id + " no longer exists.", enfe);
            }
            em.remove(datos_Tarjeta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Datos_Tarjeta> findDatos_TarjetaEntities() {
        return findDatos_TarjetaEntities(true, -1, -1);
    }

    public List<Datos_Tarjeta> findDatos_TarjetaEntities(int maxResults, int firstResult) {
        return findDatos_TarjetaEntities(false, maxResults, firstResult);
    }

    private List<Datos_Tarjeta> findDatos_TarjetaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Datos_Tarjeta.class));
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

    public Datos_Tarjeta findDatos_Tarjeta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Datos_Tarjeta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatos_TarjetaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Datos_Tarjeta> rt = cq.from(Datos_Tarjeta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
