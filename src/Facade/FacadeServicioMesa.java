/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Mesa;
import Entidades.ServicioMesa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeServicioMesa {
    
        public List<ServicioMesa> buscarxNroMesa(String nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM ServicioMesa c WHERE c.mesa =:d AND c.fin IS NULL");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", nro);
        return quAfiliado.getResultList();
    }
        public List<ServicioMesa> buscarxId(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM ServicioMesa c WHERE c.id =:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", id);
        return quAfiliado.getResultList();
    }
    
}
