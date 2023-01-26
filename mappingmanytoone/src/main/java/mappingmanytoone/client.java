package mappingmanytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;






@Entity
public class client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int id;
	private String fname, email;
	
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinTable(name="newtable", joinColumns=@JoinColumn(name="userid"), inverseJoinColumns=@JoinColumn(name="addressid"))
	
	
//	@OneToMany(targetEntity = order.class, cascade=CascadeType.ALL, mappedBy="client")
//	@JoinColumn(name="userid", referencedColumnName="userid")
	
	
	@OneToMany(mappedBy = "client", targetEntity = order.class, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
	private List<order> address=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public List<order> getAddress() {
		return address;
	}
	public void setAddress(List<order> address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}



