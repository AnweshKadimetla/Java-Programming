package PractiseOfJavaPrograms;

import AggrigationInJava.Address;
import AggrigationInJava.Student;

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

class Staff{
	String staffname;
	int staffstrength;
	Student st;
	Staff(String staffna,int staffstreng,Student std){
		this.staffname=staffna;
		this.staffstrength=staffstreng;
		this.st=std;
	}
	
}
class College{
	String collegename;
	int Numberofstudents;
	String collegeaddress;
	Staff s;
	College(String collegena,int Numberofstudents,String collegeaddre,Staff ss){
		this.collegename=collegena;
		this.Numberofstudents=Numberofstudents;
		this.collegeaddress=collegeaddre;
		this.s=ss;
	}
}









public class Practice_Aggrigation_Address_Student_Staff_College {

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
			//create Staff class
				Staff objec=new Staff("cse", 10, obje);
				System.out.println("staffname: "+objec.staffname);
				System.out.println("staffstrength: "+objec.staffstrength);
			//create object college
				College object=new College("Htd", 2000, "Kurnool", objec);
				System.out.println("collegename: "+object.collegename);
				System.out.println("Numberofstudents: "+object.Numberofstudents);
				System.out.println("collegeaddress: "+object.collegeaddress);

	}

}
