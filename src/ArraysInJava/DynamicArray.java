package ArraysInJava;
import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {

	public static void main(String[] args) {
		// program Array takes user input
		//create object to Scanner class
		Scanner object=new Scanner(System.in);
		System.out.println("enter length of the Array");
		int array_length=object.nextInt();//user input reader
		int[] result=new int[array_length];//Empty Array
		System.out.println("enter array elements");
		for(int i=0;i<array_length;i++) {
			result[i]=object.nextInt();
		}
		System.out.println(Arrays.toString(result));

	}

}
