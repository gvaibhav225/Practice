package sqlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class storedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		user u1=new user();
		u1.setFname("vaibhav");
		u1.setEmail("abc@gmail.com");
		
		address a1=new address();
		a1.setAddressLine1("flat 2");
		a1.setCity("jaipur");
		a1.setState("Delhi");
		
		u1.setAddress(a1);
		
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		

		session.save(u1);
		session.save(a1);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
