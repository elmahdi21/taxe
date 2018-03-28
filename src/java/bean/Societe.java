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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Societe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String idFiscal;//generer par dgi
    private String password;//genere par dgi
    private String raisonSociale;
    private String numTele;
    private String numFix;
    private String email;
    private Float deficit;//resultat fiscal < 0

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;//1,2,...5

    @OneToMany(mappedBy = "societe")
    private List<CompteBanquaire> compteBanquaires;
    @OneToMany(mappedBy = "societe")
    private List<Employe> employes;
    
    

    public String getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(String idFiscal) {
        this.idFiscal = idFiscal;
    }

    public Societe(String raisonSociale, String numTele, String numFax, String email) {
        this.raisonSociale = raisonSociale;
        this.numTele = numTele;
        this.numFix = numFax;
        this.email = email;
    }

    public Societe(String id) {
        this.idFiscal = id;
    }

    public Societe() {
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getNumTele() {
        return numTele;
    }

    public void setNumTele(String numTele) {
        this.numTele = numTele;
    }

    public String getNumFix() {
        return numFix;
    }

    public void setNumFix(String numFix) {
        this.numFix = numFix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CompteBanquaire> getCompteBanquaires() {
        if (compteBanquaires == null) {
            compteBanquaires = new ArrayList();
        }
        return compteBanquaires;
    }

    public void setCompteBanquaires(List<CompteBanquaire> compteBanquaires) {
        this.compteBanquaires = compteBanquaires;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Float getDeficit() {
        if (deficit == null) {
            deficit = 0f;
        }
        return deficit;
    }

    public void setDeficit(Float deficit) {
        this.deficit = deficit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employe> getEmployes() {
        if (employes == null) {
            employes = new ArrayList();
        }
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idFiscal fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if (this.idFiscal != other.idFiscal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + idFiscal + ", raisonSociale=" + ", numTele=" + numTele + ", numFax=" + numFix + ", email=" + email + '}';
    }

}
