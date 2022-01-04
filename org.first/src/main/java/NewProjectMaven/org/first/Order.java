package NewProjectMaven.org.first;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_details")
public class Order {
	@Id
	private  int oid;
	private String name;
	private String desc;
	public Order(int oid, String name, String desc) {
		super();
		this.oid = oid;
		this.name = name;
		this.desc = desc;
	}
	public Order() {
		super();
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
