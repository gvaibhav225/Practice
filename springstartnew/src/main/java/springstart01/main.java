package springstart01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create beans.xml in resourses
		
		//there are four ways of ioc container and dependency injection pair:
		// IOC - bean factory and application context
		// DI - constructor injection and setter injection
		
		
		//i) beans factory setter injection  (for setter injection add getter and setter to stuent class), (add bean to beans.xml file)
		
//		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//		student st= (student) factory.getBean("student");      //add id written in beans.xml
//		System.out.println(st.getName());
//		System.out.println(st.getR());
//		
		
		// ii) Application context setter injection
		
//		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
//		student st=(student) con.getBean("student");
//		System.out.println(st.getR());
//		System.out.println(st.getName());
//		
		
		// beans factory constructor injection
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		student st= (student) factory.getBean("student2");      //add id written in beans.xml
		System.out.println(st.name);
		System.out.println(st.r);
		
		// application context constructor injection
//		
//		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
//		student st=(student) con.getBean("student2");
//		System.out.println(st.r);
//		System.out.println(st.name);
		
		
	}

}
