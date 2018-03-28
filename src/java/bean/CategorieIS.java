/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class CategorieIS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Float benificeMin;
    private Float benificeMax;
    private Float taux;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApp;

    public CategorieIS() {
    }

    public CategorieIS(Long id) {
        this.id = id;
    }

    public CategorieIS(Float benificeMin, Float benificeMax, Float taux) {
        this.benificeMin = benificeMin;
        this.benificeMax = benificeMax;
        this.taux = taux;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public Float getBenificeMin() {
        return benificeMin;
    }

    public void setBenificeMin(Float benificeMin) {
        this.benificeMin = benificeMin;
    }

    public Float getBenificeMax() {
        return benificeMax;
    }

    public void setBenificeMax(Float benificeMax) {
        this.benificeMax = benificeMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateApp() {
        return dateApp;
    }

    public void setDateApp(Date dateApp) {
        this.dateApp = dateApp;
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
        if (!(object instanceof CategorieIS)) {
            return false;
        }
        CategorieIS other = (CategorieIS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategorieIS{" + "id=" + id + ", benificeMin=" + benificeMin + ", benificeMax=" + benificeMax + ", taux=" + taux + '}';
    }
}
