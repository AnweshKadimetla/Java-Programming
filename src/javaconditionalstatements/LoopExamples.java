package javaconditionalstatements;

public class LoopExamples {

	public static void main(String[] args) {
		//program to count the natural numbers using for loop start=1,2,3------->n
		int num=10,count,total=0;
		//count start 1 and it will go till 10.
		for(count=1;count<=num;count++) {
			total += count;
		}
		//total variable which store the toatal value
		System.out.println("sum of first 10 natural numbers"+":"+total);
		
	}

}
