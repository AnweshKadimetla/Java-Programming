package collections;

import java.util.ArrayList;

public class SearchAndGetMethodToValues {

	public static void main(String[] args) {
		System.out.println("**************Find number in Specified index***************************");
		ArrayList<Integer> arr_int=new ArrayList<Integer>();
		arr_int.add(1);
		arr_int.add(33);
		arr_int.add(44);
		arr_int.add(20);
		arr_int.add(3);
		arr_int.add(46);
		arr_int.add(55);
		arr_int.add(89);
		arr_int.add(19);
		//First Index of an element <---------Inbuilt method  i.e, IndexOf
		System.out.println("first of element arrayList 1: "+arr_int.get(0));
		System.out.println("second of element arrayList 2: "+arr_int.get(1));
		System.out.println("third of element arrayList 3: "+arr_int.get(2));
		System.out.println("fourth of element arrayList 4: "+arr_int.get(3));
		System.out.println("fifth of element arrayList 5: "+arr_int.get(4));


	}

}
