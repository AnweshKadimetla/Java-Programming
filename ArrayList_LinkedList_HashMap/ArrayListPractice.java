package ArrayList_LinkedList_HashMap;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		//Create object to Arraylist
		
		ArrayList<String> list=new ArrayList<String>();
		
		//Adding the elements 
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//Check Defferent method 
		System.out.println("Array List elements are:"+list);
		
		//get() method
		System.out.println("After applying get() method");
		System.out.println("value of index 0 is:"+list.get(0));//get()==>is used to get the specified index value
		
		//indexOf()
		System.out.println("After applying indexOf() method");
		System.out.println(list.indexOf("C"));//indexOf()==>used to get the specified index value
		
		//addAll() method is used to copy the elements from one array to another
		System.out.println("After applying AddAll() method");
		ArrayList<String> arr=new ArrayList<String>();
		arr.addAll(list);
		System.out.println(arr);
		
		//clone() method==========> copy or alias
		System.out.println("After applying clone()");
		System.out.println(list.clone());
		
		//cntains() method gives Boolean value the vlue is present in the arraylist==>ture ohetwise false
		System.out.println("After applying Contains()");
		System.out.println(list.contains("A"));
		//Size() method
		System.out.println("Size of the arraylist: "+list.size());
		
		//isEmpty===>the ArrayList is empty===>true
		//The ArrayList is not Empty==>False
		System.out.println("isEmpty()");
		System.out.println(list.isEmpty());
		
		//remove()
		System.out.println("Remove() "+list.remove("D"));
		System.out.println("Array List elements are:"+list);
		
		//Iterator()
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//clear()
		System.out.println("Clear method ");
		list.clear();
		//RemoveAll()
		System.out.println("removeAll method");
		list.removeAll(arr);
		
		
		
		
		
		
		
		
		
	}

}
