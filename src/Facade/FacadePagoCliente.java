/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.PagoCliente;
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
public class FacadePagoCliente {
    
     public List<PagoCliente> buscarxdoc(String tipo, String doc){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT c FROM PagoCliente  c WHERE c.cuenta.cliente.tipo_doc.descripcion=:td AND c.cuenta.cliente.doc=:d");
        quAfiliado.setParameter("td", tipo);
        quAfiliado.setParameter("d", doc);
        return quAfiliado.getResultList();
    }
}
