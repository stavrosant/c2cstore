    package controller.pseudocontroller;  
    import ConnectionMock.ConnMock;
    import model.LoginUserModel;
    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.RequestDispatcher;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;
    import DBMOCKS.DBMock;
/**
 *
 * @author Antonis
 */
public class PSEUDO_LoginController extends HttpServlet {
   
    public int doPost(HttpServletRequest request, HttpServletResponse response, DBMock mock1, String name, String password)  
            throws ServletException, IOException {  
        //response.setContentType("text/html");  
        //PrintWriter out=response.getWriter();  

        //String name=request.getParameter("name");  
        //String password=request.getParameter("password");  

        LoginUserModel LUM=new LoginUserModel();  
        LUM.setName(name);  
        LUM.setPassword(password);  
       // request.setAttribute("bean",LUM);  

        
//        boolean Namestatus = LUM.validateName(mock1);
//        boolean Passstatus = LUM.validatePass(mock1);
        boolean Namestatus,Passstatus;
        if(name.equals(mock1.getName())){
            Namestatus = true;
        }
        else{
            Namestatus = false;
        }
        
        //if(password.equals(mock1.getPass()))
        
        if(password.equals(mock1.getPass())){
            Passstatus = true;
        }
        else{
            Passstatus = false;
        }
        
           // RequestDispatcher rd;
            int toreturned = 0;
            if(Namestatus){ 
                if(Passstatus){
                    switch (mock1.getRank()){
                        case "User":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/UserLoginSuccess.jsp");  
//                            rd.forward(request, response);
                              toreturned = 1;
                        break;
                        case "Moderator":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/ModeratorDashboard.jsp");  
//                            rd.forward(request, response);
                              toreturned = 2;
                        break;
                        case "SuperUser":
//                            rd=request.getRequestDispatcher("/Pages/Dashboards/SuperUserDashboard.jsp");  
//                            rd.forward(request, response);
                              toreturned = 3;
                        break;
                    }
                }
                else{
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongPass.jsp");  
//                    rd.forward(request, response);
                      toreturned = 4;
                }
            }  
            else{ 
                if(Passstatus){
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
//                    rd.forward(request, response);  
                      toreturned = 5;
                }
                else{
//                    rd=request.getRequestDispatcher("/Pages/Login/WrongName.jsp");  
//                    rd.forward(request, response);
                      toreturned = 5;
                }
            }  
          return toreturned;
        }  

    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }  
}      

