package PractiseOfJavaPrograms;
//Parent class
class Parent{
	String name="Sachin";
	int rollnumber=125;
	public void display() {
		System.out.println("This is parent class");
	}
}


//Child class
public class Practice_Super_Keyword extends Parent{
	/*Super Keyword is reference variable to access parent data members
	 * to child class  
	 */
	String name="Trainer Sachin sir";
	int rollnumber=150;
	void show() {
		System.out.println(name+super.name);
			System.out.println("Roll Number "+super.rollnumber);	
	}
	public static void main(String[] args) {
		//create object the Child class
		Practice_Super_Keyword obj=new Practice_Super_Keyword();
		obj.show();//This is child class details
		/* now i want to access parent data members 
		 * so i will use super keyword
		 */
		
		
		
	}
}
