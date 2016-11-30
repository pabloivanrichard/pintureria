/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Cliente;
import Entidades.Mozo;
import Entidades.Tipo_Doc;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeMozo {
      
      public List<Mozo> buscarxdoc(String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c WHERE  AND c.dni=:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", doc);
        return quAfiliado.getResultList();
    }
        public List<Mozo> buscarxId(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c WHERE c.id =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
    
        public List<Mozo> buscarxnombre(String apellido, String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c WHERE c.apellido  LIKE :a AND c.nombre LIKE :n");
        quAfiliado.setParameter("a", "%" + apellido + "%");
        quAfiliado.setParameter("n", "%" + nombre + "%");
        return quAfiliado.getResultList();
    }
        public List<Mozo> buscarxnombre(String apellido){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c WHERE c.apellido LIKE :a");
        quAfiliado.setParameter("a", "%" + apellido + "%");
        return quAfiliado.getResultList();
    }  
        public boolean validarCliente(String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c WHERE  c.dni =:b");
        //quAfiliado.setParameter("a",tipo);
        quAfiliado.setParameter("b",doc);
        List<Cliente> cli=quAfiliado.getResultList();
        if(cli.size()==0){
        return false;
        }else{
        return true;
        }
    }
      public List<Mozo> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Mozo c");
        return quAfiliado.getResultList();
    }     
    
    
}
