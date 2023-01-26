
public class varargs {
	static int sum(int ...arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(sum(4,6,8,9));

	}

}
