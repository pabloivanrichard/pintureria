/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Contrato;
import Entidades.Fiado;
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
public class FacadeFiado {
    
      public List<Fiado> buscarxCliente(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.nombrefiador =:c");
        quAfiliado.setParameter("c", nombre);
        return quAfiliado.getResultList();
    }
      
        public List<Fiado> buscarxFecha(Date fec){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.fecha =:c");
        quAfiliado.setParameter("c", fec);
        return quAfiliado.getResultList();
    }
    
        public List<Fiado> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c");
        return quAfiliado.getResultList();
    }
          public List<Fiado> buscarxCliente(String nombre,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.nombrefiador =:c AND c.anulado =:b");
        quAfiliado.setParameter("c", nombre);
        quAfiliado.setParameter("b", anulado);
        return quAfiliado.getResultList();
    }
      
        public List<Fiado> buscarxFecha(Date fec,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.fecha =:c AND c.anulado =:b");
        quAfiliado.setParameter("c", fec);
        quAfiliado.setParameter("b", anulado);
        return quAfiliado.getResultList();
    }
    
        public List<Fiado> listar(String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.anulado =:b");
        quAfiliado.setParameter("b", anulado);
        return quAfiliado.getResultList();
        
    }
        
        public List<Fiado> buscarxFechayCliente(String nombre,Date fec){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.fecha =:c AND c.nombrefiador =:a");
        quAfiliado.setParameter("c", fec);
        quAfiliado.setParameter("a", nombre);
        return quAfiliado.getResultList();
    }
        public List<Fiado> buscarxFechayCliente(String nombre,Date fec,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.fecha =:c AND c.anulado =:b AND c.nombrefiador =:a");
        quAfiliado.setParameter("c", fec);
        quAfiliado.setParameter("b", anulado);
        quAfiliado.setParameter("a", nombre);
        return quAfiliado.getResultList();
    }
        
        public List<Fiado> buscarxClienteEstado(String nombre,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.nombrefiador =:c AND c.estado =:e");
        quAfiliado.setParameter("c", nombre);
         quAfiliado.setParameter("e", estado);
        return quAfiliado.getResultList();
    }
        public List<Fiado> buscarxClienteEstado(String nombre,String estado,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.nombrefiador =:c AND c.estado =:e AND c.anulado =:b");
        quAfiliado.setParameter("c", nombre);
         quAfiliado.setParameter("b", anulado);
         quAfiliado.setParameter("e", estado);
        return quAfiliado.getResultList();
    }
      
        public List<Fiado> buscarxFechaEstado(Date fec,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.fecha =:c AND c.estado =:e");
        quAfiliado.setParameter("c", fec);
         quAfiliado.setParameter("e", estado);
        return quAfiliado.getResultList();
    }
        
         public List<Fiado> buscarxClienteEstadoFecha(String nombre,String estado,String anulado,Date fec){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c WHERE c.nombrefiador =:c AND c.fecha =:fec  AND c.estado =:e AND c.anulado =:b");
        quAfiliado.setParameter("c", nombre);
         quAfiliado.setParameter("b", anulado);
         quAfiliado.setParameter("e", estado);
          quAfiliado.setParameter("fec", fec);
        return quAfiliado.getResultList();
    }
    
        public List<Fiado> listarEstado(String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Fiado c");
         quAfiliado.setParameter("e", estado);
        return quAfiliado.getResultList();
    }
        
        public List<Fiado> buscarxFechas(Date fecha,Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Fiado v WHERE v.fecha >=:fec AND v.fecha <=:fec1 AND v.anulado =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
}
