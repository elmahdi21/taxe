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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class ExerciceTVA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long montant;
    private int type;//1;achats ; 2:ventes
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @OneToOne
    private CategorieTVA categorieTVA;
    @ManyToOne
    private Societe societe;

    public ExerciceTVA() {
    }

    public ExerciceTVA(Long montant, int type, Date dateDebut, Date dateFin) {
        this.montant = montant;
        this.type = type;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public ExerciceTVA(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public CategorieTVA getCategorieTVA() {
        if (categorieTVA == null) {
            categorieTVA = new CategorieTVA();
        }
        return categorieTVA;
    }

    public void setCategorieTVA(CategorieTVA categorieTVA) {
        this.categorieTVA = categorieTVA;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExerciceTVA)) {
            return false;
        }
        ExerciceTVA other = (ExerciceTVA) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exercice{" + "id=" + id + ", montant=" + montant + ", type=" + type + '}';
    }

}
