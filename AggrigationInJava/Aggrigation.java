package AggrigationInJava;
//Aggrigation<======Two classes+Parameterized constructor
class Address{
	int Street;
	String city;
	String state;
	String country;
	public String studentname;
	public char[] rollno;
	public Object studentadr;
	//parameterized constructor
	Address(int street,String c,String s,String coun){
		this.Street=street;
		this.city=c;
		this.state=s;
		this.country=coun;
	}
}

class Student{
	int rollno;
	String studentname;
	Address studentadr;
	//parameterized constructor
	Student(int roll,String name, Address addr ){
		this.rollno=roll;
		this.studentname=name;
		this.studentadr=addr;
	}
}



public class Aggrigation {
	

	public static void main(String[] args) {
		// object created for the Address class
		Address obj=new Address(101, "Bider","karnataka", "India");
		//object created for the Student class
		Student	obje=new Student(101,"Sachin", obj);
		System.out.println("studentname: "+obje.studentname);
		System.out.println("rollno: "+obje.rollno);
		//System.out.println(obje.studentadr.rollno);
		System.out.println("Street: "+obje.studentadr.Street);
		System.out.println("city: "+obje.studentadr.city);
		System.out.println("state: "+obje.studentadr.state);;
		System.out.println("country: "+obje.studentadr.country);
	}

}
