/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DBMOCKS.DBMock;
import controller.pseudocontroller.PSEUDO_LoginController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of doPost method, of class LoginController.
     * @throws java.lang.Exception
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, User; passed : test, 1;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 4;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "User");
        int result = instance.doPost(request, response, mock, "test", "1");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost2() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, User; passed : tes1, 1;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 5;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "User");
        int result = instance.doPost(request, response, mock, "tes1", "1");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost3() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, User; passed : tes1, 11;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 5;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "User");
        int result = instance.doPost(request, response, mock, "tes1", "11");
        assertEquals(expectedresult, result);
    }
        
    
    @Test
    public void testDoPost4() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, User; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 1;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "User");
        int result = instance.doPost(request, response, mock, "test", "12");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost5() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, SuperUser; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 3;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "SuperUser");
        int result = instance.doPost(request, response, mock, "test", "12");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost6() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, Moderator; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 2;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "Moderator");
        int result = instance.doPost(request, response, mock, "test", "12");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost7() throws Exception {
        System.out.println("Login servlet with arquments : test, 12, Mod; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 0;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "12", "Mod");
        int result = instance.doPost(request, response, mock, "test", "12");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost8() throws Exception {
        System.out.println("Login servlet with arquments : test, 1234, Moderator; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 5;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "1234", "Modarator");
        int result = instance.doPost(request, response, mock, "te", "1234");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost9() throws Exception {
        System.out.println("Login servlet with arquments : test, 1234, User; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 5;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "1234", "User");
        int result = instance.doPost(request, response, mock, "te", "1234");
        assertEquals(expectedresult, result);
    }
    
    @Test
    public void testDoPost10() throws Exception {
        System.out.println("Login servlet with arquments : test, 1234, SuperUser; passed : test, 12;");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int expectedresult = 5;
        PSEUDO_LoginController instance = new PSEUDO_LoginController();
        DBMock mock = new DBMock("test", "1234", "SuperUser");
        int result = instance.doPost(request, response, mock, "te", "1234");
        assertEquals(expectedresult, result);
    }
}
