package javaconditionalstatements;

public class SumAndAverage {

	public static void main(String[] args) {
		
		int i, num = 5, sum = 0,avg;  
		//executes until the condition returns true  
		for(i = 1; i <= num; ++i)  
		{   
		sum = sum + i; 
		}
		avg=sum/num;
		System.out.println("Sum of First 5 Natural Numbers is = " + sum); 
		System.out.println("average of Natural Numbers is = " + avg); 
	}

}
