package Final;
//
//final :- we can't extend final class
final class Example{
	
}


public class FinalClass extends Example {
	void method() {
		System.out.println("Sub class");
	}
	public static void main(String[] args) {
		FinalClass obj=new FinalClass();
		obj.method();

	}

}
