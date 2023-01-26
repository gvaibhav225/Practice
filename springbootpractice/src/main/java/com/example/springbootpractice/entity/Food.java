package com.example.springbootpractice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Food {
	
	@Id
	@NotNull(message="can't be empty")
	private int id;
	
	@NotEmpty(message="can't be empty")
	private String name;
	private String description;
	
	@NotNull(message="can't be empty")
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

	public Food(@NotNull(message = "can't be empty") int id, @NotEmpty(message = "can't be empty") String name,
			String description, @NotNull(message = "can't be empty") int price,
			@NotNull(message = "can't be empty") int serve_qty) {
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
