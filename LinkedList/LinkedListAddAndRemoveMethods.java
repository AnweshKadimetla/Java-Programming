package LinkedList;

import java.util.LinkedList;

public class LinkedListAddAndRemoveMethods {

	public static void main(String[] args) {
		
		//Creteate an object for to have LinkedLidt
		LinkedList<String> cities=new LinkedList<String>();
		cities.add("Bangalore");
		cities.add("Jaipur");
		cities.add("Goa");
		cities.add("Ladak");
		cities.add("Kashmir");
		System.out.println("Elemets of the linked list before remove "+cities);
		//Removing from the elements from the linked list
		//as same as remove()
		cities.remove();//Remove method will removes first elemet every time
		System.out.println("Elemets of the linked list After remove "+cities);
		cities.remove();//Jaipur
		System.out.println("Elemets of the linked list After remove "+cities);
		cities.remove();//Kashmir
		System.out.println("Elemets of the linked list After remove "+cities);
		System.out.println("Elements of the linkedList at 3rd position"+cities);
		cities.removeFirst();
		System.out.println("Elemets of the linked list remove After method "+cities);
		cities.removeLast();		
		System.out.println("Elemets of the linked list remove After method "+cities);

		
		
		
	}

}
