package springstart01;

import java.util.List;

public class user {
	int id;
	String name;
	String description;
	int price;
	int serve_qty;
	List<String> address;
	public user(int id, String name, String description, int price, int serve_qty, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.serve_qty = serve_qty;
		this.address = address;
	}
	public user() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getServe_qty() {
		return serve_qty;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", serve_qty=" + serve_qty + ", address=" + address + "]";
	}
	public void setServe_qty(int serve_qty) {
		this.serve_qty = serve_qty;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
}
