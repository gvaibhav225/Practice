import java.io.*;
import java.util.Scanner;
public class exercise4 {
	public static void no(String name) throws IOException {
		Scanner sc=new Scanner(f1);
		String str="";
		while(sc.hasNextLine()) {
			str=sc.nextLine();
			if(str.indexOf(name)!=-1) {
				System.out.println(str);
			}
		}

	}
	public static void disp() throws IOException {
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine()) {
	System.out.println(sc.nextLine());
			
		}
		
	}
	
	public static void change(String one, String two) throws IOException {
		Scanner sc=new Scanner(f1);
	
		String str="";
		while(sc.hasNextLine()) {
			str=str + sc.nextLine()+ System.lineSeparator();
			}
		str=str.replaceAll(one, two);
		FileWriter fw=new FileWriter(f1);
		fw.write(str);
		fw.close();
		
		}

	
static File f1=new File("phoneno.txt");
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
      no("vaibhav");
      System.out.println("");
	   disp();
      change("aman","kshitij");
//	   vaibhav 9571989687
//	   aman 9588920367
//	   jatin 9521796017 
    
	   
		
		
	
	}

}

