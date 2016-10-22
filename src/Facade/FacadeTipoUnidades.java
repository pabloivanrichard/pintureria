/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Proveedor;
import Entidades.TipoUnidades;
import Entidades.Tipo_Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeTipoUnidades {
    public List<TipoUnidades> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT tu FROM TipoUnidades tu");
        return quTc.getResultList();
    } 
     public List<TipoUnidades> buscarxnombre(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT p FROM TipoUnidades p WHERE p.descripcion =:nomb");
        quTc.setParameter("nomb",nombre);
        return quTc.getResultList();
    }
    
}
