package collections;

import java.util.ArrayList;

public class ArrayListAdd_Method {

	public static void main(String[] args) {
		//========================Inthis we will use "Object" in ArrayList===========================
		// create ArrayList ===>intger ,String and dooble
		ArrayList<Object> array_one=new ArrayList<Object>() ;
		array_one.add("Wipro");
		array_one.add("Capgemini");
		array_one.add("Infosys");
		array_one.add("TechMahendra");
		System.out.println("Elements of Array_str of string type"+array_one);
	//Create another ArrayList
	ArrayList<Object> array_int=new ArrayList<Object>();
	array_int.add(10);
	array_int.add(20);
	array_int.add(30);
	array_int.add(40);
	array_one.addAll(array_int);
	System.out.println("Elements adding afer String and Integer" +array_one);
	
	}
	
}
