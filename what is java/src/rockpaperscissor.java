
import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println("write your number1 with in (0=rock,1=paper,2=scissor) having 5 rounds\n");
        start: 
        while(i<5) {   
        	int input = sc.nextInt();
        	
            if(input<0||input>2)
            {
            	 System.out.println("enter correct number:");
            	 
            	 continue start;
            }
            switch (input) {
                case 0 -> System.out.println("rock");
                case 1 -> System.out.println("paper");
                case 2 -> System.out.println("scissor");
            }
            int rand1 = rand.nextInt(0, 3);
            switch (rand1) {
                case 0 -> System.out.println("rock");
                case 1 -> System.out.println("paper");
                case 2 -> System.out.println("scissor");
            }
            if (input == 1 && rand1 == 0 || input == 2 && rand1 == 1 || input == 0 && rand1 == 2) {
                System.out.println("you win");
                ++j;}
            else if (input == 0 && rand1 == 0 || input == 1 && rand1 == 1 || input == 2 && rand1 == 2) {
                System.out.println("draw");}
            else {System.out.println("computer win");
                ++k;}
            if(i<4)
            {
            System.out.println("\nwrite your number"+(i+2)+" with in (0,1,2).");
            }
            i++;
        }
        System.out.print("The final Result is:");
        if(j>k){System.out.println("you win.");}
        else if(k>j){System.out.println("computer win.");}
        else{System.out.println("it's a draw.");}
    }
}