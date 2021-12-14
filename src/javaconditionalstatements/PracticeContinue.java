package javaconditionalstatements;
import java.util.Scanner;

public class PracticeContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		number=sc.nextInt();
		sc.close();
		if((number%2)==0) {
			System.out.println(number + " :the number is even");
		}else {
			System.out.println(number+": number is negative");
		}
	}

	}
