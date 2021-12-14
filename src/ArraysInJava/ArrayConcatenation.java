package ArraysInJava;

import java.util.Arrays;

public class ArrayConcatenation {

	public static void main(String[] args) {
		// Program to concatenate the two Strings
		String[] names= {"welcome","capgemini"};
		String[] names_two= {"super","absolutly"};
		int names_length=names.length;
		int names_two_length=names_two.length;
		int length=names.length+names_two.length;
		int[] dest=new int[length];
		System.arraycopy(names, 0, dest, 0, names.length);
		System.arraycopy(names_two, 0, dest, names.length,names_two_length);
		System.out.println(Arrays.toString(dest));
	}

}
