package JavaOOPS;

class Computer{
	//Declaration of variables
	private String name;
	private String language;
	private String city;
	private String state;
	private int i;
	private Computer(){
		System.out.println("This is No-argumentt constructor");
		//Variable is name
		 name="Anwesh";
		 language="Java_Core_OOP";
		 city="Kurnool";
		 state="AndhraPradesh";
		i=5;
		Computer object=new Computer();
		//Printing Name,language,city and state
		System.out.println("My Name is: "+object.name);
		System.out.println("I am learning: "+object.language);
		System.out.println("My city: "+object.city);
		System.out.println("My State: "+object.state);
			
	}
	
}
class PublicConstructor{
	int i;
	boolean lang;
	int numb;
	//defining constructor
	public PublicConstructor() {
		i=100;
		System.out.println("This is No-arg Constructor");
	}
	public PublicConstructor(String language,int number) {
		//languages=language;
		System.out.println("language is "+ language +"Is easy");
		System.out.println("entered nuber is "+number);
	}
	//Default constructor
	
}

public class onstructorInJava {

	public static void main(String[] args) {
		PublicConstructor obj=new PublicConstructor("Java_Programming",10);
		System.out.println("Default value");
		System.out.println("lang is "+obj.lang);
		System.out.println("number is"+obj.numb);
		

	}

}
