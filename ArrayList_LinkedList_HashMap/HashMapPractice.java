package ArrayList_LinkedList_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(10, "Java");
		h.put(20, "c#");
		h.put(250, ".Net");
		h.put(40, "python");
		h.put(35, "Cloud");
		h.put(30, "Networking");
		
		System.out.println(h);
		
		Set<?> value=h.entrySet();
		Iterator<?> itr=value.iterator();
		while(itr.hasNext()) {
			Map.Entry Nentry=(Map.Entry)itr.next();
			System.out.println("Key is:"+Nentry.getKey() + "& Values is:"+Nentry.getValue());
		}
		
		System.out.println("Value index of 10:"+h.get(1));
		//Remove
		
		System.out.println("REmoving values from hashMap "+h.remove(10));
		System.out.println("After removing hash map"+h);	
		//Size of hash map
		
		System.out.println("size of hash Map:"+h.size());
		//clone method
		
		System.out.println("Specific element" );
		System.out.println("Clone method"+h.clone());
		
		//size()
		System.out.println("Size of of the hash map :"+h.size());
		
		//isEmpty
		
		System.out.println("IsEmpty method :"+	h.isEmpty());
		
		//get method
		System.out.println("get method :"+h.get("Java"));
		
		//values()
		System.out.println("All values of HashMap :"+h.values());
		
		//
		System.out.println("All Keys of HashMap"+h.keySet());
		
		//clear method
		h.clear();
		System.out.println("Clearing the hashmap"+h);
		System.out.println("Sorting the Hashmap");
		
		
		
	}

}
