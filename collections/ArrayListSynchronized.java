package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {

	public static void main(String[] args) {
		System.out.println("***********Array Syncronization****************");
		// By default ArrayList is non-Synchronized but by using collections.synchronizedList() to synchronized them
		//ArrayList<String> sync_call=(ArrayList<String>) Collections.synchronizedList(new ArrayList<String>());
		//The best practice is make use of List insted of ArrayList
		List<String> sync_col=Collections.synchronizedList(new ArrayList<String>());
		//Adding elements to the Syncronized array list
		sync_col.add("Phone");
		sync_col.add("mobile");
		sync_col.add("Laptop");
		System.out.println("Iterating Syncronized ArrayList");
		synchronized(sync_col) {
			//we will use one more collection type: Iterator
			Iterator<String> iterator=sync_col.iterator();
			while(iterator.hasNext()) 
				System.out.println(iterator.next());//This will read index to index
			
		}
	}

}
