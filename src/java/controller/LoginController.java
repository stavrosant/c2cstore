    package controller;  
    import ConnectionMock.ConnMock;
import hibernateDAO.LoginDAO;
    import model.LoginUserModel;
    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.RequestDispatcher;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse; 
    import hibernateUtis.LoginUtil;
import hibernate_models.User;
    public class LoginController extends HttpServlet {  
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            String name=request.getParameter("name");  
            String password=request.getParameter("password");  
             
            User ur = new User();
            LoginDAO LU = new LoginDAO();
            LoginUserModel LUM=new LoginUserModel();
            try{
                ur = LU.getDBUser(name);
                LUM.setUser(ur);
                LUM.setPassword(password);
                String dispaddress = LUM.getRDFoward();
                RequestDispatcher rd;
                rd=request.getRequestDispatcher(dispaddress);  
                request.setAttribute("bean",ur);
                rd.forward(request, response);
              
                
            }
            catch(java.lang.NullPointerException ex){
                RequestDispatcher rd;
                rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
                rd.forward(request, response);
            }
            
            
                
               
            
            
            //CONNECTION TO DB
            
            
            //request.setAttribute("bean",ur);  
            
//            ConnMock DBconnMock = new ConnMock();
//            boolean Namestatus = LUM.validateName(DBconnMock);
//            boolean Passstatus = LUM.validatePass(DBconnMock);
//            RequestDispatcher rd;
////////             out.println("<!DOCTYPE html>");
////////            out.println("<html>");
////////            out.println("<head>");
////////            out.println("<title>Servlet NewServlet</title>");            
////////            out.println("</head>");
////////            out.println("<body>");
////////            out.println("<h1>PASSWORD : " + DBpass + "</h1>");
////////            out.println("</body>");
////////            out.println("</html>");
//            if(Namestatus){ 
//                if(Passstatus){
//                    switch (DBconnMock.getRank()){
//                        case "User":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/UserLoginSuccess.jsp");  
//                            rd.forward(request, response); 
//                        break;
//                        case "Moderator":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/ModeratorDashboard.jsp");  
//                            rd.forward(request, response);
//                        break;
//                        case "SuperUser":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/SuperUserDashboard.jsp");  
//                            rd.forward(request, response);
//                        break;
//                    }
//                }
//                else{
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongPass.jsp");  
//                    rd.forward(request, response);
//                }
//            }  
//            else{ 
//                if(Passstatus){
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
//                    rd.forward(request, response);  
//                }
//                else{
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
//                    rd.forward(request, response);
//                }
//            }  
          
        }  
        
    //Unecesary. Kept for legacy or future development.
        @Override  
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
                throws ServletException, IOException {  
            doPost(req, resp);  
        }  
    }  