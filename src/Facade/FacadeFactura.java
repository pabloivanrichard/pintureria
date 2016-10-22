/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Factura;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author laura
 */
public class FacadeFactura {
    
      public List<Factura> ObtenerID()  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
    EntityManager em = emf.createEntityManager();
    List<Factura> list = new ArrayList<Factura>();
    Query quBuscarAfiliadoPorID = em.createQuery("SELECT f FROM Factura f");
     
  
    list=quBuscarAfiliadoPorID.getResultList();   
     if(list.size()>0) {
            return (List<Factura>) list;
        } else {
            return null;
     }
      }
    
}
