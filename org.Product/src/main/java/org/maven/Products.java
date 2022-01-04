package org.maven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_details")
public class Products {
	@Id
	private int pid;
	private String pname;
	private String desc;
	private int price;
	public Products(int pid, String pname, String desc, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.price = price;
	}
	public Products() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.pid+":"+this.pname+":"+this.desc+":"+this.price;
	}
	

}
