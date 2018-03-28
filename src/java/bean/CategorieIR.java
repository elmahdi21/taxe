
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class CategorieIR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Double salaireMini;
    private Double salaireMaxi;
    private Float taux;

    public CategorieIR() {
    }

    public CategorieIR(Long id) {
        this.id = id;
    }

    public CategorieIR(Double salaireMini, Double salaireMaxi, Float taux) {
        this.salaireMini = salaireMini;
        this.salaireMaxi = salaireMaxi;
        this.taux = taux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalaireMini() {
        return salaireMini;
    }

    public void setSalaireMini(Double salaireMini) {
        this.salaireMini = salaireMini;
    }

    public Double getSalaireMaxi() {
        return salaireMaxi;
    }

    public void setSalaireMaxi(Double salaireMaxi) {
        this.salaireMaxi = salaireMaxi;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategorieIR other = (CategorieIR) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategorieIR{" + "id=" + id + ", salaireMini=" + salaireMini + ", salaireMaxi=" + salaireMaxi + ", taux=" + taux + '}';
    }

}
