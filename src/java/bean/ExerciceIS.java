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
public class ExerciceIS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    private Societe societe;
    @ManyToOne
    private DeclarationIs declarationIs;
    private String nFacture;
    private Float produits;
    private Float charges;
    private Float deductibles;
    private Float nonDeductibles;

    public ExerciceIS(Long id, Date dateDebut, Date dateFin, String nFacture, Float produits, Float charges, Float deductibles, Float nonDeductibles) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nFacture = nFacture;
        this.produits = produits;
        this.charges = charges;
        this.deductibles = deductibles;
        this.nonDeductibles = nonDeductibles;
    }

    public ExerciceIS(Long id) {
        this.id = id;
    }

    public ExerciceIS() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
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

    public DeclarationIs getDeclarationIs() {
        if (declarationIs == null) {
            declarationIs = new DeclarationIs();
        }
        return declarationIs;
    }

    public void setDeclarationIs(DeclarationIs declarationIs) {
        this.declarationIs = declarationIs;
    }

    public String getnFacture() {
        return nFacture;
    }

    public void setnFacture(String nFacture) {
        this.nFacture = nFacture;
    }

    public Float getProduits() {
        return produits;
    }

    public void setProduits(Float produits) {
        this.produits = produits;
    }

    public Float getCharges() {
        return charges;
    }

    public void setCharges(Float charges) {
        this.charges = charges;
    }

    public Float getDeductibles() {
        return deductibles;
    }

    public void setDeductibles(Float deductibles) {
        this.deductibles = deductibles;
    }

    public Float getNonDeductibles() {
        return nonDeductibles;
    }

    public void setNonDeductibles(Float nonDeductibles) {
        this.nonDeductibles = nonDeductibles;
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
        if (!(object instanceof ExerciceIS)) {
            return false;
        }
        ExerciceIS other = (ExerciceIS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.ExerciceIS[ id=" + id + " ]";
    }

}
