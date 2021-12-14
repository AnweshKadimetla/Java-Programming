package javaconditionalstatements;
import java.util.Scanner;
public class IfElseProgram {

	public static void main(String[] args) {
		//the program is checking a number is positive or negative
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		number=sc.nextInt();
		sc.close();
		if(number/2==0) {
			System.out.println(number + " :the number is even");
		}
		/*else if(number==0)
		{
			System.out.println(number + " :the number is zero");
		}*/
		else {
			System.out.println(number + " :the number is odd");
		}
	}

}
