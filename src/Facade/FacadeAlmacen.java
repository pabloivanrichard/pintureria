/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Almacen;
import Entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeAlmacen {
  public List<Almacen> buscarxnombre(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.descripcion LIKE :nomb");
        quTc.setParameter("nomb", "%" + nombre + "%");
        return quTc.getResultList();
    }
   public List<Almacen> buscarxnombre(String nombre,int detaller){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.descripcion LIKE :nomb AND a.producto.detaller =:t");
        quTc.setParameter("nomb", "%" + nombre + "%");
        quTc.setParameter("t",  detaller );
        return quTc.getResultList();
    }
  public List<Almacen> buscarxid(Long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.id  =:nomb");
        quTc.setParameter("nomb",  id );
        return quTc.getResultList();
    }
   public List<Almacen> buscarxlocalizacion(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.localizacion LIKE :nomb");
        quTc.setParameter("nomb", "%" + nombre + "%");
        return quTc.getResultList();
    }  
   
    public List<Almacen> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a");
        return quTc.getResultList();
    }
        public List<Almacen> listar(int detaller){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.detaller =:t");
        quTc.setParameter("t",  detaller );
        return quTc.getResultList();
    }
    
     public List<Almacen> buscarxcod(String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.cod  =:nomb");
        quTc.setParameter("nomb",  cod );
        return quTc.getResultList();
    }
        public List<Almacen> buscarxcod(String cod,int detaller){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.producto.cod  =:nomb AND a.producto.detaller =:t");
        quTc.setParameter("nomb",  cod );
        quTc.setParameter("t",  detaller );
        return quTc.getResultList();
    }
       public List<Almacen> buscaraReponer(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Almacen a WHERE a.cantidad <= a.alerta");
        return quTc.getResultList();
    }
}