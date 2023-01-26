
public class ex {
	public static void matchabSequence(String string){
		int t=0;
		for(int i=0;i<string.length();i++) {
		if(string.contains("ab"));{
				 int z=string.indexOf("ab");
				 string=string.substring(z+2);
		System.out.print(z+t+" ");
		t=t+z+2;
			}	
		}
		System.out.println(" ");
	}
public static int[] findDigitLocation(String string){
int [] a=new int[100];
char[] c=string.toCharArray();
for(char e:c) {
	if(Character.isDigit(e)) {
		System.out.print(string.indexOf(e)+" ");
	}
	
}
System.out.println(" ");
return null;
}
public static int[] findWhiteSpaces(String string){
	int t=0;
	for(int i=0;i<string.length();i++) {
	if(string.contains(" "));{
			 int z=string.indexOf(" ");
			 string=string.substring(z+2);
	System.out.print(z+t+" ");
	t=t+z+2;
		}	
	}
	System.out.println(" ");
	return null;
}
public static int[] findPattern(String string){
int t=0;
for(int i=0;i<string.length();i++) {
if(string.matches("0[xX]?[A-Fa-f]?"));{
		 int z=string.indexOf("0");
		 string=string.substring(z+2);
System.out.print(z+t+" ");
t=t+z+2;
	}	
}
System.out.println(" ");
return null;

}


	

	public static void main(String[] args) {
		matchabSequence("abaaaba");
		findDigitLocation("a12c3e456");
		findWhiteSpaces("a 1 56 _Z");
		findPattern("12 0x 0x12 0Xf 0Xg");
	}
}
