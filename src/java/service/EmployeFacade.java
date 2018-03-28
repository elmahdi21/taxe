/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import bean.Employe;
import bean.TaxeIrEmp;
import bean.TrancheIr;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class EmployeFacade extends AbstractFacade<Employe> {

    @PersistenceContext(unitName = "TaxePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeFacade() {
        super(Employe.class);
    }
    @EJB
    TrancheIrFacade trancheIrFacade;
    @EJB
    TaxeIrEmpFacade taxeIrEmpFacade;
    
    List<Employe> employes = new ArrayList<>();
    List<TrancheIr> trancheIrs = new ArrayList<>();

    //FIND BY SOCIETE----------------------------------------------------------------------------------------------------------------
    public List<Employe> findBySociete(String idSociete) {

        return (List<Employe>) em.createQuery("SELECT emp FROM Employe emp where emp.societe.idFiscal=" + idSociete + " ").getResultList();
    }

    //TROUVER LA TRANCHE DE CHAQUE EMP----------------------------------------------------------------------------------------------
    public int trancheEmp(String IdSociete) {

        trancheIrs = trancheIrFacade.findAll();
        employes = findBySociete(IdSociete);
        for (Employe emp : employes) {
            for (TrancheIr trancheIr : trancheIrs) {

                if (emp.getSalaireBrute() < trancheIr.getMaxe() || emp.getSalaireBrute() > trancheIr.getMine()) {
                    emp.setTypeTranche(trancheIr.getId());
                    edit(emp);

                }

            }

        }
        return 1;
    }

    //CALCULER LA TAXE IR POUR CHAQUE EMP  --------------------------------------------------------------------------------------------
    public int taxeIrEmp(String idsociete) {

        employes = findBySociete(idsociete);
        trancheIrs = trancheIrFacade.findAll();
        Double montant;
        for (Employe employe : employes) {
            for (TrancheIr trancheIr : trancheIrs) {

                if (employe.getTypeTranche().equals(trancheIr.getId())) {
                    montant = employe.getSalaireBrute() - (trancheIr.getTaux() * employe.getSalaireBrute());
                    employe.setSalaireMensuel(montant);
                    edit(employe);
                    TaxeIrEmp tie = new TaxeIrEmp();
                    tie.setEmploye(employe);
                    tie.setMontant(montant);
                    taxeIrEmpFacade.create(tie);

                }
            }

        }
        return 1;
    }

    //----------------------------------------------------------------------------------------------------------------------
}
