package javaconditionalstatements;

public class MultipleConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to check greater number out of three numbers
		int inr=1,euro=3,dollar=2;
		if(inr>euro && inr>dollar) {
			System.out.println("INR is greater euro and dollar");
		}
		else if(inr<euro && inr<dollar) {
			System.out.println("INR  is LESSTHAN euro and dollar");
		}
		else if(dollar>inr && dollar>euro) {
			System.out.println("Dollar is greater inr and euro");
		}
	}

}
