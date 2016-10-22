/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Cliente;
import Entidades.Tipo_Doc;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeCliente {
    
      public List<Cliente> buscarxdoc(Tipo_Doc tipo, String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c WHERE c.tipo_doc =:td AND c.doc=:d");
        quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", doc);
        return quAfiliado.getResultList();
    }
        public List<Cliente> buscarxId(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c WHERE c.id =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
    
        public List<Cliente> buscarxnombre(String apellido, String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido  LIKE :a AND c.nombre LIKE :n");
        quAfiliado.setParameter("a", "%" + apellido + "%");
        quAfiliado.setParameter("n", "%" + nombre + "%");
        return quAfiliado.getResultList();
    }
        public List<Cliente> buscarxnombre(String apellido){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido LIKE :a");
        quAfiliado.setParameter("a", "%" + apellido + "%");
        return quAfiliado.getResultList();
    }  
        public boolean validarCliente(String tipo, String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c WHERE c.tipo_doc.descripcion =:a AND c.doc =:b");
        quAfiliado.setParameter("a",tipo);
        quAfiliado.setParameter("b",doc);
        List<Cliente> cli=quAfiliado.getResultList();
        if(cli.size()==0){
        return false;
        }else{
        return true;
        }
    }
      public List<Cliente> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cliente c");
        return quAfiliado.getResultList();
    }   
        

}
