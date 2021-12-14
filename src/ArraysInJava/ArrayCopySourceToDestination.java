package ArraysInJava;

import java.util.Arrays;

public class ArrayCopySourceToDestination {

	public static void main(String[] args) {
		// arraycopy(object src,int objectDestination,int destinationPosition,int Length)
		int[] value= {2,3,55,67,88,99,100};
		int[] copy_value=new int[8];
		//creating destination array of having length of value
		int[] dest=new int[value.length];
		//copying entire value array to destination
		System.arraycopy(value, 0, dest, 0,value.length);
		System.out.println("dest="+Arrays.toString(dest));//disply the destination array elements
		System.out.println("**************************************************************************");
		
		//copying elements from index2 on value array
		//copying elements to destination index1 of dest array 
		System.arraycopy(value, 2, dest, 1, 2);
		System.out.println("dest="+Arrays.toString(dest));
		System.out.println("*************************************************");
		
		//copyOfRange()
		int[] source_one= {2,3,4,5,6,6,7,71};
		int[] destination_one=Arrays.copyOfRange(source_one, 0, source_one.length);
		System.out.println(Arrays.toString(destination_one));

	}

}
