import java.util.Scanner;
public class stringgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String a="t";
		char c='v';
		String z=a;
		int b= st.length();
		String uv=st.toUpperCase();
		System.out.println(st.length());
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		System.out.println("");
		System.out.println(st.contains("rry"));

		System.out.println("");
		System.out.println(uv);
		System.out.println(st.trim());
		System.out.println(st.substring(2));
		System.out.println(st.substring(2, 4));
		System.out.println(st.replace('r', 'p'));
		System.out.println(st.replace("rry", "pie"));
		System.out.println(st.replace("r", "ier"));
		System.out.println(st.startsWith("har"));
		System.out.println(st.charAt(2));
		System.out.println(st.indexOf('r'));
		System.out.println(st.indexOf("ry"));
		System.out.println(st.indexOf("rry",4));//if more than one rry is taken then like harryrry  then for index of second one , search starts with 4
		System.out.println(st.lastIndexOf("rry"));
		System.out.println("i m vaibhav \"");//we can take " in string print using \
		//System.out.println(st.replace(st.substring(2, 3), 'p'))
		
		// trim is used to remove spaces, substring is for getting string from a point to (another-1), relace with "" will be used for string 
		//for replacing perticular char only then break the string usng substring then add them in this way one can add a char betwwen the string
		//see below for word harry . first "" is for adding q between and second "" is for replacing second r with t
		System.out.println(st.substring(0, 3)+"q"+"t"+st.substring(4));
		
		String f="22";
		int i=Integer.parseInt(f);
		System.out.println(f);
		int g=(int) (0.5*6);
	}

}
