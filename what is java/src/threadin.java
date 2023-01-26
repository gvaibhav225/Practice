class mythread extends Thread{
	public void run() {
		int i=0;
		while(i<5){
			System.out.print("yo");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			i++;
		}
	}
}
class mythread2 extends Thread{
	public void run() {
		int j=0;
		while(j<3){
			System.out.print("yoyo");
			j++;
		}
	}
}
public class threadin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread obj=new mythread();
		mythread2 obj1=new mythread2();
		obj.start();
		obj1.start();

	}

}
