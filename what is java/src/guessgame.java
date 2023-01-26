import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
class number{
	int userinput() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		return a;
	}
	int random(){
		Random rand=new Random();
		int r=rand.nextInt(0,100);
		return r;
	}
	
}

public class guessgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=0,z=0,l=0;
		number guess=new number();
		int i=guess.random();
		
		System.out.println("Enter the number");
		start:
		while(l<10) {
			int j=guess.userinput();
			if(i==j) {
				System.out.print("correct guess");
				break;
			}
			if(i>j) {
				System.out.print("you have entered low value try again:");
				z++;
				continue start;
			}
			if(i<j) {
				System.out.print("you have entered high value try again:");
				x++;
				continue start;
			}
			
		}
		int g=x+z+1;
		System.out.println("Total attempts are"+" "+g);
		
		
		
		

	}

}
