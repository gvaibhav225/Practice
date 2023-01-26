import java.io.*;
import java.util.Scanner;
public class exercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1=new File("f1.txt");
		f1.createNewFile();
		
		File f2=new File("f2.txt");
		f2.createNewFile();
		
		FileWriter fw1=new FileWriter(f1);
		fw1.write("This is first file");
		fw1.close();
		FileWriter fw2=new FileWriter(f2);
		
		String str="";
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
			str=sc.nextLine();
			System.out.println(str);
			
		}
		fw2.write(str);
		fw2.close();
		
		Scanner sc1= new Scanner(f2);
		while(sc1.hasNextLine()) {
			System.out.print(sc1.nextLine());
		}
		
	}

}
