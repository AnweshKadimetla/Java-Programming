package collections;

import java.util.ArrayList;

public class ArrayListsInJava {

	public static void main(String[] args) {
		//we had create an array-list
		ArrayList<String> Names=new ArrayList<String>();
		//add an elements to the arrylist
		//In built method i.e add();//This will take only one parameter <INT,STRING>
		Names.add("Sachin");
		Names.add("Java");
		Names.add("Java Programming");
		Names.add("ArrayList");
		Names.add("Bangalore");
		//Display the array elements
		System.out.println("Array List elements are: "+Names);
		//If you want to add any elements at any place of the position within the array...
		Names.add(3, "oneplus");
		System.out.println("New elements added to the arraylist");

		System.out.println(Names);
		//We can the value the elemets of an arrays at any movement of time.
		Names.add(3, "Technical");
		System.out.println("Element is been changed position no.3");
		System.out.println(Names);
		
		//In order to remove elemets specified position in array list
		Names.remove("ArrayList");///Same as Names.remove(4)
		System.out.println("list elements after removing 'ArrayList'");
		System.out.println(Names.get(0));
		System.out.println(Names.get(1));
		System.out.println(Names.get(2));
		System.out.println(Names.get(3));
		System.out.println(Names.get(4));
		System.out.println("This is from advance loop");
		//Loop: For Loop : For each Loop
		for(int i=0;i<Names.size();i++) {
			System.out.println(Names.get(i));
		}
		System.out.println("This is for each loop");
		for(String result:Names) {
			System.out.println(result);
		}
	}

}
