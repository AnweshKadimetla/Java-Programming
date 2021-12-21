package AccessModifiers;

public class Default {
	int addTwoMethods(int a,int b) {
		return a+b;
	}
	int addTwo(int one,int two) {
		return one+two;
	}

	public static void main(String[] args) {
		//we need to create an object
		Default obj=new Default();
		System.out.println(obj.addTwoMethods(10, 20));
		System.out.println(obj.addTwo(30,50));
	}

}
