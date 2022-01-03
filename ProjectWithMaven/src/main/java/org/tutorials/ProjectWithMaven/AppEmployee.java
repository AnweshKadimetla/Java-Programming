package org.tutorials.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( "Project started" );
	        //connection established to the hibernate
	        Configuration cfg = new Configuration();
	        cfg.configure("hinernate.cfg.xml");
	        
	        
	       SessionFactory factory= cfg.buildSessionFactory();
	       System.out.println(factory);
	       //Creating a student object
	       Employee e=new Employee();
	       e.setEmpid(1012);
	       e.setEmpname("Sachins");
	       e.setEmpph(486);
	       e.setEmpdeskno(5875);
	       System.out.println(e);
	       
	       Session session=factory.openSession();//Getting the saved the data
	       Transaction tx= session.beginTransaction();
	       
	       session.save(e);
	       session.getTransaction().commit();//(Entity of the table)Record saves to the database
	      // tx.commit();
	       session.close();
	      // System.out.println(factory);

	}

}
