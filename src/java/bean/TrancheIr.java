/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author User
 */
@Entity
public class TrancheIr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private Double mine;
    private Double maxe;
    private Double taux;

    
    
     
    public Double getMine() {
        return mine;
    }

    public void setMine(Double mine) {
        this.mine = mine;
    }

    public Double getMaxe() {
        return maxe;
    }

    public void setMaxe(Double maxe) {
        this.maxe = maxe;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrancheIr() {
    }

    public TrancheIr(String id) {
        this.id = id;
    }

    public TrancheIr(String id, Double mine, Double maxe, Double taux) {
        this.id = id;
        this.mine = mine;
        this.maxe = maxe;
        this.taux = taux;
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
        if (!(object instanceof TrancheIr)) {
            return false;
        }
        TrancheIr other = (TrancheIr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrancheIr{" + "id=" + id + ", mine=" + mine + ", maxe=" + maxe + ", taux=" + taux + '}';
    }

}
