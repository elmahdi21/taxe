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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Employe implements Serializable {

    @Id
    private String idFiscale;
    private Long login;
    private String motDePasse;
    private int droitFiscale;//1 , 2 , 3 , 0= tt les droits
    private String nom;
    private String pNom;
    private String CIN;
    private String numTele;
    private String email;
    private String profession;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEmbauche;
    private Double salaireBrute;
    private Double salaireMensuel;
    private String typeTranche;
    @ManyToOne
    private TrancheIr trancheIr;
    @ManyToOne
    private Societe societe;

    @OneToOne
    private CompteBanquaireEmp banquaireEmp;
    @OneToOne(mappedBy = "employe")
    private TaxeIrEmp taxeIrEmp;

    public Employe() {
    }

    public Employe(String idFiscale) {
        this.idFiscale = idFiscale;
    }

    public TrancheIr getTrancheIr() {
        return trancheIr;
    }

    public void setTrancheIr(TrancheIr trancheIr) {
        this.trancheIr = trancheIr;
    }

    public Employe(String idFiscale, Long login, String motDePasse, int droitFiscale, String nom, String pNom, String CIN, String numTele, String email, String profession, Date dateEmbauche, Double salaireBrute, Double salaireMensuel, String typeTranche, TrancheIr trancheIr, Societe societe, CompteBanquaireEmp banquaireEmp, TaxeIrEmp taxeIrEmp) {
        this.idFiscale = idFiscale;
        this.login = login;
        this.motDePasse = motDePasse;
        this.droitFiscale = droitFiscale;
        this.nom = nom;
        this.pNom = pNom;
        this.CIN = CIN;
        this.numTele = numTele;
        this.email = email;
        this.profession = profession;
        this.dateEmbauche = dateEmbauche;
        this.salaireBrute = salaireBrute;
        this.salaireMensuel = salaireMensuel;
        this.typeTranche = typeTranche;
        this.trancheIr = trancheIr;
        this.societe = societe;
        this.banquaireEmp = banquaireEmp;
        this.taxeIrEmp = taxeIrEmp;
    }

    public Long getLogin() {
        return login;
    }

    public void setLogin(Long login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getDroitFiscale() {
        return droitFiscale;
    }

    public void setDroitFiscale(int droitFiscale) {
        this.droitFiscale = droitFiscale;
    }

   

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public TaxeIrEmp getTaxeIrEmp() {
        return taxeIrEmp;
    }

    public void setTaxeIrEmp(TaxeIrEmp taxeIrEmp) {
        this.taxeIrEmp = taxeIrEmp;
    }

    public String getTypeTranche() {
        return typeTranche;
    }

    public void setTypeTranche(String typeTranche) {
        this.typeTranche = typeTranche;
    }

    public Double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(Double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public Double getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(Double salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    public CompteBanquaireEmp getBanquaireEmp() {
        return banquaireEmp;
    }

    public void setBanquaireEmp(CompteBanquaireEmp banquaireEmp) {
        this.banquaireEmp = banquaireEmp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getpNom() {
        return pNom;
    }

    public void setpNom(String pNom) {
        this.pNom = pNom;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNumTele() {
        return numTele;
    }

    public void setNumTele(String numTele) {
        this.numTele = numTele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getIdFiscale() {
        return idFiscale;
    }

    public void setIdFiscale(String idFiscale) {
        this.idFiscale = idFiscale;
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
        hash += (idFiscale != null ? idFiscale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.idFiscale == null && other.idFiscale != null) || (this.idFiscale != null && !this.idFiscale.equals(other.idFiscale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employe{" + "idFiscale=" + idFiscale + ", nom=" + nom + ", pNom=" + pNom + ", CIN=" + CIN + ", numTele=" + numTele + ", email=" + email + ", profession=" + profession + ", dateEmbauche=" + dateEmbauche + ", salaireBrute=" + salaireBrute + ", salaireMensuel=" + salaireMensuel + ", typeTranche=" + typeTranche + '}';
    }

}
