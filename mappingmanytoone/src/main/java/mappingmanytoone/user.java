package mappingmanytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class user {
	@Id
	@Column(name="userid")
	int id;
	
//	@OneToOne
//	@JoinColumn(name="foodid")
//	private food f;
	
	@OneToMany(targetEntity=food.class, mappedBy="u",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<food> f;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<food> getF() {
		return f;
	}

	public void setF(List<food> f) {
		this.f = f;
	}

	public user(int id, List<food> f) {
		super();
		this.id = id;
		this.f = f;
	}

	public user() {
		super();
	}

}
