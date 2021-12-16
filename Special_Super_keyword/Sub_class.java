package Special_Super_keyword;

public class Sub_class extends Parent_Class{
	//overriding method
	void display() {
		System.out.println("Child Method.");
	}
	//General method for the difference purpose
	void printMsg() {
		//This will call overriding method
		display();
		//This could call to the parent class
		super.display();
	}
	public static void main(String[] args) {
		// create object
		Sub_class obj=new Sub_class();
		obj.printMsg();
		

	}

}
