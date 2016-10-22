/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Pablo
 */
@Entity
public class cuenta_contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    float anticipo;
    float total;
    float saldo;
    float saldoIntegrante;
    @OneToMany
    List<detalle_cuenta_contrato>listadetallecuenta;
  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public List<detalle_cuenta_contrato> getListadetallecuenta() {
        return listadetallecuenta;
    }

    public void setListadetallecuenta(List<detalle_cuenta_contrato> listadetallecuenta) {
        this.listadetallecuenta = listadetallecuenta;
    }

    public float getSaldoIntegrante() {
        return saldoIntegrante;
    }

    public void setSaldoIntegrante(float saldoIntegrante) {
        this.saldoIntegrante = saldoIntegrante;
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
        if (!(object instanceof cuenta_contrato)) {
            return false;
        }
        cuenta_contrato other = (cuenta_contrato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.cuenta_contrato[ id=" + id + " ]";
    }
    
}
