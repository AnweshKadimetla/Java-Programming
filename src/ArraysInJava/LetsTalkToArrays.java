package ArraysInJava;

public class LetsTalkToArrays {

	/*public static void main(String[] args) {
		// create array
		int[] age= {12,24,36,5,6,710,10};
		//looping through the access arrays
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		//for each loop<==arrays
		for(int sachin : age) {
			System.out.println("for each loop");
			System.out.println(sachin);
			}
			}*/
			public static void main(String[] args) {
				int[] age= {12,24,36,5,6,710,10};
				//program to find sum and average
				int sum=0;
				Double average;
				for(int result:age) {
					sum+=result;
				}
				int arrylength=age.length;
				//covert integer to double....
				average=((double)sum/(double)arrylength);
			
			System.out.println("sum="+sum+" average="+average);
		
			}
}
