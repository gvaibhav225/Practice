import java.io.*;
import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1=new File("f1.txt");
		if(f1.exists()) {
			System.out.println("file exists");
		}
		else
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2=new File("f2.txt");
		if(f1.exists()) {
			System.out.println("file exists");
		}
		else
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileWriter fw1;
		try {
			fw1 = new FileWriter(f1);
			fw1.write("This is first file");
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		
		String str="";
		Scanner sc;
		try {
			sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				str=sc.nextLine();
				System.out.println(str);
				
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		FileWriter fw2;
		try {
			fw2 = new FileWriter(f2);
			fw2.write(str);
			fw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		Scanner sc1;
		try {
			sc1 = new Scanner(f2);
			while(sc1.hasNextLine()) {
				System.out.print(sc1.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
