package collections_Ohers;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayLists {

	public static void main(String[] args) {
		//Create array list
		ArrayList<String> names=new ArrayList<String>();
		names.add("Sachin");
		names.add("Sourav");
		names.add("Rahul");
		names.add("Yuvraj");
		names.add("Laxman");
		System.out.println("ArrayList before Awap:");
		for(String temp:names)
		{
			System.out.println(temp);
		}
		//Swapping 2nd element(1 index)
		//There is inbuilt method avilable as swap in collection
		Collections.swap(names, 2, 4);
		System.out.println("ArrayList after swap:");
		for(String temp:names)
			System.out.println(temp);

	}
}
