/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

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
public class FacadeTipoCliente {
    
     public List<Tipo_Cliente> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT tc FROM Tipo_Cliente tc");
        return quTc.getResultList();
    }
       public List<Tipo_Cliente> buscarxdescripcion(String des){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT tc FROM Tipo_Cliente tc WHERE tc.descripcion =:d");
        quAfiliado.setParameter("d", des);
        return quAfiliado.getResultList();
    }
}
