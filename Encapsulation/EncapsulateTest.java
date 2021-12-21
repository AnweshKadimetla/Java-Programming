package Encapsulation;
//Create another class with some variables
//Employee information
class Employ{
	private String empname="Schin A";
	private int empid=101;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class EncapsulateTest {
	String name="Sachin";

	public static void main(String[] args) {
		EncapsulateTest obj=new EncapsulateTest();
		//Create an object to another class
		Employ obje=new Employ();
		System.out.println(obje.empname);
		System.out.println(obje.empid);
		System.out.println(obj.name);

	}

}
