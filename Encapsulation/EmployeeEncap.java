package Encapsulation;
class Employee{
	private int empid;
	private String empFname;
	private String empLname;
	private String desiganation;
	private String empProject;
	private String empCity;
	//create setter and getter methods
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpFname() {
		return empFname;
	}
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	public String getDesiganation() {
		return desiganation;
	}
	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}
	public String getEmpProject() {
		return empProject;
	}
	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
	
}



public class EmployeeEncap {

	public static void main(String[] args) {
		// create an object to class
		Employee obj=new Employee();
		obj.setEmpid(1010);
		obj.setEmpFname("Sachin");
		obj.setEmpLname("A");
		obj.setDesiganation("Senior Engineer");
		obj.setEmpProject("java Project");
		obj.setEmpCity("bangalore");
		System.out.println("emp id: "+obj.getEmpid());
		System.out.println("emp First name:"+obj.getEmpFname());
		System.out.println("emp last name:"+obj.getEmpLname());
		System.out.println("emp designation: "+obj.getDesiganation());
		System.out.println("emp project name:"+obj.getEmpProject());
		System.out.println("emp city:"+obj.getEmpCity());
	}

}
