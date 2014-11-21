    package model; 
    import ConnectionMock.ConnMock;
    
    public class LoginUserModel {  
        private String name,password;  
        
        
        public String getName() {  
            return name;  
        }
        public void setName(String name) {  
            this.name = name;  
        }
        
        public String getPassword() {  
            return password;  
        }  
        public void setPassword(String password) {  
            this.password = password;  
        }
       
        
        public boolean validatePass(ConnMock DBconn){  
            if(password.equals(DBconn.getPass())){  
                return true;  
            }  
            else{  
                return false;  
            }  
        }  
        
        public boolean validateName(ConnMock DBconn){  
            if(name.equals(DBconn.getName())){  
                return true;  
            }  
            else{  
                return false;  
            }  
        }  
    }  