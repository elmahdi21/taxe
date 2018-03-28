/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
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
 * @author medab
 */
@Entity
public class Dgi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    @OneToOne
    private CompteBanquaire compteBanquaire;
    @ManyToOne
    private Societe societe;
    private String email;
    private String passOfEmail;

    public Dgi() {
    }

    public Dgi(Long id) {
        this.id = id;
    }

    public Dgi(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompteBanquaire getCompteBanquaire() {
        if (compteBanquaire == null) {
            compteBanquaire = new CompteBanquaire();
        }
        return compteBanquaire;
    }

    public void setCompteBanquaire(CompteBanquaire compteBanquaire) {
        this.compteBanquaire = compteBanquaire;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassOfEmail() {
        return passOfEmail;
    }

    public void setPassOfEmail(String passOfEmail) {
        this.passOfEmail = passOfEmail;
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
        if (!(object instanceof Dgi)) {
            return false;
        }
        Dgi other = (Dgi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dgi{" + "id=" + id + ", login=" + login + ", password=" + password + '}';
    }

}
