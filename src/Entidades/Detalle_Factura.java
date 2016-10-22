/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author laura
 */
@Entity
public class Detalle_Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    Producto producto;
    ProductoCompuesto productoCompuesto;
    float cantidad;
    float precio;
    long id_factura;
    String pdescripcion;
    
    public Long getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getId_factura() {
        return id_factura;
    }

    public void setId_factura(long id_factura) {
        this.id_factura = id_factura;
    }

    public String getPdescripcion() {
        return pdescripcion;
    }

    public void setPdescripcion(String pdescripcion) {
        this.pdescripcion = pdescripcion;
    }

    public ProductoCompuesto getProductoCompuesto() {
        return productoCompuesto;
    }

    public void setProductoCompuesto(ProductoCompuesto productoCompuesto) {
        this.productoCompuesto = productoCompuesto;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalle_Factura)) {
            return false;
        }
        Detalle_Factura other = (Detalle_Factura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Detalle_Factura[ id=" + id + " ]";
    }
    
}
