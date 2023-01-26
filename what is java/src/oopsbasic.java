class employee{
	int salary;
	String name;
	void setemployeedetails(String name)
	{
		this.name=name;
	}
	void getemployeedetails() {
		System.out.print(name);
		System.out.print(salary);
	}
}
public class oopsbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee one=new employee();
		one.setemployeedetails("RAMESH\n");
		one.salary=50000;
		one.getemployeedetails();

	}

}
