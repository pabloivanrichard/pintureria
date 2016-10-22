/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author laura
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String apellido;
    String nombre;
    @OneToOne
    Tipo_Doc tipo_doc;
    String doc;
    String tel;
    String email;
    String domicilio;
    @OneToOne
    Tipo_Cliente descripcion; // hace referencia al tipo de cliente ej: Pintor
    @OneToOne (cascade = CascadeType.ALL)
    Cuenta_Cliente cuenta;
    
    public Long getId() {
        return id;
    }

    public Cuenta_Cliente getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta_Cliente cuenta) {
        this.cuenta = cuenta;
    }



    public void setId(Long id) {
        this.id = id;
    }
    

    public Tipo_Doc getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(Tipo_Doc tipo_doc) {
        this.tipo_doc = tipo_doc;
    }
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Tipo_Cliente getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Tipo_Cliente descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controladores.Cliente[ id=" + id + " ]";
    }
    
}
