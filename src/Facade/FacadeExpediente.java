/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Almacen;
import Entidades.Expediente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Walter
 */
public class FacadeExpediente {
    
    public List<Expediente> buscarXCodigo(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM Expediente a WHERE a.codigo LIKE :nomb");
        quTc.setParameter("nomb", "%" + nombre + "%");
        return quTc.getResultList();
    }
    
}
