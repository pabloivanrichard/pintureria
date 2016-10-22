/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.ComprasinStock;
import Entidades.ComprasinStock_;
import Entidades.Contrato;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeComprasinStock {
    
        public List<ComprasinStock> buscarxFecha(Date fecha,Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.fecha >=:fec AND v.fecha <=:fec1 AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        
        public List<ComprasinStock> buscarxId(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.id =:id AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("id", id);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> buscarxFechaProv(Date fecha,Date fecha1,String Provedor){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.fecha >=:fec AND v.fecha <=:fec1 AND v.proveedor.nombre =:p AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("p", Provedor);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> buscarxprovedor(String Provedor){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.proveedor.nombre =:p AND v.anulacion =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("p", Provedor);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM ComprasinStock c WHERE c.anulacion =:a");
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();
    }  
        
         public List<ComprasinStock> buscarxFechae(Date fecha,Date fecha1,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.fecha >=:fec AND v.fecha <=:fec1 AND v.anulacion =:a AND v.cuenta.estado =:e");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("e", estado);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> buscarxFechaProve(Date fecha,Date fecha1,String Provedor,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.fecha >=:fec AND v.fecha <=:fec1 AND v.proveedor.nombre =:p AND v.anulacion =:a AND v.cuenta.estado =:e");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("p", Provedor);
        quAfiliado.setParameter("e", estado);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> buscarxprovedore(String Provedor,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM ComprasinStock v WHERE v.proveedor.nombre =:p AND v.anulacion =:a AND v.cuenta.estado =:e");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("p", Provedor);
        quAfiliado.setParameter("e", estado);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
        public List<ComprasinStock> listare(String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM ComprasinStock c WHERE c.anulacion =:a AND c.cuenta.estado =:e");
        quAfiliado.setParameter("a", "NO");
        quAfiliado.setParameter("e", estado);
        return quAfiliado.getResultList();
    }  
    
}
