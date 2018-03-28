/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ushiho
 */
@Entity
public class Penalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Societe societe;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDernierDeclaration;
    private Double montantPenalite;
    private Float taux;//5%  ou/et 0.5%

    public Penalite(Date dateDernierDeclaration, Double montantPenalite, Float taux) {
        this.dateDernierDeclaration = dateDernierDeclaration;
        this.montantPenalite = montantPenalite;
        this.taux = taux;
    }

    public Penalite() {
    }

    public Penalite(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Societe getSociete() {
        if (societe == null) {
            societe = new Societe();
        }
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Date getDateDernierDeclaration() {
        return dateDernierDeclaration;
    }

    public void setDateDernierDeclaration(Date dateDernierDeclaration) {
        this.dateDernierDeclaration = dateDernierDeclaration;
    }

    public Double getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(Double montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
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
        if (!(object instanceof Penalite)) {
            return false;
        }
        Penalite other = (Penalite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Penalite[ id=" + id + " ]";
    }

}
