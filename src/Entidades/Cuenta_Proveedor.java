/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.eclipse.persistence.jpa.config.Cascade;

/**
 *
 * @author laura
 */
@Entity
public class Cuenta_Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    Proveedor proveedor;
    @OneToMany (cascade = CascadeType.ALL)
    List<Detalle_Cuenta_Proveedor> detalle;
    @OneToMany
    List<Compras> compra;
    String estado;
    float total_cuenta;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Detalle_Cuenta_Proveedor> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle_Cuenta_Proveedor> detalle) {
        this.detalle = detalle;
    }

    public List<Compras> getCompra() {
        return compra;
    }

    public void setCompra(List<Compras> compra) {
        this.compra = compra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getTotal_cuenta() {
        return total_cuenta;
    }

    public void setTotal_cuenta(float total_cuenta) {
        this.total_cuenta = total_cuenta;
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
        if (!(object instanceof Cuenta_Proveedor)) {
            return false;
        }
        Cuenta_Proveedor other = (Cuenta_Proveedor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cuenta_Proveedor[ id=" + id + " ]";
    }
    
}
