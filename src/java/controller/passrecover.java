/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ConnectionMock.PassrecDBmock;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PassrecoverModel;

/**
 *
 * @author Admin
 */
@WebServlet(name = "passrecover", urlPatterns = {"/passrecover", "/passwordRecoveryProccess"})
public class passrecover extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();
            
            RequestDispatcher rd;
            
            String path = request.getServletPath();
            if(path.equals("/passrecover"))
            {
                rd=request.getRequestDispatcher("/Pages/PassRecover/passrecoverform.jsp");  
                rd.forward(request, response); 
            }
            
            if(path.equals("/passwordRecoveryProccess")){
            
                String usrname = request.getParameter("username");
                String secretquestion = request.getParameter("secretquestion");
                
                PassrecDBmock DBmock = new PassrecDBmock();
                PassrecoverModel recmodel = new PassrecoverModel();
                boolean userexist; 
                
                userexist = recmodel.checkUser(usrname, DBmock);
                
                if(userexist)
                {
                  String newpass = recmodel.generatepass();
                    try {
                        //Methodos gia enimerosi tis vasis
                        recmodel.sendPassRecoverEmail("kiriakospours@gmail.com", newpass);
                    } catch (MessagingException ex) {
                        Logger.getLogger(passrecover.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   rd=request.getRequestDispatcher("/Pages/PassRecover/PasswordRecovered.jsp");
                   rd.forward(request, response);
                    
                
                }
                else
                {
                    
                    rd=request.getRequestDispatcher("/Pages/PassRecover/noUser.jsp");
                    rd.forward(request, response); 
                }
                
            
            }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
