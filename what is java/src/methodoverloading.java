
public class methodoverloading {//method can have same name but differentt parameters
	static void yo() {
		System.out.print("yo!");
	}
	static void yo(int a) {
		System.out.print("\nyo!"+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yo();
		yo(10);

	}

}
