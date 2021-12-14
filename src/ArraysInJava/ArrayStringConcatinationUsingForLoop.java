package ArraysInJava;

import java.util.Arrays;

public class ArrayStringConcatinationUsingForLoop {

	public static void main(String[] args) {
		
		int[] array_one= {1,2,3};
		int[] array_two= {4,5,6};
		int length=array_one.length+array_two.length;
		int[] res=new int[length];
		int pos=0;
		for(int element:array_one) {
			res[pos]=element;
			pos++;
		}
		for(int element:array_two) {
			res[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(res));
	}

}
