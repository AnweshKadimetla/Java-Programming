package PractiseOfJavaPrograms;

public class PractiseOf2D_arraysAndMultiDimentional_array {
	public static void main(String[] args) {
		//Example one
		//Declaration of an 2D array
		int[][] array1= {{10,20,30},{40,50,60},{33,45}};
	    // Access the array values by using the for each and original for loop
		//first each loop
		for(int[] arr:array1) {
			for(int element:arr) {
				System.out.println(element);
			}
		}
		System.out.println("============================================");
		//now,original for loop
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				System.out.println(array1[i][j]);
			}
		}
		
		
		
		//Example 2
		System.out.println("********* This is example two **********");
		int[][] array2= {{103,205,300},{400,510,640},{336,435}};
	    // Access the array values by using the for each and original for loop
		//first each loop
		for(int[] arr:array2) {
			for(int element:arr) {
				System.out.println(element);
			}
		}
		System.out.println("============================================");
		//now,original for loop
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.println(array2[i][j]);
			}
		}
		
		
		
	}
}
