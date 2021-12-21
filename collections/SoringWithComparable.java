package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Object>{
	private String StudentName;
	private int rollNo;
	private int studentAge;
	public String rollno;
	public String name;
	public String age;
	public Student(String studentName, int rollNo, int studentAge) {
		
		StudentName = studentName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	//we need to create method explicitly to accomplish the sort mechanism
	public int compareto(Student comparestd) {
		int compareage=((Student )comparestd).getStudentAge();
		return this.studentAge-compareage;
		/* Decending order*/
		
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", rollNo=" + rollNo + ", studentAge=" + studentAge + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class SoringWithComparable {

	public static void main(String[] args) {
		ArrayList<Student> Array =new ArrayList<Student>();
		Array.add(new Student("Sachin",223,18));
		Array.add(new Student("Java",224,20));
		Array.add(new Student("Programming",225,21));
		Array.add(new Student("with",226,22));
		Array.add(new Student("ArraySorting",227,23));
		Collections.sort(Array);
		for(Student str:Array) {
			System.out.println(str);
		}

	}

}
