package PractiseOfJavaPrograms;
//Parent class
class Base{
	//Overriding Method
	void name() {
		System.out.println("First Name: A");
	}
}
public class Method_Overriding extends Base{
	//Overriding Method
	void name() {
		System.out.println("Last Name: Sachin");
	}

	public static void main(String[] args) {
		Method_Overriding obj=new Method_Overriding();
		obj.name();

	}

}
