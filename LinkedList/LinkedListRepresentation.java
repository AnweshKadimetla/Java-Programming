package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepresentation {

	public static void main(String[] args) {
		
		//Creating LinkedList
		LinkedList<String> list=new LinkedList<String>();
		list.add("Bangalore");
		list.add("Mumbai");
		list.add("Hydrabad");
		list.add("Chennai");
		System.out.println("Elements of the list is:"+list);
		
		//I wnat to add some more elements to the linked list
		//1st position 
		list.addFirst("Delhi");
		//last position
		list.addLast("Trivendram");
		//2nd position
		list.add(2,"Bider");
		System.out.println("Linked list after adding few more elements :");
		System.out.println(list);
		//Iterating LinkedList
		Iterator<String> iterator= list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
	}

}
