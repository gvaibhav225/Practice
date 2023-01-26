import java.util.Scanner;
public class useofendswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String website=sc.next();
		if(website.endsWith(".com"))
		{
			System.out.print("commercial");
		}
		else if(website.endsWith(".org"))
		{
			System.out.print("organisational");
		}

	}

}
