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
import javax.persistence.Temporal;

/**
 *
 * @author medab
 */
@Entity
public class CategorieTVA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int num;
    private String nom;
    private Float taux;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAppli;

    public CategorieTVA() {
    }

    public CategorieTVA(Long id) {
        this.id = id;
    }

    public CategorieTVA(int num, String nom, Float taux) {
        this.num = num;
        this.nom = nom;
        this.taux = taux;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateAppli() {
        return dateAppli;
    }

    public void setDateAppli(Date dateAppli) {
        this.dateAppli = dateAppli;
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
        if (!(object instanceof CategorieTVA)) {
            return false;
        }
        CategorieTVA other = (CategorieTVA) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategorieTVA{" + "id=" + id + ", num=" + num + ", nom=" + nom + ", taux=" + taux + '}';
    }

}
