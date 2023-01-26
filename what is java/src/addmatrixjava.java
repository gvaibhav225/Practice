import java.util.Scanner;
public class addmatrixjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a=new int[3][2];
		int [][] b=new int[3][2];
		int [][] c=new int[3][2]; //this is for loop,user ener practice
		a[0][0]=3;
		a[0][1]=4;
		a[2][1]=2;
		a[2][0]=3;
		a[1][1]=6;
		a[1][0]=8;
		b[1][1]=4;
		b[1][0]=2;
		b[2][1]=7;
		b[2][0]=9;
		b[0][1]=0;
		b[0][0]=1;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("+");
		System.out.println("");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("=");
		System.out.println("");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println("");
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=sc.nextInt();
			}
			System.out.println("");

	}
		System.out.println(c[0][1]);
	
	}
	

}
