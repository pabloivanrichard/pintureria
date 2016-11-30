/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Pablo
 */
@Entity
public class Caja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date fecha;
    @Temporal(javax.persistence.TemporalType.TIME)
    Date horainicio;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date fechacierre;
    @Temporal(javax.persistence.TemporalType.TIME)
    Date horafin;
    float montoinicial;
    float montoingresos;
    float montoegresos;
    float montocaja;
    float montorealcaja;
    @OneToOne
    Usuario usuario;
    int estado; //0-abierto 1-cerrado
    @OneToMany
    List<Venta> ventas;
    @OneToMany
    List<Compras> compras;
    @OneToMany
    List<Vale> vales;

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

    public float getMontoinicial() {
        return montoinicial;
    }

    public void setMontoinicial(float montoinicial) {
        this.montoinicial = montoinicial;
    }

    public float getMontoingresos() {
        return montoingresos;
    }

    public void setMontoingresos(float montoingresos) {
        this.montoingresos = montoingresos;
    }

    public float getMontoegresos() {
        return montoegresos;
    }

    public void setMontoegresos(float montoegresos) {
        this.montoegresos = montoegresos;
    }

    public float getMontocaja() {
        return montocaja;
    }

    public void setMontocaja(float montocaja) {
        this.montocaja = montocaja;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void setCompras(List<Compras> compras) {
        this.compras = compras;
    }

    public List<Vale> getVales() {
        return vales;
    }

    public void setVales(List<Vale> vales) {
        this.vales = vales;
    }
    
    

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public float getMontorealcaja() {
        return montorealcaja;
    }

    public void setMontorealcaja(float montorealcaja) {
        this.montorealcaja = montorealcaja;
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
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Caja[ id=" + id + " ]";
    }
    
}
