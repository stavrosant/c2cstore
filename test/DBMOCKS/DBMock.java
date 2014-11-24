/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMOCKS;

/**
 *
 * @author Admin
 */
public class DBMock {
    private String username,password,rank;
    public DBMock(String usrnm, String pass, String rank){
        this.username = "admin";
        this.password = "admin";
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
