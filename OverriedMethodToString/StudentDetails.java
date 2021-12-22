package OverriedMethodToString;

import java.util.ArrayList;

public class StudentDetails {

	public static void main(String[] args) {
		// I order to store the student details
		//I will go ahead and create a arrayList
		
		//
		
		/*Note : whenever dealing with the constructor make sure we create object
		 * The array List should be pointing to the class name if the constructor is
		 * present is another class*/
		System.out.println("We don't need to use encpsulation(Getter() and setter()) Now we will use toSrting()");
		ArrayList<Student> student=new ArrayList<Student>();
		student.add(new Student("Sachin",28,"Bangalore"));
		student.add(new Student("Sourav",44,"KolKata"));
		student.add(new Student("Rahul",27,"Indore"));
		student.add(new Student("Laxman",28,"Hyderbad"));
		student.add(new Student("Kohli",28,"DElhi"));
		
		for(Student details:student)
			System.out.println(details);
		
		
	}

}
