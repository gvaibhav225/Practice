import java.util.Scanner;
public class passing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      float d=(a+b+c)/3f;
      if(a>=33&&b>=33&&c>=33&&d>=40)
      {
    	  System.out.print("pass");
      }
      else
      {
    	  System.out.print("fail");
      }
	}

}
