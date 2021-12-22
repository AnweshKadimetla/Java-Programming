package collections;
//**************Find Index number***************************
import java.util.ArrayList;

public class SearchAndGetMethodsOFArray {

	public static void main(String[] args) {
		System.out.println("**************Find Index number***************************");
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
		System.out.println("Index of element 1: "+arr_int.lastIndexOf(1));
		System.out.println("Index of element 33: "+arr_int.lastIndexOf(33));
		System.out.println("Index of element 46: "+arr_int.lastIndexOf(46));
		System.out.println("Index of element 89: "+arr_int.lastIndexOf(89));

	}

}
