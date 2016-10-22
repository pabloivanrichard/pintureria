/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Cliente;
import Entidades.Cuenta_Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Pablo
 */
public class Cuenta_ClienteJpaController implements Serializable {

    public Cuenta_ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuenta_Cliente cuenta_Cliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = cuenta_Cliente.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                cuenta_Cliente.setCliente(cliente);
            }
            em.persist(cuenta_Cliente);
            if (cliente != null) {
                Cuenta_Cliente oldCuentaOfCliente = cliente.getCuenta();
                if (oldCuentaOfCliente != null) {
                    oldCuentaOfCliente.setCliente(null);
                    oldCuentaOfCliente = em.merge(oldCuentaOfCliente);
                }
                cliente.setCuenta(cuenta_Cliente);
                cliente = em.merge(cliente);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuenta_Cliente cuenta_Cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuenta_Cliente persistentCuenta_Cliente = em.find(Cuenta_Cliente.class, cuenta_Cliente.getId());
            Cliente clienteOld = persistentCuenta_Cliente.getCliente();
            Cliente clienteNew = cuenta_Cliente.getCliente();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                cuenta_Cliente.setCliente(clienteNew);
            }
            cuenta_Cliente = em.merge(cuenta_Cliente);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.setCuenta(null);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                Cuenta_Cliente oldCuentaOfCliente = clienteNew.getCuenta();
                if (oldCuentaOfCliente != null) {
                    oldCuentaOfCliente.setCliente(null);
                    oldCuentaOfCliente = em.merge(oldCuentaOfCliente);
                }
                clienteNew.setCuenta(cuenta_Cliente);
                clienteNew = em.merge(clienteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cuenta_Cliente.getId();
                if (findCuenta_Cliente(id) == null) {
                    throw new NonexistentEntityException("The cuenta_Cliente with id " + id + " no longer exists.");
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
            Cuenta_Cliente cuenta_Cliente;
            try {
                cuenta_Cliente = em.getReference(Cuenta_Cliente.class, id);
                cuenta_Cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuenta_Cliente with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = cuenta_Cliente.getCliente();
            if (cliente != null) {
                cliente.setCuenta(null);
                cliente = em.merge(cliente);
            }
            em.remove(cuenta_Cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuenta_Cliente> findCuenta_ClienteEntities() {
        return findCuenta_ClienteEntities(true, -1, -1);
    }

    public List<Cuenta_Cliente> findCuenta_ClienteEntities(int maxResults, int firstResult) {
        return findCuenta_ClienteEntities(false, maxResults, firstResult);
    }

    private List<Cuenta_Cliente> findCuenta_ClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuenta_Cliente.class));
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

    public Cuenta_Cliente findCuenta_Cliente(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuenta_Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuenta_ClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuenta_Cliente> rt = cq.from(Cuenta_Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
