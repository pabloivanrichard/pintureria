/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Cuenta_Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeCuentaCliente {

       public List<Cuenta_Cliente> buscarxdoc(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cuenta_Cliente c WHERE c.cliente.id =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
      public List<Cuenta_Cliente> buscarxcuenta(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cuenta_Cliente c WHERE c.nombre =:nomb");
        quAfiliado.setParameter("nomb",nombre);
        return quAfiliado.getResultList();
    }
      public List<Cuenta_Cliente> buscarxcliente(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cuenta_Cliente c WHERE c.cliente.apellido =:nomb");
        quAfiliado.setParameter("nomb",nombre);
        return quAfiliado.getResultList();
    }
        public List<Cuenta_Cliente> buscarxcliente(String ape, String nombre ){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM Cuenta_Cliente c WHERE c.cliente.nombre =:nomb AND c.cliente.apellido =:ape");
        quAfiliado.setParameter("nomb",nombre);
        quAfiliado.setParameter("ape",ape);
        return quAfiliado.getResultList();
    }
      
}
