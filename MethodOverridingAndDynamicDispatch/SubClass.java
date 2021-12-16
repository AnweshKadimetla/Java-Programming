package MethodOverridingAndDynamicDispatch;

public class SubClass extends ABC{
	//overriding method
	public void disp() {
		System.out.println("Disp() sub class");
	}
		
	public void newMethod() {
		System.out.println("newMethod() of sub class");
	}
	public static void main(String[] args) {
		// when parent class reference refer to the parent class object then in this case overridden method is the method  of parent of is called 
		ABC obj=new ABC();
		obj.disp();
		/*when parent class reference refers to the child class object
		 * then the overriding method(method child class)is called.
		 * dynamic dispatch and runtime polymorphism 
		 * 
		 */
		ABC object=new SubClass();
		object.disp();
	}

}
