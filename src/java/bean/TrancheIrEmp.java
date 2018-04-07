/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */
@Entity
public class TrancheIrEmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
    @ManyToOne
    private Employe employe;
    private Double max;
    private Double min;
    @OneToMany
    private List<TrancheIr> trancheTrs;
    private Double Morceau;
    private Double tauxMorceau;

    public TrancheIrEmp() {
    }

    public TrancheIrEmp(Long id) {
        this.id = id;
    }

    public TrancheIrEmp(Long id, Employe employe, Double max, Double min, List<TrancheIr> trancheTrs, Double Morceau, Double tauxMorceau) {
        this.id = id;
        this.employe = employe;
        this.max = max;
        this.min = min;
        this.trancheTrs = trancheTrs;
        this.Morceau = Morceau;
        this.tauxMorceau = tauxMorceau;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<TrancheIr> getTrancheTrs() {
        return trancheTrs;
    }

    public void setTrancheTrs(List<TrancheIr> trancheTrs) {
        this.trancheTrs = trancheTrs;
    }

    public Double getMorceau() {
        return Morceau;
    }

    public void setMorceau(Double Morceau) {
        this.Morceau = Morceau;
    }

    public Double getTauxMorceau() {
        return tauxMorceau;
    }

    public void setTauxMorceau(Double tauxMorceau) {
        this.tauxMorceau = tauxMorceau;
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
        if (!(object instanceof TrancheIrEmp)) {
            return false;
        }
        TrancheIrEmp other = (TrancheIrEmp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TranchesIrEmp{" + "id=" + id + ", Morceau=" + Morceau + ", tauxMorceau=" + tauxMorceau + '}';
    }

}
