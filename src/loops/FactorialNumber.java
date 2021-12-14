package loops;

public class FactorialNumber {

	public static void main(String[] args) {
		// program to find factorial number using for loop
		int number=5;//5!--->5*4*3*2*1==>120
		//variable to store final variable
		long factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
			System.out.println("index of"+i);
		}
		
System.out.println("Factorial of "+number +"is"+ factorial);
	}

}
