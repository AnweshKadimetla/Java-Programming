package OOPs_In_Features_Abstraction;
//Abstract parent class
abstract class Animal {
//Abstract method
	public abstract void sound();
	public void display() {
		System.out.println("Bow Bow");
		System.out.println("How it does???");
	}
	
}
public class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks:Bow Bow");
	}
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.display();
		obj.sound();

	}
}
	


