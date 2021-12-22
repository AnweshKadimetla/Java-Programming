package collections;

import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		//I can create multiple arraList????
		//Create first arraylist
		ArrayList<String> array_one=new ArrayList<String>();
		array_one.add("Hi");
		array_one.add("Good");
		array_one.add("After");
		array_one.add("Noon");
		array_one.add("Time for lunch");
		
		//Another arraylist
		ArrayList<String> array_two=new ArrayList<String>();
		array_two.add("Hi");
		array_two.add("GoodGood");
		array_two.add("AfterAfter");
		array_two.add("NoonNoon");
		array_two.add("Time for lunch");
		//Compare the comparision output in ArrayList<String>
		ArrayList<String> array_camp=new ArrayList<String>();
		//Loop
		for(String temp:array_one) {
			array_camp.add(array_two.contains(temp)?"Yes":"No");
		System.out.println(array_camp);
		}
		
	}

	private static ArrayList<String> add(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
