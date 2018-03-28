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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class PaiementIS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float montant;
    private int accompteVerse; // 1 , 2 , 3 , 4
    @OneToOne
    private DeclarationIs declarationIs;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePaiement;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDernierDelai;

    public PaiementIS() {
    }

    public PaiementIS(Long id) {
        this.id = id;
    }

    public PaiementIS(Long id, Float montant, Date datePaiement) {
        this.id = id;
        this.montant = montant;
        this.datePaiement = datePaiement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public int getAccompteVerse() {
        return accompteVerse;
    }

    public void setAccompteVerse(int accompteVerse) {
        this.accompteVerse = accompteVerse;
    }

    public DeclarationIs getDeclarationIs() {
        if (declarationIs == null) {
            declarationIs = new DeclarationIs();
        }
        return declarationIs;
    }

    public void setDeclarationIs(DeclarationIs declarationIs) {
        this.declarationIs = declarationIs;
    }

    public Date getDateDernierDelai() {
        return dateDernierDelai;
    }

    public void setDateDernierDelai(Date dateDernierDelai) {
        this.dateDernierDelai = dateDernierDelai;
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
        if (!(object instanceof PaiementIS)) {
            return false;
        }
        PaiementIS other = (PaiementIS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", montant=" + montant + ", datePaiement=" + datePaiement + '}';
    }

}
