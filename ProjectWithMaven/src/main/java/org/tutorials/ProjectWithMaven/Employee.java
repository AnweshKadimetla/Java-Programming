package org.tutorials.ProjectWithMaven;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	//empid,empname,empph,empdeskno
	@Id
	private int empid;
	private String empname;
	private int empph;
	private int empdeskno;
	public Employee(int empid, String empname, int empph, int empdeskno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empph = empph;
		this.empdeskno = empdeskno;
	}
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpph() {
		return empph;
	}
	public void setEmpph(int empph) {
		this.empph = empph;
	}
	public int getEmpdeskno() {
		return empdeskno;
	}
	public void setEmpdeskno(int empdeskno) {
		this.empdeskno = empdeskno;
	}
	@Override
	public String toString() {
		return this.empid+":"+this.empname+":"+this.empph+":"+this.empdeskno;
	}
	
	
	

    
    

}
