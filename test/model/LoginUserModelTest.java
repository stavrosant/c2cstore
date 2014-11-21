/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ConnectionMock.ConnMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class LoginUserModelTest {
    
    public LoginUserModelTest() {
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
     * Test of getName method, of class LoginUserModel.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getter : getName with arguments : test");
        LoginUserModel instance = new LoginUserModel();
        instance.setName("test");
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);  
    }

    /**
     * Test of setName method, of class LoginUserModel.
     */
    @Test
    public void testSetName() {
        System.out.println("Testing setter : setName with arguments : testonloginmodel");
        String name = "testonloginmodel";
        LoginUserModel instance = new LoginUserModel();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "testonloginmodel";
        String Result = instance.getName();
        assertEquals(expResult, Result); 
    }

    /**
     * Test of getPassword method, of class LoginUserModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("Testing getter : getPassword with arguments : 1234");
        LoginUserModel instance = new LoginUserModel();
        String expResult = "1234";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setPassword method, of class LoginUserModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("Testing setter : setPassword with arguments : testpass");
        String password = "testpass";
        LoginUserModel instance = new LoginUserModel();
        instance.setPassword(password);
        String result = instance.getPassword();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(password, result);
    }

    /**
     * Test of validatePass method, of class LoginUserModel.
     */
    @Test(expected=java.lang.NullPointerException.class)
    public void testValidatePass() {
        System.out.println("Testing method ValidatePass with 0 arguments");
        ConnMock DBconn = new ConnMock();
        LoginUserModel instance = new LoginUserModel();
        boolean result = instance.validatePass(DBconn);
        
       
    }
    
    @Test
    public void testValidatePass2() {
        System.out.println("Testing method ValidatePass with ConnMock arguments : test, 1234 , moderator; LoginUserModel : 5");
        ConnMock DBconn = new ConnMock("test", "1234", "moderator");
        LoginUserModel instance = new LoginUserModel();
        boolean expResult = false;
        instance.setPassword("5");
        boolean result = instance.validatePass(DBconn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
    public void testValidatePass3() {
        System.out.println("Testing method ValidatePass with ConnMock arguments : test, 1234 , moderator; LoginUserModel : 1234");
        ConnMock DBconn = new ConnMock("test", "1234", "moderator");
        LoginUserModel instance = new LoginUserModel();
        boolean expResult = true;
        instance.setPassword("1234");
        boolean result = instance.validatePass(DBconn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of validateName method, of class LoginUserModel.
     */
    @Test(expected=java.lang.NullPointerException.class)
    public void testValidateName() {
        System.out.println("Testing method ValidateName with 0 arguments");
        ConnMock DBconn = null;
        LoginUserModel instance = new LoginUserModel();
        boolean result = instance.validateName(DBconn);
       
       
    }
    
    public void testValidateName2() {
        System.out.println("Testing method ValidateName with ConnMock arguments : test1, 1234 , User; LoginUserModel : test");
        ConnMock DBconn = new ConnMock("test1", "1234", "User");
        LoginUserModel instance = new LoginUserModel();
        boolean expResult = false;
        instance.setName("test");
        boolean result = instance.validatePass(DBconn);
        assertEquals(expResult, result);
    }
    
    public void testValidateName3() {
        System.out.println("Testing method ValidateName with ConnMock arguments : test1, 1234 , User; LoginUserModel : test1");
        ConnMock DBconn = new ConnMock("test1", "1234", "User");
        LoginUserModel instance = new LoginUserModel();
        boolean expResult = true;
        instance.setName("test1");
        boolean result = instance.validatePass(DBconn);
        assertEquals(expResult, result);
    }
    
    public void testValidateName4() {
        System.out.println("Testing method ValidateName with ConnMock arguments : test@, 1234 , User; LoginUserModel : test1");
        ConnMock DBconn = new ConnMock("test@", "1234", "User");
        LoginUserModel instance = new LoginUserModel();
        boolean expResult = true;
        instance.setName("test@");
        boolean result = instance.validatePass(DBconn);
        assertEquals(expResult, result);
    }
    
}
