/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class DeclarationTva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private boolean isValidated;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;
    @OneToOne
    private Employe employe;
    private String periode;
    private String annee;
    private Double taxeDue;
    private Double taxeDeductible;
    private Double taxeAverser;
    private Double taxeAreporter;
    @OneToMany
    private List<ExerciceTVA> exercices;
    @ManyToOne
    private Societe societe;
    private int type;//1: mensuel ; 2: trimensuel

    public DeclarationTva() {
    }

    public DeclarationTva(String id) {
        this.id = id;
    }

    public DeclarationTva(boolean isValidated, Date dateCreation, String periode, String annee, Double taxeDue, Double taxeDeductible, Double taxeAverser, Double taxeAreporter, int type) {
        this.isValidated = isValidated;
        this.dateCreation = dateCreation;
        this.periode = periode;
        this.annee = annee;
        this.taxeDue = taxeDue;
        this.taxeDeductible = taxeDeductible;
        this.taxeAverser = taxeAverser;
        this.taxeAreporter = taxeAreporter;
        this.type = type;
    }

    public boolean isIsValidated() {
        return isValidated;
    }

    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Employe getEmploye() {
        if (employe == null) {
            employe = new Employe();
        }
        return employe;
    }

    public void setUtilisateur(Employe employe) {
        this.employe = employe;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Double getTaxeDue() {
        return taxeDue;
    }

    public void setTaxeDue(Double taxeDue) {
        this.taxeDue = taxeDue;
    }

    public Double getTaxeDeductible() {
        return taxeDeductible;
    }

    public void setTaxeDeductible(Double taxeDeductible) {
        this.taxeDeductible = taxeDeductible;
    }

    public Double getTaxeAverser() {
        return taxeAverser;
    }

    public void setTaxeAverser(Double taxeAverser) {
        this.taxeAverser = taxeAverser;
    }

    public Double getTaxeAreporter() {
        return taxeAreporter;
    }

    public void setTaxeAreporter(Double taxeAreporter) {
        this.taxeAreporter = taxeAreporter;
    }

    public List<ExerciceTVA> getExercices() {
        if (exercices == null) {
            exercices = new ArrayList();
        }
        return exercices;
    }

    public void setExercices(List<ExerciceTVA> exercices) {
        this.exercices = exercices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeclarationTva)) {
            return false;
        }
        DeclarationTva other = (DeclarationTva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeclarationTva{" + "id=" + id + ", isValidated=" + isValidated + ", dateCreation=" + dateCreation + ", periode=" + periode + ", annee=" + annee + ", taxeDue=" + taxeDue + ", taxeDeductible=" + taxeDeductible + ", taxeAverser=" + taxeAverser + ", taxeAreporter=" + taxeAreporter + '}';
    }

}
