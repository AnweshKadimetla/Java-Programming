package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class ComparableInterface {

	public static void main(String[] args) {
		//Create an ArrayList
		ArrayList<Student> al=new ArrayList<Student>();
		//Add elements by using Add() in the Array list
		al.addAll((Collection<? extends Student>) new ComparableCode(101,"Vijay",23));
		al.addAll((Collection<? extends Student>) new ComparableCode(106,"Ajay",27));
		al.addAll((Collection<? extends Student>) new ComparableCode(105,"jay",21));
		//Apply sorting
		Collections.sort(al);
		//Print elements using for each loop
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		

	}

}
