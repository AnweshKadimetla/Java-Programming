package PractiseOfJavaPrograms;
//Parent class....we will Parent reference refers to child class
class Super_Class{
	//Overriding Method
	void college() {
		System.out.println("College:Jntuk");
	}
}
public class Practice_MethodOverriding_Dispatch extends Super_Class {
	//Overiding Method
	void college() {
		System.out.println("College:Child");
	}

	public static void main(String[] args) {
		// Parent class reference refers to child
		Super_Class obj=new Practice_MethodOverriding_Dispatch();
		obj.college();

	}

}
