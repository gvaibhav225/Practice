package springstart01;

import java.util.LinkedList;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class student {
	//for not writing bean in xmlfile just make xml file and (enable annotations and content component scan base pacakge) and at this class above student write @Component and above every variable use @Value("22") like this or can use @Value("#{22+33}") like this
String name;
int r;
LinkedList<String> phone;  //for lists/maps use standalone collection mthod in beans.xml and add util schema
//Map<String,Integer> map;


//public int getR() {
//	return r;
//}
//
//public void setR(int r) {
//	this.r = r;
//}sssssss
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}



//above one for setter injection and down one for construction injection 


public student(String name, int r, LinkedList<String> phone) {
	super();
	this.name = name;
	this.r = r;
	this.phone = phone;
//	this.map = map;
}

//for below one use javax annotation dependency and in beam write context annotation config to enable these
@PostConstruct
public void afterstart() {
	System.out.println("method started");
}



@PreDestroy
public void preend() {
	System.out.println("method ended");
}

//when using autowire with more than 1 beam then using @Oualifier(bean id) we can get ans

}
