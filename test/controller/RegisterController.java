/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.RegisterModel;

/**
 *
 * @author Chris
 */
@WebServlet(name = "RegisterControllerServlet", urlPatterns = {"/Register", "/RegisterValidate"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                   throws ServletException, IOException {  
               response.setContentType("text/html");  
               PrintWriter out=response.getWriter();  

               String userPath = request.getServletPath();

               if(userPath.equals("/Register")){ 
                   RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/Register.jsp");  
                   rd.forward(request, response);
               }
               else if(userPath.equals("/RegisterValidate")){

                   RegisterModel rm = new RegisterModel();

                   rm.setName(request.getParameter("name"));
                   rm.setSurname(request.getParameter("surname"));
                   rm.setUsername(request.getParameter("username"));
                   rm.setEmail(request.getParameter("email"));
                   rm.setPassword(request.getParameter("password"));
                   rm.setConfirmpassword(request.getParameter("confirmpassword"));

                   rm.validateUsername();
                   rm.validateEmail();
                   rm.validatePasswotd();
                   boolean status = rm.validate();

                   if(status){
                       RequestDispatcher rd=request.getRequestDispatcher("/Pages/HomePage/HomePage.jsp");  
                       rd.forward(request, response);
                   }
                   else{
                       RequestDispatcher rd=request.getRequestDispatcher("/Pages/SignUp/RegisterError.jsp");  
                       rd.forward(request, response); 
                   }
               }
    }
      
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }
}
