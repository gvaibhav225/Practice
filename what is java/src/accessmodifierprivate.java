class employeee{
	private int id;
	private String name;
	public void setdetails(int i, String n)
	{
		id=i;
		name=n;
	}
	public void getdetails() {
		System.out.printf("%d %s",id,name);
	}
	
}
public class accessmodifierprivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeee yo=new employeee();
		yo.setdetails(1, "Vaibhav");
		yo.getdetails();

	}

}
