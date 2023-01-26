abstract class base{
 void one(){
		System.out.print("tttt");
	}
	abstract void two();//abstract means its imaginary, no real class is created if taken one abstract method in a clas then whole class has to be defined abstract
	static void five() {
		System.out.print("tfivet");
	}
}

class derived1 extends base{
	//for making it a real class extended from abstract class then we need to override abstract method present in parent class
	void one(){
		System.out.print("ttttt");
	}
	void two() {
		
	}
	void three() {
		
	}
}
abstract class derived2 extends base{
	//if we didnt want to overridde then it will create another abstract claass and therefore need to add abstract before class
}
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base obj=new derived1();
		obj.one();
		obj.two();
		//obj.three(); not allowed
		derived1 d=new derived1();
		d.three();
		base.five();

	}

}
