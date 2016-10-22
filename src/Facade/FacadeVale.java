/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Vale;
import Entidades.Venta;
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
public class FacadeVale {
    
        public List<Vale> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Vale v");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        //quAfiliado.setParameter("a", "NO");
        return quAfiliado.getResultList();          
      }
        public List<Vale> BuscarxFechaeIntegrante(Date fec, Date fec1, String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Vale v WHERE v.fec BETWEEN :fec AND :fec1 AND v.anombre =:nomb");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fec);
        quAfiliado.setParameter("fec1", fec1);
        quAfiliado.setParameter("nomb", nombre);
        return quAfiliado.getResultList();          
      }
        
        public List<Vale> BuscarxFecha(Date fec, Date fec1){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT v FROM Vale v WHERE v.fec BETWEEN :fec AND :fec1");
       // Query quAfiliado = em.createQuery("SELECT a FROM Afiliado a WHERE a.id LIKE:diag");
        quAfiliado.setParameter("fec", fec);
        quAfiliado.setParameter("fec1", fec1);
        return quAfiliado.getResultList();          
      }
    
}
