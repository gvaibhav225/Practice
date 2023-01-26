package mappingmanytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name="order_details")
public class order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="addressid")
	private int id;
	private String addressLine1, city, state;
//	@ManyToOne
//	@JoinColumn(name="userid")
	
	@ManyToOne(targetEntity = client.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "userid")
	private client client;
	public int getId() {
		return id;
	}
	public client getClient() {
		return client;
	}
	public void setClient(client client) {
		this.client = client;
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



