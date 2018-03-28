/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */
@Entity
public class TaxeIrEmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @OneToOne
    private Employe employe;
    private Double montant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaxeIrEmp() {
    }

    public TaxeIrEmp(String id) {
        this.id = id;
    }

    public TaxeIrEmp(String id, Double montant) {
        this.id = id;
        this.montant = montant;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
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
        if (!(object instanceof TaxeIrEmp)) {
            return false;
        }
        TaxeIrEmp other = (TaxeIrEmp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TaxeIrEmp{" + "id=" + id + ", montant=" + montant + '}';
    }

       
}
