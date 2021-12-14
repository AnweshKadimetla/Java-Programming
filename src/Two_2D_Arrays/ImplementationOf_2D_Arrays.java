package Two_2D_Arrays;

public class ImplementationOf_2D_Arrays {

	public static void main(String[] args) {
		// one_diamentional_arrys
		int[] number= {1,2,3,4};
		//two_dimentional_arrays
		int[][] Number= {{1,2,3,4,5,6,7,8,9}};
		
		//create 2D array
		int[][] array= {
				{1,2,3},{4,5,6,7},{8}//array[0]={1,2,3},array[1]={4,5,6,7},array[2]={8}
				
		};
		System.out.println("length of array: "+array[0].length);
		System.out.println("length of array: "+array[1].length);
		System.out.println("length of array: "+array[2].length);
       //I wanted traversed all the elementsinitialized in the array..
		//if it is a 1D array====>one loop
		//if it is a 2D array====>two loop
		
	System.out.println("===for loop implementation");	
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				////in order to print the elements of an array we need to look
				//into the index and for loop works on the index places
				//hence we need to say array[i][j]
				System.out.println(array[i][j]);
			}
		}
		System.out.println("==This is for each loop implementation=====");
		for(int[] arr:array) {//A=B=C ==>A=C
			for(int arra:arr) {
				System.out.println(arra);
			}
		}
		
		//Multi diamention arrays:..........
		//any thing more than two dimentional we call them 3Dimentional array!!
		
		int[][][] test= {
				{
					{1,2,3},{3,5,6,7}
				},
				{
					{1,2,3},{3,5,6,7}
				}
				
				
		};
		//In order to access to array elements ===>we use loops
		//since it is 3D array===>3 loops
		
		for(int[][] array2D:test) {
			for(int[] array1D:array2D) {
				for(int i:array1D) {
					System.out.println(i);
				}
			}
		}
		System.out.println("====Advance Looping and finding the elements");
		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[i].length;j++) {
				for(int k=0;k<test[i][j].length;k++) {
					System.out.println(test[i][j][k]);
				}
			}
		}
		
		
		
}//closing bracket for java in main()
}//for class




