package spring02annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using annotation(constructor)
		//just makee a conf class , no need to make constructor
//		
//		ApplicationContext con=new AnnotationConfigApplicationContext(myconfiguration.class);
//		user st=con.getBean(user.class);
//		st.name="vaibhav";
//		st.arr=2;
//		System.out.println(st.name);
//		System.out.println(st.arr);
//		
		
		//using annotation(setter)
		ApplicationContext con=new AnnotationConfigApplicationContext(myconfiguration.class);
		user st=con.getBean(user.class);
		st.setName("vaibhav");
		st.setArr(2);
		System.out.println(st.getName());
		System.out.println(st.getArr());
		
		
	}

}
