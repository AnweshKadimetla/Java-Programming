package javaconditionalstatements;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check program pasitive or negative
		int number=14;//Define the number is statically
		// To check number is pasitive
		if(number>0) {
			System.out.println(number+" Is the number is positive");
		}
		else if(number<0)
		{
			System.out.println(number+" Is the number is negative");
		}
		else if(number==0) {
			System.out.println(number+" Is the number is zero");
		}
		else {
			System.out.println("The number itself invalid");
		}

	}

}
