package JavaOOPS;


class MyParentClass{
	MyParentClass(){
		System.out.println("My first constructor");
	}
}
	class MyChildClass extends MyParentClass{
		MyChildClass(){//super()
		System.out.println("My child class constructor ");
	}
}







public class ExtendConstructor {

	public static void main(String[] args) {
		// while creating an object
		new MyChildClass();

	}

}
