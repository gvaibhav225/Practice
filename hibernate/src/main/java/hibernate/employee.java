package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	
    @Id   
    private int iid;
	private String name;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

} 
