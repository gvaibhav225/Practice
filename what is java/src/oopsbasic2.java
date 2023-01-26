class square{
	int s;
	void setside(int s) {
		this.s=s;
	}
	void parameters(){
		System.out.print("side is"+" "+s);
		System.out.print("area is"+" "+s*s);
		System.out.print("parameter is"+" "+ 4*s);
	}
}
public class oopsbasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square room=new square();
		room.setside(5);
		room.parameters();

	}

}
