package PractiseOfJavaPrograms;
//Parent Class
class Parent_one{
	//Overrided Method
	void display() {
		System.out.println("This is Parent Class");
	}
}
public class Practice_Super_Method extends Parent_one{
	//Overriding Method
	void display() {
		/*I want to display method of parent class 
		 * In this time i will super keyword
		 */
		super.display();
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		// create object to child class
		Practice_Super_Method obj=new Practice_Super_Method();
		obj.display();

	}

}
