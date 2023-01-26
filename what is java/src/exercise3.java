import java.io.*;
import java.util.Scanner;
public class exercise3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
		File f1=new File("file1.txt");
	int	count=0;

		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			count++;
			
		}
		System.out.println("Total number of lines:"+count);
	
		
	}catch(Exception e) {
		System.out.print("some error occured");
	}

}
}
