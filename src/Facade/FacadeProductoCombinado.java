/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import Entidades.Almacen;
import Entidades.Producto;
import Entidades.ProductoCompuesto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo
 */
public class FacadeProductoCombinado {
    
    public List<ProductoCompuesto> listar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT a FROM ProductoCompuesto a");
        return quTc.getResultList();
    }
    
        public List<ProductoCompuesto> buscarxDescripcion(String nombre){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quTc = em.createQuery("SELECT p FROM ProductoCompuesto p WHERE p.descripcion LIKE :nomb");
        quTc.setParameter("nomb", "%" + nombre + "%");
        return quTc.getResultList();
        }
        
        public List<ProductoCompuesto> buscarxCod(long id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pintureriaPU");
        EntityManager em = emf.createEntityManager();
        Query quAfiliado = em.createQuery("SELECT p FROM ProductoCompuesto p WHERE p.id =:id");
        quAfiliado.setParameter("id",id);
        return quAfiliado.getResultList();
    }
    
}
