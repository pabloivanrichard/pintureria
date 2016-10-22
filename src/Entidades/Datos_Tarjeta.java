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
public class Datos_Tarjeta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    Tarjeta tarjeta;
    String titular;
    int nro_tarjeta;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_vencimiento;
    int codigo_seguridad;
    String tipo_doc;
    String nro_doc;
    int nro_cuotas;
    float monto_cuota;
    float total;
    //leyenda para la pantalla de tarjeta
    String descrip;
    String descrip_deuda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public int getNro_cuotas() {
        return nro_cuotas;
    }

    public void setNro_cuotas(int nro_cuotas) {
        this.nro_cuotas = nro_cuotas;
    }

    public float getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(float monto_cuota) {
        this.monto_cuota = monto_cuota;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(int nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(int codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
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
        if (!(object instanceof Datos_Tarjeta)) {
            return false;
        }
        Datos_Tarjeta other = (Datos_Tarjeta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Datos_Tarjeta[ id=" + id + " ]";
    }
    
}
