/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author laura
 */
@Entity
public class Datos_Cuenta_Corriente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    int nro_cuota;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_pago;
    float monto_cuota;
    String estado;
    float entrega;
    int cantidad_cuotas;
    
    //para leyendas de las pantallas cuenta corriente
    String descrip;
    String descrip_deuda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getCantidad_cuotas() {
        return cantidad_cuotas;
    }

    public void setCantidad_cuotas(int cantidad_cuotas) {
        this.cantidad_cuotas = cantidad_cuotas;
    }

    
    public int getNro_cuota() {
        return nro_cuota;
    }

    public void setNro_cuota(int nro_cuota) {
        this.nro_cuota = nro_cuota;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public float getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(float monto_cuota) {
        this.monto_cuota = monto_cuota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getEntrega() {
        return entrega;
    }

    public void setEntrega(float entrega) {
        this.entrega = entrega;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDescrip_deuda() {
        return descrip_deuda;
    }

    public void setDescrip_deuda(String descrip_deuda) {
        this.descrip_deuda = descrip_deuda;
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
        if (!(object instanceof Datos_Cuenta_Corriente)) {
            return false;
        }
        Datos_Cuenta_Corriente other = (Datos_Cuenta_Corriente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Datos_Cuenta_Corriente[ id=" + id + " ]";
    }
    
}
