package MethodOverridingAndDynamicDispatch;

public class SubclassDemoDEF extends SuperABCclass{
	
	public void myMethod() {
		//Super keyword is used to call parentclass
		super.myMethod();
		System.out.println("Overriding method-SubClass");
	}

	public static void main(String[] args) {
		
		SuperABCclass obj=new SubclassDemoDEF();
		obj.myMethod();

	}

}
