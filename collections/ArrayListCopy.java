package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		//add the elements to arralist
		
		System.out.println("This is for first arrayList"+ array);
		//To perform array list copy we need array array list
		//I am calling list from collections
		List<String> list=new ArrayList<String>();
		//Adding elements to the list
		list.add("Listening");
		list.add("Speaking");
		list.add("Reading");
		list.add("Writing");
		
		//adding the all tthe elements of list to arraylist <===ArrayList copy! <---ArrayList
		//Java do have inbuilt add() ==>addAll()
		array.addAll(list);
		System.out.println("Updated arrayList lements are "+array);
		

	}

}
