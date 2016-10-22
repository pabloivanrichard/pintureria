/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.Cuenta_Proveedor;
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
public class Cuenta_ProveedorJpaController implements Serializable {

    public Cuenta_ProveedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuenta_Proveedor cuenta_Proveedor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuenta_Proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuenta_Proveedor cuenta_Proveedor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuenta_Proveedor = em.merge(cuenta_Proveedor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cuenta_Proveedor.getId();
                if (findCuenta_Proveedor(id) == null) {
                    throw new NonexistentEntityException("The cuenta_Proveedor with id " + id + " no longer exists.");
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
            Cuenta_Proveedor cuenta_Proveedor;
            try {
                cuenta_Proveedor = em.getReference(Cuenta_Proveedor.class, id);
                cuenta_Proveedor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuenta_Proveedor with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuenta_Proveedor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuenta_Proveedor> findCuenta_ProveedorEntities() {
        return findCuenta_ProveedorEntities(true, -1, -1);
    }

    public List<Cuenta_Proveedor> findCuenta_ProveedorEntities(int maxResults, int firstResult) {
        return findCuenta_ProveedorEntities(false, maxResults, firstResult);
    }

    private List<Cuenta_Proveedor> findCuenta_ProveedorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuenta_Proveedor.class));
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

    public Cuenta_Proveedor findCuenta_Proveedor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuenta_Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuenta_ProveedorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuenta_Proveedor> rt = cq.from(Cuenta_Proveedor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
