interface vaibhav{
	void one(int n);
	default void two() {
		System.out.print("inter2");
		
	}
	default void two0() {
		System.out.print("inter20");
		
	}
	static void five() {
		System.out.print("inter5");
	}
	static void fivee() {
		System.out.print("inter5");
	}
}
interface vai{
	void three(int b);
	default void two() {
		
			System.out.print("inter4");
		
	}
}
class yo implements vaibhav, vai{
	public void one(int n) {
		System.out.print("inter");
	}
 public void three(int b) {
			System.out.print("inter3");
		}
 public void two() {
	 vaibhav.super.two();
 }
 
 
 
	}


public class interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yo yoo=new yo();
		yoo.one(1);
		yoo.two();
		yoo.three(2);
		yoo.two0();
		vaibhav.five();
		vaibhav.fivee();
		
//		we can directly write like above for static method but cant write for other methods and there is no need to override default method
		
		
		
		

	}

}
