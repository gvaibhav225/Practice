class Lib{
	void addbooks(int ...add) {
		
		for(int a:add)
			{
			System.out.print("books are added"+a);
			}
	}
	void returnbooks(int ...ret){
		System.out.print("first second A ");
	}


	void issuebooks(int ...iss) {
		System.out.print("second first ");
	}
	
	void showavailablebooks(int ...sho){//same method name for overriding
		System.out.print("second second B ");
	}

}
public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib book= new Lib();
		book.addbooks(4,5,6);
		

	}

}
