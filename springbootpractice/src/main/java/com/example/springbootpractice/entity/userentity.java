package com.example.springbootpractice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class userentity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="userid")
int id;
String name;
@OneToMany(cascade=CascadeType.ALL,mappedBy="usere",fetch=FetchType.LAZY)
@JsonManagedReference
List<order> orders=new ArrayList<>();

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<order> getOrders() {
	return orders;
}
public void setOrders(List<order> orders) {
	this.orders = orders;
}
public userentity() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public userentity(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
