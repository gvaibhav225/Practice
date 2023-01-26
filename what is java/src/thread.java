class mythread1 extends thread{
	void run() {
		while(true) {
		System.out.print("thread 1");
	}
	}
	class mythread2 extends thread{
		void run() {
			while(true) {
			System.out.print("thread 2");
		}
		}
		//thread is concurrency, run method execute hoga , start use krna hoga main me 
	
}
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread1 th=new mythread1();
		mythread2 th2=new mythread2();
		th.run();
		th2.run();
		
		

	}

}
}
