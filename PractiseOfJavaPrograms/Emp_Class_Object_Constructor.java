package PractiseOfJavaPrograms;

public class Emp_Class_Object_Constructor {
	//Fields
	int Eid;
	String Ename;
	int Salary;
	
	Emp_Class_Object_Constructor(int Eid,String Ename,int Salary){
		System.out.println("Employee ID:"+Eid+" "+"Employee Name:"+Ename+" "+"Employee Salary"+Salary);
	}

	public static void main(String[] args) {
		// create Object to Emp_Class_Object_Constructor
		Emp_Class_Object_Constructor obj=new Emp_Class_Object_Constructor(4616,"Sachin",100000);
	}

}
