package LinkedList;

import java.util.LinkedList;

public class ObjectsInLinkedList {

	public static void main(String[] args) {
		//Creating an object for LinkedList
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("item 1");
		linkedlist.add("item 4");
		linkedlist.add("item 2");
		linkedlist.add("item 6");
		linkedlist.add("item 3");
		linkedlist.add("item 5");
		//Display LinkedList
		System.out.println("Elements of the LinkedList "+linkedlist);
		linkedlist.addFirst("First Item");
		linkedlist.addFirst("First Item");
		linkedlist.addFirst("First Item");
		linkedlist.addFirst("First Item");
		System.out.println("After adding of the LinkedList"+linkedlist);
		
		
	}

}
