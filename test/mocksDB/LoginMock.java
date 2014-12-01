/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocksDB;

/**
 *
 * @author Admin
 */
public class LoginMock {
    
    private String username,password,rank;
    
    public LoginMock(String usrnm, String pass, String rank){
        this.username = usrnm;
        this.password = pass;
        this.rank = rank;
    }
    
    public String getName(){
       return username;
    }
    
    
    public String getPass(){
        return password;
    }

    public String getRank(){
        return rank;
    }
}
