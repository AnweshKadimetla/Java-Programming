package NewProjectMaven.org.first;

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
       Order o = new Order();
       o.setOid(101);
       o.setName("Mobile");
       o.setDesc("Mobile phone is ordered");
       Session session=factory.openSession();//Getting the saved the data
       Transaction tx= session.beginTransaction();
       session.save(o);
       session.getTransaction().commit();//(Entity of the table)Record saves to the database
       session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
