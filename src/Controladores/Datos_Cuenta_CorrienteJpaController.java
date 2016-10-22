/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Datos_Cuenta_Corriente;
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
public class Datos_Cuenta_CorrienteJpaController implements Serializable {

    public Datos_Cuenta_CorrienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Datos_Cuenta_Corriente datos_Cuenta_Corriente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos_Cuenta_Corriente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Datos_Cuenta_Corriente datos_Cuenta_Corriente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_Cuenta_Corriente = em.merge(datos_Cuenta_Corriente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = datos_Cuenta_Corriente.getId();
                if (findDatos_Cuenta_Corriente(id) == null) {
                    throw new NonexistentEntityException("The datos_Cuenta_Corriente with id " + id + " no longer exists.");
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
            Datos_Cuenta_Corriente datos_Cuenta_Corriente;
            try {
                datos_Cuenta_Corriente = em.getReference(Datos_Cuenta_Corriente.class, id);
                datos_Cuenta_Corriente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datos_Cuenta_Corriente with id " + id + " no longer exists.", enfe);
            }
            em.remove(datos_Cuenta_Corriente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Datos_Cuenta_Corriente> findDatos_Cuenta_CorrienteEntities() {
        return findDatos_Cuenta_CorrienteEntities(true, -1, -1);
    }

    public List<Datos_Cuenta_Corriente> findDatos_Cuenta_CorrienteEntities(int maxResults, int firstResult) {
        return findDatos_Cuenta_CorrienteEntities(false, maxResults, firstResult);
    }

    private List<Datos_Cuenta_Corriente> findDatos_Cuenta_CorrienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Datos_Cuenta_Corriente.class));
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

    public Datos_Cuenta_Corriente findDatos_Cuenta_Corriente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Datos_Cuenta_Corriente.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatos_Cuenta_CorrienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Datos_Cuenta_Corriente> rt = cq.from(Datos_Cuenta_Corriente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
