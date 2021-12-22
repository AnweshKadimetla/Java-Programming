package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// 
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(10);
		link.add(20);
		link.add(30);
		link.addFirst(5);
		link.addLast(100);
		Iterator<Integer> iterator=link.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
