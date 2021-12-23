package LinkedList;

import java.util.LinkedList;

public class GetElemetsByIndex {

	public static void main(String[] args) {
		// Create LinkedList
		LinkedList<String> linkedlist=new LinkedList<String>();
		////Populating linkedlist with String values
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		linkedlist.addLast("EE");
		//I would like to Know the position of the elements
		System.out.println("LinkedList elements");
		//Get(index)
		for(int i=0;i<linkedlist.size();i++)
			System.out.println("Elements at index "+i+" is "+linkedlist.get(i));
		//Search firstindex occurence of element
		int first_index=linkedlist.indexOf("AA");
		System.out.println(first_index);
		int second_index=linkedlist.indexOf("BB");
		System.out.println(second_index);
		int Third_index=linkedlist.indexOf("CC");
		System.out.println(Third_index);
		int fourth_index=linkedlist.indexOf("DD");
		System.out.println(fourth_index);
		int fifth_index=linkedlist.indexOf("EE");
		System.out.println(fifth_index);
	}

}
