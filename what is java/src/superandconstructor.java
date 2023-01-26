import java.util.Scanner;

class emplo{
	int x;
	
	void setdetails(int x) {
		this.x=x;
	}
	emplo(){//constructor :int this not req emplo v=new emplo and set details , direct get details
		System.out.print("first");
		x=4;
	}
	emplo(int t){
		System.out.print("second"+t);
	}
	void getdetails() {
		System.out.print(x);
	}
}
class derived extends emplo{
	int y;
	//if not using super then we get constructor first
	
	derived(){
		super(8);//super is used when more than one constructor are present in a class
		System.out.print("yooo");
	}
	
}
public class superandconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived v=new derived();
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	v.setdetails(n);*/
		//v.getdetails();

	}

}
