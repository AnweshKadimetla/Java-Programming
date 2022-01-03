package org.tutorials.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Project started" );
        //connection established to the hibernate
        Configuration cfg = new Configuration();
        cfg.configure("hinernate.cfg.xml");
        
        
       SessionFactory factory= cfg.buildSessionFactory();
       System.out.println(factory);
       Product pr=new Product();
       pr.setPid(100);
       pr.setPname("car");
       pr.setDesc("car has 4 wheels");
       pr.setProdprice(500);
       Session session=factory.openSession();
       Transaction tx= session.beginTransaction();
       session.save(pr);
       session.getTransaction().commit();
       session.close();
       
	}

}
