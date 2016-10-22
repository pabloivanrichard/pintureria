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
import org.eclipse.persistence.jpa.config.Cascade;

/**
 *
 * @author Pablo
 */
@Entity
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String nroContrato;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fec_inicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fec_fin;
    int cantidad;
    float total;
    @OneToOne
    Organizacion organizacion;
    @OneToMany (cascade = CascadeType.ALL)
    List<Responsable_Contrato> responsables;
    @OneToMany
    List<Alumno> alumnos;
    @OneToMany (cascade = CascadeType.ALL)
    List<Detalle_Contrato> detalle_contrato;
    @OneToOne (cascade = CascadeType.ALL)
    cuenta_contrato cuenta_contrato;
    String estado;
    String promo;
    String anulado;
    @OneToMany
    List<PersonalizarContrato>Comprapersonalizada;
    int diasHabiles;
    @OneToOne
    Entrega_Producto_Contrato entrega;
    @OneToOne
    Usuario usu;

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    
    public Entrega_Producto_Contrato getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega_Producto_Contrato entrega) {
        this.entrega = entrega;
    }

    public int getDiasHabiles() {
        return diasHabiles;
    }

    public void setDiasHabiles(int diasHabiles) {
        this.diasHabiles = diasHabiles;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFec_inicio() {
        return fec_inicio;
    }

    public void setFec_inicio(Date fec_inicio) {
        this.fec_inicio = fec_inicio;
    }

    public Date getFec_fin() {
        return fec_fin;
    }

    public void setFec_fin(Date fec_fin) {
        this.fec_fin = fec_fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public List<Responsable_Contrato> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<Responsable_Contrato> responsables) {
        this.responsables = responsables;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(String nroContrato) {
        this.nroContrato = nroContrato;
    }

    public List<Detalle_Contrato> getDetalle_contrato() {
        return detalle_contrato;
    }

    public void setDetalle_contrato(List<Detalle_Contrato> detalle_contrato) {
        this.detalle_contrato = detalle_contrato;
    }

    public cuenta_contrato getCuenta_contrato() {
        return cuenta_contrato;
    }

    public void setCuenta_contrato(cuenta_contrato cuenta_contrato) {
        this.cuenta_contrato = cuenta_contrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public List<PersonalizarContrato> getComprapersonalizada() {
        return Comprapersonalizada;
    }

    public void setComprapersonalizada(List<PersonalizarContrato> Comprapersonalizada) {
        this.Comprapersonalizada = Comprapersonalizada;
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
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contrato[ id=" + id + " ]";
    }
    
}
