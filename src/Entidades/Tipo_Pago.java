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
public class Tipo_Pago implements Serializable {
    @OneToOne(mappedBy = "tipo_pago")
    private Tipo_Venta tipo_Venta;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    Datos_Contado contado; 
    @OneToMany(cascade = CascadeType.ALL)
    List<Datos_Tarjeta> tarjetas; 
    @OneToMany(cascade = CascadeType.ALL)
    List<Datos_cheque> cheques;
    @OneToMany(cascade = CascadeType.ALL)
    List<Datos_Cuenta_Corriente> cuentacorrientes;
            

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Datos_Contado getContado() {
        return contado;
    }

    public void setContado(Datos_Contado contado) {
        this.contado = contado;
    }

    public List<Datos_Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Datos_Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<Datos_cheque> getCheques() {
        return cheques;
    }

    public void setCheques(List<Datos_cheque> cheques) {
        this.cheques = cheques;
    }

    public List<Datos_Cuenta_Corriente> getCuentacorrientes() {
        return cuentacorrientes;
    }

    public void setCuentacorrientes(List<Datos_Cuenta_Corriente> cuentacorrientes) {
        this.cuentacorrientes = cuentacorrientes;
    }

    public Tipo_Venta getTipo_Venta() {
        return tipo_Venta;
    }

    public void setTipo_Venta(Tipo_Venta tipo_Venta) {
        this.tipo_Venta = tipo_Venta;
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
        if (!(object instanceof Tipo_Pago)) {
            return false;
        }
        Tipo_Pago other = (Tipo_Pago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipo_Pago[ id=" + id + " ]";
    }
    
}
