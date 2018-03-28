/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Employe;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class EmployeFacadeTest {
    
    public EmployeFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class EmployeFacade.
     */
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        Employe entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        instance.create(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of edit method, of class EmployeFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        System.out.println("edit");
//        Employe entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        instance.edit(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class EmployeFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Employe entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        instance.remove(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of find method, of class EmployeFacade.
//     */
//    @Test
//    public void testFind() throws Exception {
//        System.out.println("find");
//        Object id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        Employe expResult = null;
//        Employe result = instance.find(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findAll method, of class EmployeFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        List<Employe> expResult = null;
//        List<Employe> result = instance.findAll();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findRange method, of class EmployeFacade.
//     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int[] range = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        List<Employe> expResult = null;
//        List<Employe> result = instance.findRange(range);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of count method, of class EmployeFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findBySociete method, of class EmployeFacade.
     
    @Test
    public void testFindBySociete() throws Exception {
        System.out.println("findBySociete");
        String idSociete = "societe1";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
        List<Employe> expResult = null;
        List<Employe> result = instance.findBySociete(idSociete);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
    }
}

    /**
     * Test of trancheEmp method, of class EmployeFacade.
//     */
//    @Test
//    public void testTrancheEmp() throws Exception {
//        System.out.println("trancheEmp");
//        String IdSociete = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        int expResult = 0;
//        int result = instance.trancheEmp(IdSociete);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of taxeIrEmp method, of class EmployeFacade.
//     */
//    @Test
//    public void testTaxeIrEmp() throws Exception {
//        System.out.println("taxeIrEmp");
//        String idsociete = "";
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeFacade instance = (EmployeFacade)container.getContext().lookup("java:global/classes/EmployeFacade");
//        int expResult = 0;
//        int result = instance.taxeIrEmp(idsociete);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
