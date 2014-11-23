/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionMock;

/**
 *
 * @author Admin
 */
public class PassrecDBmock {
    String Usrnm, sq , email;

    public PassrecDBmock(){
        this.Usrnm = "tester";
        this.sq = "tpt";
        this.email = "kiriakospours@gmail.com";
                
    }
    
    public String getUsrnm() {
        return Usrnm;
    }
    
    public String getEmail() {
        return email;
    }

    public String getSq() {
        return sq;
    }

   
    
    
}
