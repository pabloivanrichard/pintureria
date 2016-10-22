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
public class Venta implements Serializable {
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "venta")
    private List<Detalle_Cuenta_Cliente> detalle_Cuenta_Clientes;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha;
    String descripcion;
    float monto;
    String anulacion;
    String pagoRegistrado;
    @OneToOne
    Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    List<Detalle_Venta> detalle_venta;
    @OneToOne(cascade = CascadeType.ALL)
    Tipo_Venta tipoventa;
    @OneToOne
    Usuario usu;
    int porcentaje_descuento;
    
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getAnulacion() {
        return anulacion;
    }

    public void setAnulacion(String anulacion) {
        this.anulacion = anulacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle_Venta> getDetalle_venta() {
        return detalle_venta;
    }

    public void setDetalle_venta(List<Detalle_Venta> detalle_venta) {
        this.detalle_venta = detalle_venta;
    }

    public List<Detalle_Cuenta_Cliente> getDetalle_Cuenta_Clientes() {
        return detalle_Cuenta_Clientes;
    }

    public void setDetalle_Cuenta_Clientes(List<Detalle_Cuenta_Cliente> detalle_Cuenta_Clientes) {
        this.detalle_Cuenta_Clientes = detalle_Cuenta_Clientes;
    }

    public Tipo_Venta getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(Tipo_Venta tipoventa) {
        this.tipoventa = tipoventa;
    }

    public String getPagoRegistrado() {
        return pagoRegistrado;
    }

    public void setPagoRegistrado(String pagoRegistrado) {
        this.pagoRegistrado = pagoRegistrado;
    }

    public int getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Venta[ id=" + id + " ]";
    }
    
}
