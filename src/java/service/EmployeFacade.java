/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Employe;
import bean.TrancheIrEmp;
import bean.TaxeIrEmp;
import bean.TrancheIr;
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
    @EJB
    TrancheIrEmpFacade tranchesIrEmpFacade;

    //FIND BY SOCIETE----------------------------------------------------------------------------------------------------------------
    public List<Employe> findBySociete(String idSociete) {

        return (List<Employe>) em.createQuery("SELECT emp FROM Employe emp where emp.societe.idFiscal='" + idSociete + "'").getResultList();
    }

    //TROUVER LES TRANCHES VIA LE SALAIRE ----------------------------------------------------------------------------------------------
    public List<TrancheIr> findTrancheBySalaire(Double salaire) {

        List<TrancheIr> trs = em.createQuery("SELECT tr FROM TrancheIr tr where tr.mine<'" + salaire + "'").getResultList();

        return trs;

    }

    //TROUVER LES TRANCHE DE CHACHE EMPLOYE--------------------------------------------------------------------------------------------------
    public List<TrancheIrEmp> findTranchesByEmploye(Employe employe) {

        List<TrancheIrEmp> irEmps = em.createQuery("SELECT t FROM TrancheIrEmp t where t.employe.idFiscale='" + employe.getIdFiscale() + "'").getResultList();

        return irEmps;

    }

    //CALCULER LA TAXE IR POUR PLUSIEURE EMP  ----------------------------------------------------------------------------------------------
    public int taxeIrEmp(String idsociete) {

        List<Employe> employes = findBySociete(idsociete);

        for (Employe employe : employes) {
            if(employe.getTaxeIrEmp()!=null){
                return 2;
            }else {
            DecouperSalaire(employe);
            calcTaxeIrForEmployee(employe);
            }
        }
        return 1;
    }
    //DECOUPER LE SALAIRE-----------------------------------------------------------------------------------------------------------------------------

    public void DecouperSalaire(Employe employe) {

        List<TrancheIr> trs = findTrancheBySalaire(employe.getSalaireBrute());

        for (TrancheIr tr : trs) {
            
            if (employe.getSalaireBrute() > tr.getMaxe()) {

                salaireSup(trs, tr, employe);
            } else {
                salaireInf(tr, employe, trs);
            }
        }

    }

    public void salaireInf(TrancheIr tr, Employe employe, List<TrancheIr> trs) {
        TrancheIrEmp trancheIrEmp = new TrancheIrEmp();
        trancheIrEmp.setEmploye(employe);
        trancheIrEmp.setMin(tr.getMine());
        trancheIrEmp.setTrancheTrs(trs);
        trancheIrEmp.setMax(employe.getSalaireBrute());
        trancheIrEmp.setMorceau(employe.getSalaireBrute() - tr.getMine());
        trancheIrEmp.setTauxMorceau(tr.getTaux() * trancheIrEmp.getMorceau());
        tranchesIrEmpFacade.create(trancheIrEmp);

    }

    public void salaireSup(List<TrancheIr> trs, TrancheIr tr, Employe employe) {

        TrancheIrEmp trancheIrEmp = new TrancheIrEmp();
        trancheIrEmp.setEmploye(employe);
        trancheIrEmp.setTrancheTrs(trs);
        trancheIrEmp.setMin(tr.getMine());
        trancheIrEmp.setMax(tr.getMaxe());
        trancheIrEmp.setMorceau(tr.getMaxe() - tr.getMine());
        trancheIrEmp.setTauxMorceau(tr.getTaux() * trancheIrEmp.getMorceau());
        tranchesIrEmpFacade.create(trancheIrEmp);

    }

    //Calculer taxe IR pour Employe----------------------------------------------------------------------------------------------------------------------
    private int calcTaxeIrForEmployee(Employe employe) {
        List<TrancheIrEmp> irEmps = findTranchesByEmploye(employe);
        Double montant = 0.0;
        for (TrancheIrEmp irEmp : irEmps) {
            montant += montant + irEmp.getTauxMorceau();
        }
        employe.setSalaireMensuel(employe.getSalaireBrute() - montant);
        edit(employe);
        TaxeIrEmp taxeIrEmp = new TaxeIrEmp();
        taxeIrEmp.setEmploye(employe);
        taxeIrEmp.setMontant(montant);
        taxeIrEmpFacade.create(taxeIrEmp);
        return 1;
    }
}
