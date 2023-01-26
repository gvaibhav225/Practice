package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	private int id;
	

	private String name;
	private String description;
	

	private int price, serve_qty;

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

	public void setServe_qty(int serve_qty) {
		this.serve_qty = serve_qty;
	}

	public Food( int id, String name,
			String description, int price,
		int serve_qty) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.serve_qty = serve_qty;
	}

	public Food() {
		super();
	}
	
	

}
