package Final;


class MethodFinal{
	//Create final method
	 final void finalMethod() {
		System.out.println("Final method");
	}
}


public class FinalMethod extends MethodFinal {
	/*void finalMethod(){//This is the Shows error because we can't override final method
		System.out.println("Final class method");
	}*/
	void demo() {
		System.out.println("Final method classs");
	}

	public static void main(String[] args) {
		FinalMethod obj=new FinalMethod();
			//Using subclass I am trying to access parent class
			obj.demo();
			obj.finalMethod();
			//Trying to reference Parent to create object to child class
			//MethodFinal ob=new FinalMethod();
			
		}

	}

}
