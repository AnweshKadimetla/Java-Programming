package OOPs_In_Features_Abstraction;


abstract class Animal_one{
	//abstract method
	public abstract void animalSound();
	void sleep() {
		System.out.println("ZzzzzzZzzz");
	}
}
class Man extends Animal_one{
	public void animalSound() {
		System.out.println("man says: Gurr Gurr");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Man obj=new Man();
		obj.sleep();
		obj.animalSound();

	}

}
