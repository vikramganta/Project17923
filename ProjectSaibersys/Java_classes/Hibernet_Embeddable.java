/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernet_embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sanket
 */
public class Hibernet_Embeddable 
{
    public static void main(String[] args) 
    {
//        
        
//        Student_Sai std = new Student_Sai();
//        std.setName("Sanket Selokar");
//        std.setPhone("7777");
//        std.setRoomNo("17923");
//        std.setTech("Java");
//        std.setStatus("Marketing");
//        std.setEmailID("san@gmail.com");
//        std.setUniversity("NWMSU");
        
        TaskOfStudent task = new TaskOfStudent();
        task.setPhoneNo("7777");
        task.setCompletedTask("6/12/2017");
        task.setTargetTask("7/5/2017");
        task.setCurrentDate("7/4/2017");
        task.setRemarks("On track");

     
//        Configuration con = new Configuration().configure().addAnnotatedClass(Student_Sai.class);
//        
//        SessionFactory  sf = con.buildSessionFactory(); 
//        
//        Session session =   sf.openSession();            
//        
//        Transaction tx = session.beginTransaction();
//
//        session.save(std);
//        
//        tx.commit();
        
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(TaskOfStudent.class);
        
        SessionFactory  sf = con.buildSessionFactory(); 
        
        Session session =   sf.openSession();            
        
        Transaction tx = session.beginTransaction();

        session.save(task);
        
        tx.commit();
        
        
    }
    
}
