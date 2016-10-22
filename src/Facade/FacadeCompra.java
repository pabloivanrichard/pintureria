/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Compras;
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
public class FacadeCompra {
   
     public List<Compras> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
    
    public List<Compras> buscarxFecha(Date fecha){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.fecha =:fec AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
      public List<Compras> buscarxFechatodo(Date fecha){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.fecha =:fec");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        return quAfiliado.getResultList();          
}
       public List<Compras> buscarxProveedor(String prov){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
         public List<Compras> buscarxProveedortodo(String prov){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        return quAfiliado.getResultList();          
}
       public List<Compras> buscarxProveedorxcod(String prov,String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.cod=:cod AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("cod", cod);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<Compras> buscarxProveedorxcodtodo(String prov,String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.cod=:cod");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("cod", cod);
        return quAfiliado.getResultList();          
}
        public List<Compras> buscarxProveedorxprod(String prov,String prod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.descripcion:des AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("des", prod);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<Compras> buscarxProveedorxprodtodo(String prov,String prod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.descripcion:des");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("des", prod);
        return quAfiliado.getResultList();          
}
        public List<Compras> buscarxProveedorxTodo(String prov,String prod,String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.descripcion:des AND v.proveedor.producto.cod=:cod AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("des", prod);
        quAfiliado.setParameter("des", cod);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<Compras> buscarxProveedorxTodot(String prov,String prod,String cod){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.proveedor.nombre =:prov AND v.proveedor.producto.descripcion:des AND v.proveedor.producto.cod=:cod");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("prov", prov);
        quAfiliado.setParameter("des", prod);
        quAfiliado.setParameter("des", cod);
        return quAfiliado.getResultList();          
}
         public List<Compras> buscarxFecha(Date fecha,Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Compras v WHERE v.fecha >=:fec AND v.fecha<=:fec1 AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
    
}
