/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author laura
 */
@Entity
public class Precio implements Serializable {
    @OneToOne(mappedBy = "precio")
    private Producto producto;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    float precio_real;
    float precio_contado;
  //  float precio_manual;
    @OneToMany
    List<Tarjeta> tarjeta;
    
            
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getPrecio_real() {
        return precio_real;
    }

    public void setPrecio_real(float precio_real) {
        this.precio_real = precio_real;
    }

    public float getPrecio_contado() {
        return precio_contado;
    }

    public void setPrecio_contado(float precio_contado) {
        this.precio_contado = precio_contado;
    }

    public List<Tarjeta> getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(List<Tarjeta> tarjeta) {
        this.tarjeta = tarjeta;
    }
/*
    public float getPrecio_manual() {
        return precio_manual;
    }

    public void setPrecio_manual(float precio_manual) {
        this.precio_manual = precio_manual;
    }

  */
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Precio)) {
            return false;
        }
        Precio other = (Precio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Precio[ id=" + id + " ]";
    }
    
}
