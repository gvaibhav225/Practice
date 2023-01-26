package mappingmanytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class datasource {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		

		user u1=new user();
		u1.setId(1);
		
		food f1=new food();
		f1.setId(1);
		f1.setName("burger");
		
		u1.setF(f1);
		
		session.save(u1);
		session.save(f1);

		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//
//		client u1=new client();
//		u1.setFname("vaibhav");
//		u1.setEmail("abc@gmail.com");
//		
//		order a1=new order();
//		a1.setAddressLine1("flat 2");
//		a1.setCity("jaipur");
//		a1.setState("Delhi");
//		
//		order a2=new order();
//		a2.setAddressLine1("flat 3");
//		a2.setCity("jaipuar");
//		a2.setState("Delhfi");
//		a2.setClient(u1);
//		
//		List<order> li=new ArrayList<>();
//		li.add(a1);
//		li.add(a2);
//		
//		u1.setAddress(li);
//		
//		
//		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		session.beginTransaction();
//		
//
//		session.save(u1);
//		session.save(a1);
//		session.save(a2);
//		session.getTransaction().commit();
//		session.close();

	}

}
