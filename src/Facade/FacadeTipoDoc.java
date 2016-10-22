/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Tipo_Cliente;
import Entidades.Tipo_Doc;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeTipoDoc {
    
       public List<Tipo_Doc> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTd = em.createQuery("SELECT td FROM Tipo_Doc td");
        return quTd.getResultList();
    }
     public List<Tipo_Doc> buscarxdescripcion(String des){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT td FROM Tipo_Doc td WHERE td.descripcion =:d");
        quAfiliado.setParameter("d", des);
        return quAfiliado.getResultList();
    }
}
