package collections;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		// we need to create an arrayList
		ArrayList<String> elements=new ArrayList<String>();
		//Adding elemtes to the array list
		elements.add("AB");
		elements.add("CD");
		elements.add("EF");
		elements.add("GH");
		System.out.println("ArrayList before remove");
		for(String var:elements) {
			System.out.println(var);
		}
		////Remove the elments
		////Removing elemets from index 0
		elements.remove(0);
		//Removing elements from index 2
		elements.remove(1);
		System.out.println("ArrayList after remove");
		for(String var:elements) {
			System.out.println(var);
		}
	}

}
