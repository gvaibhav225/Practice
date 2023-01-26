import java.util.Scanner;
public class starprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int n=sc.nextInt();
		  int i,j,k;
		  for(i=n;i>0;i--)
		  {
			  for(j=i;j>0;j--)
			  {
			  System.out.print("*");
			  }
			  for(j=1;j<2*n-2*i+1;j++)
			  {
			  System.out.print(" ");
			  }
			     for(k=i;k>0;k--)
			     {
			    	 System.out.print("*");
			     }
			  System.out.print("\n");
		}
		  
	}

}
