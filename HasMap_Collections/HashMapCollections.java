package HasMap_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCollections {

	public static void main(String[] args) {
		// //Creating object to make HashMap
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		//In order to add elements to the hmap
		//put<----add()
		//I need to key value in order to get HashMap
		hmap.put(10, "KK");
		hmap.put(1, "KK");
		hmap.put(4, "AA");
		hmap.put(3, "ZZ");
		hmap.put(2, "vv");
		hmap.put(7, "JJ");
		//System.out.println("Elements to the hash map"+hmap);
		//Iterator
		//Get and set method
		/*Set<?> value=hmap.entrySet();
		Iterator<?> iterator = value.iterator();
		while(iterator.hasNext()) {
			Map.Entry Mentry=(Map.Entry)iterator.next();
			System.out.println("Key is: "+Mentry.getKey()+"& value is:"+Mentry.getValue());
		}*/
		//Get the values
	System.out.println("Value index of 10:"+hmap.get(1));
	//Remove
	System.out.println("REmoving values from hashMap "+hmap.remove(10));
	System.out.println("After removing hash map"+hmap);	
	//Size of hash map
	System.out.println("size of hash Map:"+hmap.size());
	//
	System.out.println("Specific element" );
	hmap.clear();
	System.out.println("Clearing the hashmap"+hmap);
	System.out.println("Sorting the Hashmap");
	//Create Hmap
	HashMap<Integer,String> hmapsh=new HashMap<Integer,String>();
	//we need to add elements to the hmapsh
	hmapsh.put(5,"Sachin");
	hmapsh.put(3, "Souvrav");
	hmapsh.put(4, "Virendra");
	hmapsh.put(2, "Zaheer");
	hmapsh.put(1, "Ashish");
	System.out.println("Before sorting");
	
	Set setmethod=hmapsh.entrySet();
	Iterator iter=setmethod.iterator();
	while(iter.hasNext()) {
		//create the object to differentiate keys and values
		Map.Entry me=(Map.Entry)iter.next();
		System.out.println(me.getKey());
		System.out.println(me.getValue());
	
	}
	System.out.println("After sorting");
	Map<Integer,String> map=new TreeMap<Integer,String>(hmapsh);
	Set setmet=map.entrySet();
	Iterator it=setmet.iterator();
	while(it.hasNext()) {
		//create the object to differentiate keys and values
		Map.Entry sort=(Map.Entry)it.next();
		System.out.println(sort.getKey());
		System.out.println(sort.getValue());
	
	
	}
	}
}
