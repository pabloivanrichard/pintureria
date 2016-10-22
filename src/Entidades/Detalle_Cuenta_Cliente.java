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
public class Detalle_Cuenta_Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String tipo_pago;
    int nro_cuota;
    int cantidad_cuota;
    float monto_cuota;
    int iva;
    String estado;
    @ManyToOne
    Venta venta;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_vencimiento;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_pago;
    float monto_conInteres;
    String anulacion;
    float total_cuenta;

    public String getAnulacion() {
        return anulacion;
    }

    public void setAnulacion(String anulacion) {
        this.anulacion = anulacion;
    }

    public float getTotal_cuenta() {
        return total_cuenta;
    }

    public void setTotal_cuenta(float total_cuenta) {
        this.total_cuenta = total_cuenta;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public int getNro_cuota() {
        return nro_cuota;
    }

    public void setNro_cuota(int nro_cuota) {
        this.nro_cuota = nro_cuota;
    }

    public int getCantidad_cuota() {
        return cantidad_cuota;
    }

    public void setCantidad_cuota(int cantidad_cuota) {
        this.cantidad_cuota = cantidad_cuota;
    }

    public float getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(float monto_cuota) {
        this.monto_cuota = monto_cuota;
    }
    
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public float getMonto_conInteres() {
        return monto_conInteres;
    }

    public void setMonto_conInteres(float monto_conInteres) {
        this.monto_conInteres = monto_conInteres;
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
        if (!(object instanceof Detalle_Cuenta_Cliente)) {
            return false;
        }
        Detalle_Cuenta_Cliente other = (Detalle_Cuenta_Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Detalle_Cuenta_Cliente[ id=" + id + " ]";
    }
    
}
