import java.util.Scanner;
public class method2 {
	int logic(int a, int b) {//here we didnt write static
		int c=a+b;
		return c;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		method2 obj=new method2();
		int z=sc.nextInt();
		int y=sc.nextInt();
		System.out.print(obj.logic(z,y));

	}

}
