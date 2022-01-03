package org.tutorials.ProjectWithMaven;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_details")
public class Product {
	@Id
	private int pid;
	private String pname;
	private String desc;
	private int prodprice;
	
	public Product(int pid, String pname, String desc, int prodprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.prodprice = prodprice;
	}
	public Product() {
		super();
	}
	//Getter and Setter
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
	public int getProdprice() {
		return prodprice;
	}
	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	@Override
	public String toString() {
		return this.pid+":"+this.pname+":"+this.desc+":"+this.prodprice;
	}
	
}
