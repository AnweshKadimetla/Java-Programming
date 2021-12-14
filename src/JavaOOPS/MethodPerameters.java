package JavaOOPS;

public class MethodPerameters {

	// A method with no parameters
			public void display() {
				System.out.println("Method without parameters");
			}
			////Method with a single parameter
			public void display_one(int parameter) {
				System.out.println("method with single parameter: "+parameter);
			}
			
			//I would like to calculate square of a number using for loop
			//create a method
			public static int getSquare(int number) {
				return number*number;
			}
			
			
			//main metod
	public static void main(String[] args) {
		//create a object
		MethodPerameters anyname=new MethodPerameters();
		//calling the method with no parameter
		//System.out.println("calling the method with no parameter");
		anyname.display();
		//calling the method with one parameter
		//System.out.println("calling the method with one parameter");
		anyname.display_one(24);
		//Implement the loop
		for(int i=0;i<=5;i++) {
			//Method call
			int square=getSquare(i);
			System.out.println("Square of"+i+"="+square);
		}
	}

}
