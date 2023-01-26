package springstart01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class student {
String name;
int r;


//public int getR() {
//	return r;
//}
//
//public void setR(int r) {
//	this.r = r;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}



//above one for setter injection and down one for construction injection 

public student(String name, int r) {
	super();
	this.name = name;
	this.r = r;
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


}
