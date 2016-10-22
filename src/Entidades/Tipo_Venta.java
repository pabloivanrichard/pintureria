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

/**
 *
 * @author laura
 */
@Entity
public class Tipo_Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String tipo;
    int cant_cuotas;
    int descuento;
    @OneToOne
    Tarjeta tajeta;
    float anticipo;
    @OneToMany(cascade = CascadeType.ALL)
    List<Detalle_tipo_venta> detalleTipoVenta;
    @OneToOne(cascade = CascadeType.ALL)
    Tipo_Pago tipo_pago;

    public Tipo_Pago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(Tipo_Pago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }
    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCant_cuotas() {
        return cant_cuotas;
    }

    public void setCant_cuotas(int cant_cuotas) {
        this.cant_cuotas = cant_cuotas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Tarjeta getTajeta() {
        return tajeta;
    }

    public void setTajeta(Tarjeta tajeta) {
        this.tajeta = tajeta;
    }

    public float getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    public List<Detalle_tipo_venta> getDetalleTipoVenta() {
        return detalleTipoVenta;
    }

    public void setDetalleTipoVenta(List<Detalle_tipo_venta> detalleTipoVenta) {
        this.detalleTipoVenta = detalleTipoVenta;
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
        if (!(object instanceof Tipo_Venta)) {
            return false;
        }
        Tipo_Venta other = (Tipo_Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipo_Venta[ id=" + id + " ]";
    }
    
}
