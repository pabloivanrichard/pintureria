/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Cliente;
import Entidades.Compras;
import Entidades.Contrato;
import Entidades.Factura;
import Entidades.Tipo_Doc;
import java.util.ArrayList;
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
public class FacadeContrato {
    public List<Contrato> ObtenerNroContrato()  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
    EntityManager em = emf.createEntityManager();
    List<Contrato> list = new ArrayList<Contrato>();
    Query quBuscarAfiliadoPorID = em.createQuery("SELECT f FROM Contrato f");
     
  
    list=quBuscarAfiliadoPorID.getResultList();   
     if(list.size()>0) {
            return (List<Contrato>) list;
        } else {
            return null;
     }
      }
        public List<Contrato> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c ORDER BY c.fec_inicio DESC ");
        return quAfiliado.getResultList();
    }   
        public List<Contrato> listarTodos(String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.anulado =:a");
        quAfiliado.setParameter("a", anulado);
        return quAfiliado.getResultList();
    }  
        public List<Contrato> buscarxnroContrato(String nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.nroContrato =:c");
        quAfiliado.setParameter("c", nro);
        return quAfiliado.getResultList();
    }
        
          public List<Contrato> buscarxOrganizacion(long org,String prom){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.organizacion =:org AND c.promo =:p");
        quAfiliado.setParameter("org", org);
        quAfiliado.setParameter("p", prom);
        return quAfiliado.getResultList();
    }
        public List<Contrato> listar(String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.estado =:a");
        quAfiliado.setParameter("a", estado);
        return quAfiliado.getResultList();
    }   
        public List<Contrato> buscarxnroContrato(String nro,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.nroContrato =:c AND c.estado =:a");
        quAfiliado.setParameter("a", estado);
        quAfiliado.setParameter("c", nro);
        return quAfiliado.getResultList();
    }
        
          public List<Contrato> buscarxOrganizacion(long org,String prom,String estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.organizacion =:org AND c.promo =:p AND c.estado =:a");
        quAfiliado.setParameter("org", org);
        quAfiliado.setParameter("p", prom);
        quAfiliado.setParameter("a", estado);
        return quAfiliado.getResultList();
    }
 
          
        public List<Contrato> listaranulado(String estado,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.estado =:a AND c.anulado =:anulado");
        quAfiliado.setParameter("a", estado);
        quAfiliado.setParameter("anulado", anulado);
        return quAfiliado.getResultList();
    }   
        public List<Contrato> buscarxnroContratoanulado(String nro,String estado,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.nroContrato =:c AND c.estado =:a AND c.anulado =:anulado");
        quAfiliado.setParameter("a", estado);
        quAfiliado.setParameter("c", nro);
        quAfiliado.setParameter("anulado", anulado);
        return quAfiliado.getResultList();
    }
        
          public List<Contrato> buscarxOrganizacionanulado(long org,String prom,String estado,String anulado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Contrato c WHERE c.organizacion =:org AND c.promo =:p AND c.estado =:a AND c.anulado =:anulado");
        quAfiliado.setParameter("org", org);
        quAfiliado.setParameter("p", prom);
        quAfiliado.setParameter("a", estado);
        quAfiliado.setParameter("anulado", anulado);
        return quAfiliado.getResultList();
    }
    
        public List<Contrato> buscarxFecha(Date fecha,Date fecha1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Contrato v WHERE v.fec_inicio >=:fec AND v.fec_inicio <=:fec1 AND v.anulado =:a");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fecha);
        quAfiliado.setParameter("fec1", fecha1);
        quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
}
}
