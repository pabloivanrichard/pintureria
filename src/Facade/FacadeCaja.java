/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Caja;
import Entidades.Mesa;
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
public class FacadeCaja {
    
     public List<Caja> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Caja c");
        return quAfiliado.getResultList();
    }
      public List<Caja> buscarxid(long nro){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Caja c WHERE  c.id =:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", nro);
        return quAfiliado.getResultList();
    }
        public List<Caja> buscarxEstado(int estado){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Caja c WHERE  c.estado =:d");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", estado);
        return quAfiliado.getResultList();
    }
        public List<Caja> buscarxFecha(Date fec){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Caja c WHERE  c.fecha >=:d AND c.estado=0");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", fec);
        return quAfiliado.getResultList();
    }
        
        public List<Caja> buscarxCajaxhora(Date horaventa){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Caja c WHERE  c.horainicio <=:d AND c.horafin >=:d AND c.estado=1");
        //quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", horaventa);
        return quAfiliado.getResultList();
    }
    
}
