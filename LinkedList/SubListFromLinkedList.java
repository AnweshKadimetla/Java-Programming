package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubListFromLinkedList {

	public static void main(String[] args) {
		// LinkedList and its sublist
		//Create an object to linkedList
		LinkedList<String> grocessary=new LinkedList<String>();
		grocessary.add("Rice");
		grocessary.add("oil");
		grocessary.add("daal");
		grocessary.add("Soap");
		grocessary.add("Shampoo");
		grocessary.add("Solt");
		System.out.println(grocessary);
		//Loop==>iterator
		Iterator<String> iterator=grocessary.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		//Obtaining sublist[Anything] from the LinkedList[grocessary]
		List Anything=grocessary.subList(2,5);
		System.out.println("This is a part of Original list"+Anything);
		

	}
	
	
	
	
	
}
