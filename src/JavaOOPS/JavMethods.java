package JavaOOPS;


//program : create java method and two numbers statically
public class JavMethods {
	// we actually declare other functions
	//Create method<<without static reference
			public int addNumbers(int number_one,int number_two) {
				int addition=number_one+number_two;
				//return value <=== coming back to screen after addition operation
				return addition;
			}
			
			public static int square(int num) {
				//2*2,3*3,4*4
				return num*num;
			}
	
	public static void main(String[] args) {
		// My main function/this is from where program ececution takes place.
		//a few functionality to be called here in main method
		int number_one=10;
		int number_two=20;
		JavMethods object=new JavMethods();
		//I need to creating object  <=== a reference point fot the method created
		int result=object.addNumbers(number_one,number_two);
		System.out.println("Sum is: "+result);
		
		//Implementation for the 2nd method
		int res;
		//I dont need to create object explicitly
		res=square(14);
		System.out.println("The square is: "+res);
	}

}
