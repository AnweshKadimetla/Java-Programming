package OverriedMethodToString;

public class Student {
		
	//I would like to store some student details.
	//Best practice in full stack development interms of instance variable 
	//using them in private access specifier
	private String studentName;
	private int studentAge;
	private String city;
	
	//we need to constructor to initialize value into the instance variable
	Student(String studentName,int studentAge,String city){
		this.studentName=studentName;
		this.studentAge=studentAge;
		this.city=city;
	}

	@Override
	public String toString() {
		return "Student details:  [studentName=" + studentName + ", studentAge=" + studentAge + ", city=" + city + "]";
	}
	
}
