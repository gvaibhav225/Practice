import java.io.*;
import java.util.Scanner;
public class filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("filehandling.txt");
		file.createNewFile();
		
		FileWriter fw=new FileWriter(file);
		fw.write("this is first file");
		fw.close();
//		here above file is created and now we read its content
		
		int k=0;
		
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String str=sc.next();
			k++;
			System.out.print(str + " ");
		}
		System.out.print(k);

	}

}
