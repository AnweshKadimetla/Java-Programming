package org.maven;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
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
        cfg.configure("hibernateMaven.cfg.xml");
        
        
       SessionFactory factory= cfg.buildSessionFactory();
       System.out.println(factory);
       Products p = new Products();
       p.setPid(101);
       p.setPname("Car");
       p.setDesc("Car has 4 wheels");
       p.setPrice(20000);
       
       Session session=factory.openSession();//Getting the saved the data
       Transaction tx= session.beginTransaction();
       session.save(p);
       session.getTransaction().commit();//(Entity of the table)Record saves to the database
       session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
