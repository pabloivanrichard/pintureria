/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.CodigoBarra;
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
public class FacadeProducto {
public List<Producto> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT p FROM Producto p");
        return quTc.getResultList();
    }
      public List<Producto> buscarxnombre(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT p FROM Producto p WHERE p.descripcion LIKE :nomb");
        quTc.setParameter("nomb", "%" + nombre + "%");
        return quTc.getResultList();
    }
      public List<Producto> buscarxnombre(String nombre,String prov){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT p FROM Producto p WHERE p.descripcion LIKE :nomb AND p.proveedor.nombre=:prov");
        quTc.setParameter("nomb", "%" + nombre + "%");
        quTc.setParameter("prov",prov);
        return quTc.getResultList();
    }
       public List<Producto> buscarxId(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM Producto p WHERE p.id =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
        public List<Producto> buscarxCod(String id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM Producto p WHERE p.cod =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
         public List<Producto> buscarxCod(String id,String prov){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM Producto p WHERE p.cod =:id AND p.proveedor.nombre =:prov");
        quAfiliado.setParameter("id",id);
        quAfiliado.setParameter("prov",prov);
        return quAfiliado.getResultList();
    }
        public List<Producto> buscarxProveedor(String prove){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM Producto p WHERE p.proveedor.nombre =:id");
        quAfiliado.setParameter("id",prove);
        return quAfiliado.getResultList();
    }
        public List<CodigoBarra> buscarxCodbarra(String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM CodigoBarra p WHERE p.cod  =:cod ORDER BY p.num DESC");        
        quAfiliado.setParameter("cod",cod);
        return quAfiliado.getResultList();
    }
    
}
