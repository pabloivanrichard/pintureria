/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author laura
 */
@Entity
public class Compras implements Serializable {
    @OneToMany(mappedBy = "compra")
    private List<Detalle_Cuenta_Proveedor> detalle_Cuenta_Proveedors;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha;
    float precio_totol;
    @OneToOne
    Proveedor proveedor;  
    @OneToMany(cascade = CascadeType.ALL)
    List<Detalle_Compra> detalle_compra;
    String anulacion;
    @OneToOne
    Usuario usu;

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnulacion() {
        return anulacion;
    }

    public void setAnulacion(String anulacion) {
        this.anulacion = anulacion;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecio_totol() {
        return precio_totol;
    }

    public void setPrecio_totol(float precio_totol) {
        this.precio_totol = precio_totol;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Detalle_Compra> getDetalle_compra() {
        return detalle_compra;
    }

    public void setDetalle_compra(List<Detalle_Compra> detalle_compra) {
        this.detalle_compra = detalle_compra;
    }

    public List<Detalle_Cuenta_Proveedor> getDetalle_Cuenta_Proveedors() {
        return detalle_Cuenta_Proveedors;
    }

    public void setDetalle_Cuenta_Proveedors(List<Detalle_Cuenta_Proveedor> detalle_Cuenta_Proveedors) {
        this.detalle_Cuenta_Proveedors = detalle_Cuenta_Proveedors;
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
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Compras[ id=" + id + " ]";
    }
    
}
