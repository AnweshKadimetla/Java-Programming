package JavaOOPS;


class Employee_all{
	private int variable;
	
	// default constructor
	public Employee_all() {
		this.variable=10;
	}
	//parametarized constructor
	public Employee_all(int num) {
		this.variable=num;
	}
	////method to access the value for integer
	public int getValue() {
		return variable;
	}
}





public class MultipleConstructor {

	public static void main(String[] args) {
		Employee_all obj=new Employee_all();
		Employee_all obj1=new Employee_all(100);
		System.out.println(obj1.getValue());
		System.out.println(obj1.getValue());

	}

}
