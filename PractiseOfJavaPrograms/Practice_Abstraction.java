package PractiseOfJavaPrograms;

//create abstract class by using "abstract" keyword only
//abstract class contain --->no reference is created
//1.abstract methods-->these are implemented by child class only
//2.Non-abstract methods

abstract class Abstract{
	//abstract method
	  abstract void feature();
	  //non-abstracted method
	  void next() {
		  System.out.println("Vehicle has 3 wheels");
		  System.out.println("what is the Vehicle name????");
	  }
	
}

public class Practice_Abstraction extends Abstract {
	
	//Implements feature method
	void feature() {
		System.out.println("Vehicle name is AUTO");
	}
	
	public static void main(String[] args) {
		// create object to child class which is Practice_Abstraction 
		Practice_Abstraction obj=new Practice_Abstraction();
		obj.next();
		obj.feature();
	}

}
