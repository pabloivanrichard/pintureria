/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Venta;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeVenta {
    
 public List<Venta> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();      
    
}
  public List<Venta> listarpr(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.anulacion =:a AND v.pagoRegistrado =:pr");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("a", "NO");
        quAfiliado.setParameter("pr", "NO");
        return quAfiliado.getResultList();      
    
}
  public List<Venta> listartodo(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
       
        return quAfiliado.getResultList();      
    
}
   public List<Venta> buscarxFecha(Date fecha){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.fecha =:fec AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();      
    
}
 
      public List<Venta> buscarxDoc(String tipo, String nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.cliente.tipo_doc.descripcion =:tipo AND v.cliente.doc =:doc AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("tipo", tipo);
        quAfiliado.setParameter("doc", nro);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();         
}
         public List<Venta> buscarxDoc(String tipo, String nro,String rp){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.cliente.tipo_doc.descripcion =:tipo AND v.cliente.doc =:doc AND v.anulacion =:a AND v.pagoRegistrado =:pr");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("tipo", tipo);
        quAfiliado.setParameter("doc", nro);
        quAfiliado.setParameter("a", "NO");
        quAfiliado.setParameter("pr", "NO");
        return quAfiliado.getResultList();         
}
        public List<Venta> buscarxDoctodo(String tipo, String nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.cliente.tipo_doc.descripcion =:tipo AND v.cliente.doc =:doc");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("tipo", tipo);
        quAfiliado.setParameter("doc", nro);
        return quAfiliado.getResultList();         
}
      
       public List<Venta> buscarUltima(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v");
        return quAfiliado.getResultList();
}     

        public List<Venta> buscarxId(Long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.id =:id");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("id", id);
        return quAfiliado.getResultList();         
}
        public List<Venta> buscarxFecha(Date fecha, Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.fecha >=:fec AND  v.fecha<=:fec1 AND v.anulacion =:a AND v.pagoRegistrado=:pr");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        quAfiliado.setParameter("pr", "SI");
        return quAfiliado.getResultList();      
    
     }
         public List<Venta> buscarxFechatodo(Date fecha, Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.fecha >=:fec AND  v.fecha<=:fec1");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();      
    
     }
        public List<Venta> buscarxFechatodo(Date fecha){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.fecha =:fec");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
//        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();      
    
}
        //para jimmi
         public List<Venta> buscarxFechajimi(Date fecha, Date fecha1,String desc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Venta v WHERE v.fecha >=:fec AND  v.fecha<=:fec1 AND v.anulacion =:a AND v.pagoRegistrado=:pr AND v.descripcion=:desc");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        quAfiliado.setParameter("pr", "SI");
        quAfiliado.setParameter("desc", desc);
        return quAfiliado.getResultList();      
    
     }
        
}
   
