/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import org.jfree.data.time.Hour;

/**
 *
 * @author Pablo
 */
@Entity
public class TicketCocina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha;
    Hour hora;
    @OneToMany(cascade = CascadeType.ALL)
    List<DetalleTicketCocina> dt;

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

    public Hour getHora() {
        return hora;
    }

    public void setHora(Hour hora) {
        this.hora = hora;
    }

    public List<DetalleTicketCocina> getDt() {
        return dt;
    }

    public void setDt(List<DetalleTicketCocina> dt) {
        this.dt = dt;
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
        if (!(object instanceof TicketCocina)) {
            return false;
        }
        TicketCocina other = (TicketCocina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TicketCocina[ id=" + id + " ]";
    }
    
}
