
public class fibonacci {
	static void fibo(int n) {
		if(n==1)
		{
			System.out.print(0);
			return;
		}
		if(n==2)
		{
			System.out.print("0 1");
			return;
		}
		System.out.print("0 1");
		int a=0,b=1,c;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(5);
		

	}

}
