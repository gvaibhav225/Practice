
public class finall {
	public static int yo() {
		int a=9,b=0,c;
		try {
		c=a/b;
		return c;
	}catch(Exception e){
		System.out.println(e);
	}
		finally {
			System.out.println("inside finally jo bhi h execute hokr rhega chahe exception aaye ya nhi");
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(yo());

	}

}
