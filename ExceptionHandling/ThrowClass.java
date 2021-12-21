package ExceptionHandling;

public class ThrowClass {
	void display(int age) {
		if(age<18)
		{
		throw new ArithmeticException("The person is not elegible for vote");
		}
		else {
			System.out.println("Person is elegible for vote");
		}
	}

	public static void main(String[] args) {
		
		ThrowClass obj=new ThrowClass();
		obj.display(20);
	}

}
