/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Cliente;
import Entidades.Organizacion;
import Entidades.Tipo_Doc;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeOrganizacion {
    
      public List<Organizacion> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Organizacion c");
        return quAfiliado.getResultList();
    }
      
      public List<Organizacion> buscarxOrg(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Organizacion c WHERE c.nombre  LIKE :a");
       quAfiliado.setParameter("a", "%" + nombre + "%");      
        return quAfiliado.getResultList();
    }
      public List<Organizacion> buscarxOrgDivAnio(String nombre,String division,String anio){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Organizacion c WHERE c.nombre  LIKE :a AND c.division =:b AND c.anio =:c");
       quAfiliado.setParameter("a", "%" + nombre + "%");
       quAfiliado.setParameter("b",  division );
       quAfiliado.setParameter("c",  anio );
        return quAfiliado.getResultList();
    } 
      public List<Organizacion> buscarxOrgDiv(String nombre,String division){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Organizacion c WHERE c.nombre  LIKE :a AND c.division =:b");
       quAfiliado.setParameter("a", "%" + nombre + "%");
       quAfiliado.setParameter("b",  division );
        return quAfiliado.getResultList();
    }
      public List<Organizacion> buscarxOrgAnio(String nombre,String anio){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Organizacion c WHERE c.nombre  LIKE :a AND c.anio =:c");
       quAfiliado.setParameter("a", "%" + nombre + "%");
       quAfiliado.setParameter("c",  anio );
        return quAfiliado.getResultList();
    } 
    
}
