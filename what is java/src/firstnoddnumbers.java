import java.util.Scanner;
public class firstnoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		for(i=1;i<2*n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
