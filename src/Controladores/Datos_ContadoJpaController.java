/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Datos_Contado;
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
public class Datos_ContadoJpaController implements Serializable {

    public Datos_ContadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Datos_Contado datos_Contado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos_Contado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Datos_Contado datos_Contado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_Contado = em.merge(datos_Contado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = datos_Contado.getId();
                if (findDatos_Contado(id) == null) {
                    throw new NonexistentEntityException("The datos_Contado with id " + id + " no longer exists.");
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
            Datos_Contado datos_Contado;
            try {
                datos_Contado = em.getReference(Datos_Contado.class, id);
                datos_Contado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datos_Contado with id " + id + " no longer exists.", enfe);
            }
            em.remove(datos_Contado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Datos_Contado> findDatos_ContadoEntities() {
        return findDatos_ContadoEntities(true, -1, -1);
    }

    public List<Datos_Contado> findDatos_ContadoEntities(int maxResults, int firstResult) {
        return findDatos_ContadoEntities(false, maxResults, firstResult);
    }

    private List<Datos_Contado> findDatos_ContadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Datos_Contado.class));
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

    public Datos_Contado findDatos_Contado(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Datos_Contado.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatos_ContadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Datos_Contado> rt = cq.from(Datos_Contado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
