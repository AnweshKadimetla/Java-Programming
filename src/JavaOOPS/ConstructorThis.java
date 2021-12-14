package JavaOOPS;

//Class------>constructor----->method---->object
class Employee{
	//states
	int id;
	String name;
	
	//parameterized constructor
	public Employee(int id,String name) {
		super();//super keyword is optional
		this.id=id;
		this.name=name;
		
		//In order to state of the class into the constructor we will need this keyword
		//and this keyword which helps to initialize the value to the class property
		
	}
	//method to get employee details---id and name
	void info() {
		System.out.println("Id: "+ id +" name: "+name);
	}
}



public class ConstructorThis {

	public static void main(String[] args) {
		// 
		Employee emp=new Employee(101,"anwesh");
		Employee emp1=new Employee(102,"anwesh");
		emp.info();
		emp1.info();
	}

}
