
public class exceptiontrycatch extends Thread{
	public void run() {
		while(true) {
		System.out.print("thread 1");
	}
	}
	public class mythread2 extends Thread{
		public void run() {
			while(true) {
			System.out.print("thread 2");
		}
		}
		//thread is concurrency, run method execute hoga , start use krna hoga main me 
	
}
public class exceptiontrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread1 t1=new mythread1();
		mythread2 t2=new mythread2();
		t1.start();
		t2.start();
		
		

	}

}
}
