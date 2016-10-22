/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Almacen;
import Entidades.Alumno;
import Entidades.Organizacion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeAlumno {
      public List<Alumno> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Alumno c");
        return quAfiliado.getResultList();
    }
      
      public List<Alumno> buscarxNombre(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Alumno c WHERE c.nombre  LIKE :a");
       quAfiliado.setParameter("a", "%" + nombre + "%");      
        return quAfiliado.getResultList();
    }
        public List<Alumno> buscarxAlumno(String nombre,String apellido){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Alumno c WHERE c.nombre  LIKE :a AND c.apellido LIKE :b");
       quAfiliado.setParameter("a", "%" + nombre + "%");
       quAfiliado.setParameter("b", "%" + apellido + "%");
        return quAfiliado.getResultList();
    }
        
        public List<Alumno> buscarxApellido(String apellido){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
       Query quAfiliado = em.createQuery("SELECT c FROM Alumno c WHERE c.apellido LIKE :b");
       quAfiliado.setParameter("b", "%" + apellido + "%");
        return quAfiliado.getResultList();
    }
      
       public List<Alumno> buscarxOrgProm(Long idorg,String promo){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.org.id  =:id AND a.promocion =:p");
        quTc.setParameter("id",  idorg );
        quTc.setParameter("p", promo );
        return quTc.getResultList();
    }
        public List<Alumno> buscarxDoc(String tipodoc,String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.tipodoc  =:td AND a.dni =:d");
        quTc.setParameter("td",tipodoc);
        quTc.setParameter("d", doc);
        return quTc.getResultList();
    }
 
        public List<Alumno> buscarxOrgtodo(String nombre,String anio,String div){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.org.nombre =:nombre AND a.org.anio =:a AND a.org.division =:d");
        quTc.setParameter("nombre",  nombre );
        quTc.setParameter("a", div );
        quTc.setParameter("d", anio );
        return quTc.getResultList();
    }
        public List<Alumno> buscarxOrgAnio(String nombre,String anio){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.org.nombre =:nombre AND a.org.anio =:a");
        quTc.setParameter("nombre",  nombre );
        quTc.setParameter("d", anio );
        return quTc.getResultList();
    }
        public List<Alumno> buscarxOrgDiv(String nombre,String div){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.org.nombre =:nombre AND a.org.division =:d");
        quTc.setParameter("nombre",  nombre );
        quTc.setParameter("a", div );
        return quTc.getResultList();
    }
    
        public List<Alumno> buscarxOrgPromDoc(Long idorg,String promo,String tipo,String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Alumno a WHERE a.org.id  =:id AND a.promocion =:p AND a.tipodoc =:td AND a.dni =:d");
        quTc.setParameter("id",  idorg );
        quTc.setParameter("p", promo );
        quTc.setParameter("td",tipo);
        quTc.setParameter("d", doc);
        return quTc.getResultList();
    }
}
