package mappingmanytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class food {

	@Id
	@Column(name="foodid")
	int id;
	
	String name;

	@ManyToOne(targetEntity=user.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	@JsonBackReference
	private user u;
	
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

	public food(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public food() {
		super();
	}
	
	
}
