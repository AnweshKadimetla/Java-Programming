package collections;

import java.util.ArrayList;
import java.util.Collections;

public class AdvIntegerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ListOfCountries=new ArrayList<Integer>();
		int Sum=0;
		int sum(ArrayList<Integer> ListOfCountries) {
		ListOfCountries.add(73);
		ListOfCountries.add(24);
		ListOfCountries.add(10);
		ListOfCountries.add(15);
		ListOfCountries.add(5);
		for(int i=0;i<ListOfCountries.size();i++) {
			 Sum=Sum+ListOfCountries.get(i);
		}
		}
		System.out.println("ListOfCountries elements are"+Sum);
		
	/*	/* Unsorted list*/
		/*System.out.println("Arrays before sorting..");
		for(String counter:ListOfCountries) {
			System.out.println(counter);
		}
		///* Sorted List*/
		/*Collections.sort(ListOfCountries);
		System.out.println("After sotring");
		for(String counter : ListOfCountries) {
			System.out.println(counter);
		}*/
	}

}
