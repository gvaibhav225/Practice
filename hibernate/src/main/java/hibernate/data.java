package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;




import java.util.ServiceLoader;


public class data {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create session factory object
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Food f1=new Food();
		f1.setDescription("try to get in 1hr");
		f1.setId(1);
		f1.setName("pizza");
		f1.setPrice(400);
		f1.setServe_qty(2);
		

		Food f2=new Food();
		f2.setDescription("try to get in 1hr");
		f2.setId(2);
		f2.setName("pizza");
		f2.setPrice(4000);
		f2.setServe_qty(12);
		
		
		session.save(f1);
		session.save(f2);
		session.delete(f2);
		
		f1.setDescription("try to get in 15min");
		session.update(f1);
		
		
		session.getTransaction().commit();
		session.close();
		

//		employee e1=new employee();
//		employee e2=new employee();
//		e1.setIid(1);
//		e1.setName("vaibhav");
//		session.save(e1);
//		e2.setIid(2);
//		e2.setName("vai");
//		session.save(e2);
//	//can do crud operations
//		session.delete(e2);
		
		

		
		
		
		
		
		
	}

}