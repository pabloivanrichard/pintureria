/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Entidades.PersonalizarContrato;
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
public class PersonalizarContratoJpaController implements Serializable {

    public PersonalizarContratoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PersonalizarContrato personalizarContrato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(personalizarContrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PersonalizarContrato personalizarContrato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            personalizarContrato = em.merge(personalizarContrato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = personalizarContrato.getId();
                if (findPersonalizarContrato(id) == null) {
                    throw new NonexistentEntityException("The personalizarContrato with id " + id + " no longer exists.");
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
            PersonalizarContrato personalizarContrato;
            try {
                personalizarContrato = em.getReference(PersonalizarContrato.class, id);
                personalizarContrato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personalizarContrato with id " + id + " no longer exists.", enfe);
            }
            em.remove(personalizarContrato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PersonalizarContrato> findPersonalizarContratoEntities() {
        return findPersonalizarContratoEntities(true, -1, -1);
    }

    public List<PersonalizarContrato> findPersonalizarContratoEntities(int maxResults, int firstResult) {
        return findPersonalizarContratoEntities(false, maxResults, firstResult);
    }

    private List<PersonalizarContrato> findPersonalizarContratoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PersonalizarContrato.class));
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

    public PersonalizarContrato findPersonalizarContrato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PersonalizarContrato.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonalizarContratoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PersonalizarContrato> rt = cq.from(PersonalizarContrato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
