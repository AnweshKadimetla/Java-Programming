package org.tutorials.newmavenproject;

@Entity;
@
public class Product {
	private String pid;
	private String pname;
	private String desc;
	private int price;
	public Product(String pid, String pname, String desc, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.desc = desc;
		this.price = price;
	}
	public Product(){
		super();
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
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
