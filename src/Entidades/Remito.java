/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author laura
 */
@Entity
public class Remito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    int nro_remito;
    @OneToMany
    List<Detalle_Remito> remito;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_emicion;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_vencimiento;
    float total;
    
    
            

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNro_remito() {
        return nro_remito;
    }

    public void setNro_remito(int nro_remito) {
        this.nro_remito = nro_remito;
    }

    public List<Detalle_Remito> getRemito() {
        return remito;
    }

    public void setRemito(List<Detalle_Remito> remito) {
        this.remito = remito;
    }

  

    public Date getFecha_emicion() {
        return fecha_emicion;
    }

    public void setFecha_emicion(Date fecha_emicion) {
        this.fecha_emicion = fecha_emicion;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
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
        if (!(object instanceof Remito)) {
            return false;
        }
        Remito other = (Remito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Remito[ id=" + id + " ]";
    }
    
}
