/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Cliente;
import Entidades.Localizacion;
import Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeLocalizacion {
    
    
     public boolean validarLocalizacion(String localizacion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.Descripcion =:a");
        quAfiliado.setParameter("a",localizacion);
        List<Localizacion> cli=quAfiliado.getResultList();
        if(cli.size()==0){
        return false;
        }else{
        return true;
        }
    }
     public List<Localizacion> buscarxdes(String loca){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.Descripcion =:td");
        quAfiliado.setParameter("td", loca);
        return quAfiliado.getResultList();
    }
      public List<Localizacion> buscarxdes(String loca,String idalmacen){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.Descripcion =:td AND c.id_almacen =:id");
        quAfiliado.setParameter("td", loca);
        quAfiliado.setParameter("id", idalmacen);
        return quAfiliado.getResultList();
    }
     public List<Localizacion> buscarxTodo(String loca,String ida,String idp){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.Descripcion =:td AND c.id_almacen =:ida AND c.id_producto =:idp");
        quAfiliado.setParameter("td", loca);
        quAfiliado.setParameter("ida", ida);
        quAfiliado.setParameter("idp", idp);
        return quAfiliado.getResultList();
    }
     public List<Localizacion> buscarxAlmacen(String ida,String idp){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.id_almacen =:ida AND c.id_producto =:idp");
        quAfiliado.setParameter("ida", ida);
        quAfiliado.setParameter("idp", idp);
        return quAfiliado.getResultList();
    }
     
      public List<Localizacion> buscarxAlmance(String id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c WHERE c.id_almacen =:id");
        quAfiliado.setParameter("id", id);
        return quAfiliado.getResultList();
    }
       public List<Localizacion> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Localizacion c");
        return quAfiliado.getResultList();
    } 
         public List<Localizacion> listardistintos(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT DISTINCT c FROM Localizacion c");
        return quAfiliado.getResultList();
    } 
        public List<String> listardistintos1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT DISTINCT c.Descripcion FROM Localizacion c");
        return quAfiliado.getResultList();
    } 
    
        public List<Localizacion> ObtenerID()  {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        List<Localizacion> list = new ArrayList<Localizacion>();
        Query quBuscarAfiliadoPorID = em.createQuery("SELECT a FROM Localizacion a");
     
  
    list=quBuscarAfiliadoPorID.getResultList();   
     if(list.size()>0) {
            return (List<Localizacion>) list;
        } else {
            return null;
        }
  }
}
