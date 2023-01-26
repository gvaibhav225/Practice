//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class arraystart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks=new int[5];
		
		
		marks[0]=8;
		marks[1]=9;
		marks[2]=1;
		marks[4]=4;
		marks[3]=3;
		marks[3]=6;
		Arrays.sort(marks);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}

		for(int a:marks)
		{
			System.out.print(a);
		}
		
		
	}

}
