@FunctionalInterface//MEANS interface has only one method
interface exp {
	void meth1(int a);
}
public class lamdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in order to use interface we not need to make a class then implemet it and override it we can use this
		exp l1=(int a)->{
			System.out.print("Lamda way");
		};//remember; this here
		l1.meth1(4);
		}

}
