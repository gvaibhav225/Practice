package com.example.springbootpractice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;





@Entity
@Table(name="order_details")
public class order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="addressid")
	private int id;
	private String addressLine1, city, state;
//	@ManyToOne
//	@JoinColumn(name="userid")
	
	@ManyToOne( fetch=FetchType.LAZY)
	@JoinColumn(name = "userid")
	@JsonBackReference
	private userentity usere;
	public int getId() {
		return id;
	}

	public userentity getUsere() {
		return usere;
	}

	public void setUsere(userentity usere) {
		this.usere = usere;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	

}



