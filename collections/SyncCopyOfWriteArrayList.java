package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncCopyOfWriteArrayList {

	public static void main(String[] args) {
		// 
		System.out.println("***************SyncCopyOfWriteArrayListMethod************");
		
		
		//List<String> sync_col=Collections.synchronizedList(new ArrayList<String>());
		//Adding elements to the Syncronized array list
		SyncCopyOfWriteArrayList array_syn=new SyncCopyOfWriteArrayList();
		
		array_syn.add("Phone");
		array_syn.add("mobile");
		array_syn.add("Laptop");
		System.out.println("Iterating Syncronized ArrayList");
		synchronized(array_syn) {
			//we will use one more collection type: Iterator
			Iterator<String> iterator=array_syn.iterator();
			while(iterator.hasNext()) 
				System.out.println(iterator.next());//This will read index to index
			

	}

}

	private Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
}
	