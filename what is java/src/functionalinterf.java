@FunctionalInterface
interface vaibhav{
	void one(int n);
	default void two() {
		System.out.print("inter2");
		
	}
	default void we() {
		
	}
	
	static void five() {
		System.out.print("inter5");
	}
	static void fivee() {
		System.out.print("inter55");
	}
	
}

public class functionalinterf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaibhav.five();
	vaibhav.fivee();
		vaibhav obj=(int n)->{
			System.out.print(n);
		};
		obj.one(6);
		obj.two();
//		obj.we();

	}
a
}
