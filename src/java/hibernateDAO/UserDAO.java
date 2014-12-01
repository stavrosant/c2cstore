/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateDAO;


import hibernateModel.RegisterUtil;
import hibernateModel.User;
import model.RegisterModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chris
 */
public class UserDAO {
    
    public void addUser(User user){
        Session session = RegisterUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            
            
        }catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        }
        finally {
        session.close();
        }
    }
    
    
}
