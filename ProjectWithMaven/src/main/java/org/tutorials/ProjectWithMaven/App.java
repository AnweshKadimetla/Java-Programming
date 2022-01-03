package org.tutorials.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started" );
        //connection established to the hibernate
        Configuration cfg = new Configuration();
        cfg.configure("hinernate.cfg.xml");
        
        
       SessionFactory factory= cfg.buildSessionFactory();
       System.out.println(factory);
       //Creating a student object
       Student st=new Student();
       st.setId(102);
       st.setName("Sachins");
       st.setCity("Biders");
       System.out.println(st);
       
       Session session=factory.openSession();//Getting the saved the data
       Transaction tx= session.beginTransaction();
       
       session.save(st);
       session.getTransaction().commit();//(Entity of the table)Record saves to the database
      // tx.commit();
       session.close();
      // System.out.println(factory);
       
       //I would like to check the connection to the database is clossed or running
    /*   System.out.println(factory.isClosed());//boolean false
       System.out.println(factory.isOpen());
       System.out.println(factory.equals(cfg));
       System.out.println(factory.getSessionFactory());*/
    }
}
