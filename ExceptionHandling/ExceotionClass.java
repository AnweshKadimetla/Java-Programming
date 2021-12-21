package ExceptionHandling;

public class ExceotionClass {
	int i=10;
	int j=0;
	void dis()
	{
	try {
		int k=i/j;
	}
	catch(Exception e) {
		System.out.println("Any thing is not divisible Zero");
	}
	finally {
		System.out.println("This is finally block");
	}
	}
	public static void main(String[] args) {
		ExceotionClass obj=new ExceotionClass();
		obj.dis();
	}

}
