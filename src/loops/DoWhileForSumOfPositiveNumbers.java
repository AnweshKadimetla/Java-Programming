package loops;
import java.util.Scanner;
public class DoWhileForSumOfPositiveNumbers {

	public static void main(String[] args) {
		// program to find sum of positive numbers
		//create an object for scanner class
		int number=5,sum=0;
		Scanner input=new Scanner(System.in);
		//do..while loop implementation
		//until a number is positive
		do {
			sum+=number;
			
			System.out.println("Enter a number");
			number=input.nextInt();
			System.out.println("sum of positive numbers"+sum);
			//number--;
		}while(number>0);
		System.out.println("sum of positive numbers"+sum);
		//input.close();

	}

}
