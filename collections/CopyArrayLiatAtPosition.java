package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CopyArrayLiatAtPosition {

	public static void main(String[] args) {
		//addAll(index,collection)
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		System.out.println("ArrayList before AddAll"+array);
		//Array list2
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("E");
		arr.add("F");
		arr.add("G");
		arr.add("H");
		/*System.out.println("ArrayList2 before AddAll"+arr);
		System.out.println("Array list after adding arraylist2 at position 4th");
		array.addAll(4,arr);
		System.out.println(array);*/
		System.out.println("Array list after adding arraylist2 at position 4th");
		arr.addAll(array);
		System.out.println(arr);
		
	}

}
