package loops;
import java.util.Scanner;
public class SumOfPassitiveNumbers {

	public static void main(String[] args) {
		// program to find positive numbers
		//create object to the scanner
		Scanner sc=new Scanner(System.in);
		//capture input from the user 
		System.out.println("enter your number");
		int n=sc.nextInt();
		int sum=0;
		//call the while loop
		while(n>0) {
			sum=sum+n;
			n--;
		}
		System.out.println("sum of  entered number is: "+sum);
		sc.close();
	}

}
