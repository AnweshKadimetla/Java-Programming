package collections;

import java.util.ArrayList;
import java.util.Collections;

public class AdvPractice {
	//Sorting array List
	public static void main(String[] args) {
		//we create an array which are consisting of list of countries
		ArrayList<String> ListOfCountries=new ArrayList<String>();
		ListOfCountries.add("Indian");
		ListOfCountries.add("US");
		ListOfCountries.add("China");
		ListOfCountries.add("France");
		
		/* Unsorted list*/
		System.out.println("Arrays before sorting..");
		for(String counter:ListOfCountries) {
			System.out.println(counter);
		}
		/* Sorted List*/
		Collections.sort(ListOfCountries , Collections.reverseOrder());
		System.out.println("After sotring");
		for(String counter : ListOfCountries) {
			System.out.println(counter);
		}
	}

}
