class product{
	int pid, price;
	String name;
	
	product(){
		System.out.println("product object constructed");
	}
	void setproductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		
	}
	void showproductDetails() {
		System.out.println(pid);
	}
}
	class mobile extends product{
		String os;
		int ram;
		void setproductDetails(int pid, String name, int price, String os, int ram) {
			this.pid = pid;
			this.name = name;
			this.price = price;
			this.os = os;
			this.ram = ram;
			
	}
		void showproductDetails() {
			System.out.println(pid);
			System.out.println(ram);
	
}
	}
public class inheritanceextend {

	public static void main(String[] args) {
		product phone = new product();
		System.out.println(phone);
		phone.setproductDetails(100, "nokia", 5000);
		phone.showproductDetails();
		mobile mi = new mobile();
		mi.setproductDetails(101, "10i", 21500, "windows", 8);
		mi.showproductDetails();

	}
}
