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
public class inheritance {

	public static void main(String[] args) {
		product phone = new product();
		System.out.println(phone);
		phone.setproductDetails(100, "nokia", 5000);
		phone.showproductDetails();
		

	}

}
