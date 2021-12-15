package PractiseOfJavaPrograms;

public class Class_Object_Constructor {
	//Class name--->Class_Object_Constructor
	//Declare fields
	int Snum;
	String Sname;
	int rollno;
	//Create default Constructor
	Class_Object_Constructor(){
		System.out.println("===Default Constructor values=====");
		System.out.println("Student name:"+Sname+"\n"+"Student Number"+rollno+"\n"+"Student Phone Number: "+Snum);
	}
	//create Parameterized constructor
	Class_Object_Constructor(int num,String name,int roll){
		System.out.println("===Parameterized Constructor values=====");
		System.out.println("Student name:"+num+"\n"+"Student Number"+name+"\n"+"Student Phone Number: "+roll);
	}
	public static void main(String[] args) {
		//create object 
		Class_Object_Constructor obj=new Class_Object_Constructor();
		Class_Object_Constructor obje=new Class_Object_Constructor(100,"Sachin",9698);

	}

}
