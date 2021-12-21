package Encapsulation;

class Student_info{
	//usn,stfname,stlname,stmarks,stdept,stcity
	//Student information as declaration 
	private int usn;
	private String stFname;
	private String stLname;
	private String StDept;
	private String stCity;
	//create setter and getter methods
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getStFname() {
		return stFname;
	}
	public void setStFname(String stFname) {
		this.stFname = stFname;
	}
	public String getStLname() {
		return stLname;
	}
	public void setStLname(String stLname) {
		this.stLname = stLname;
	}
	public String getStDept() {
		return StDept;
	}
	public void setStDept(String stDept) {
		StDept = stDept;
	}
	public String getStCity() {
		return stCity;
	}
	public void setStCity(String stCity) {
		this.stCity = stCity;
	}
	
	
}


public class StudentEncap {

	public static void main(String[] args) {
		// we need to create an object <=====class<===object
		Student_info stob=new Student_info();
		stob.setUsn(1010);
		stob.setStFname("Sachin");
		 stob.setStLname("A");
		 stob.setStCity("Bangalore");
		 stob.setStDept("CSE");
		 System.out.println("Stdent usn: "+stob.getUsn());
		 System.out.println("Student First name: "+stob.getStFname());
		 System.out.println("Student last name: "+stob.getStLname());
		 System.out.println("Student Dept name: "+stob.getStDept());
		 System.out.println("Student city: "+stob.getStCity());
		 
	}

}
