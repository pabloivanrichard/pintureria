/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;


import Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Renzo
 */
public class FacadeUsuario {
    
        public List<Usuario> ObtenerID()  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
    EntityManager em = emf.createEntityManager();
    List<Usuario> list = new ArrayList<Usuario>();
    Query quBuscarAfiliadoPorID = em.createQuery("SELECT a FROM Usuario a");
     
  
    list=quBuscarAfiliadoPorID.getResultList();   
     if(list.size()>0) {
            return (List<Usuario>) list;
        } else {
            return null;
        }
  }
      public List<Usuario> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTd = em.createQuery("SELECT u FROM Usuario u");
        return quTd.getResultList();
    }
        public List<Usuario> CheckUsuario(String nombre, String cont){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTd = em.createQuery("SELECT u FROM Usuario u where u.nombre =:nombre AND u.pass =:cont");
        quTd.setParameter("nombre",nombre);
        quTd.setParameter("cont",cont);
        return quTd.getResultList();
    }
        public List<Usuario> Buscarxnombre(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTd = em.createQuery("SELECT u FROM Usuario u where u.nombre =:nombre");
        quTd.setParameter("nombre",nombre);
        return quTd.getResultList();
    }
        
}
