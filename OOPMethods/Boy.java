package OOPMethods;

public class Boy extends Human{
	//Method for override
		public void eat() {
			
			System.out.println("Boy is eatingggg!!");
		}
		public void study() {
			System.out.println("Boy is studyyyyy");
		}
		public void sleep() {
			System.out.println("Boy is sleepinggggg");
		}
		public void printParent() {
			super.eat();
			super.study();
			super.sleep();
		}
		//I made the similar method parent as well as child class

	public static void main(String[] args) {
		
		Boy obj=new Boy();
		obj.eat();//child class execution
		System.out.println("This is executing from Parent class");
		obj.printParent();//parent class execution
		obj.study();
		System.out.println("This is executing from Parent class");
		obj.printParent();
		obj.sleep();
		System.out.println("This is executing from Parent class");
		obj.printParent();
	}

}
