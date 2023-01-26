class one{
	void meth1() {
		System.out.print("first first ");
	}
	void meth2(){
		System.out.print("first second A ");
	}
}
class two extends one{
	void meth3() {
		System.out.print("second first ");
	}
	@Override
	void meth2(){//same method name for overriding
		System.out.print("second second B ");
	}
}
public class methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two b=new two();
		b.meth1();
		b.meth2();

	}

}
