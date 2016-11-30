/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Mesa;
import Entidades.Mozo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeMesa {
    
     public List<Mesa> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mesa c");
        return quAfiliado.getResultList();
    }
      public List<Mesa> buscarxNroMesa(int nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mesa c WHERE  c.numero =:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", nro);
        return quAfiliado.getResultList();
    }
        public List<Mesa> buscarxEstado(int estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mesa c WHERE  c.cerrado =:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", estado);
        return quAfiliado.getResultList();
    }
    
}
