package JavaOOPS;

class Car{
	//state or field;
	int gear=5;
	int accelarator=140;
	//Behavior or method;
	public void breaking() {
		System.out.println("working of Breaking "+gear);
	}
	public void speed(){
			System.out.println("Driving speed "+accelarator);
		}

	
}

public class ExampleImplementationOfClassAndObject {

	public static void main(String[] args) {
		Car Object=new Car();
		Object.breaking();
		Object.speed();
	}

}
