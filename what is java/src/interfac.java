
import java.io.*;
interface base{
	//interface is like abstract class but difference is we can extent abstract class only once but can implement interface many times
	int a=45;//if written in interface , value can't be changed
	 void one(int n);//it needs to be implementd in child class like abstract class
	 default void fake() {
		 System.out.print("y");//we need not to implement this in child class as it is in default but if we want we can override
	 }
	 private void yuyu(){
		 
	 }//here private cant be accessed directly but used if default method is too long
	 default void yuyu2(){
		 yuyu();//like this
		 //next kuchbhi jo likhna h
	 }
}
interface derived{
	int b=44;
	void two(int v);
}
class child implements base, derived{
	void three() {
		
	}
	public void one(int n) {//always have to write public
		
		System.out.print("t");
	}
public void two(int v) {//always have to write public
	System.out.print("t");
		
	}
}
public class interfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base cr=new base();
		cr.one(5);

	}

}
