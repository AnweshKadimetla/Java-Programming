package javaconditionalstatements;
import java.util.Scanner;
public class NestedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to find the largest number
		int num_one,num_two,num_three;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");//taking 3 inputs from user
		num_one=sc.nextInt();
		num_two=sc.nextInt();
		num_three=sc.nextInt();
		sc.close();
		//check condition for num
		if(num_one>num_two) {
			//check condition for num
			if(num_one>num_three) {
				System.out.println(num_one+": is the largest then numb and number");
			}
			else
				System.out.println(num_three+": Is largest then number one");
		}
		//check condition for numb
		else if(num_two>num_one) {
			//check condition for numb
			if(num_two>num_three) {
				System.out.println(num_two+": is the largest then num and number");
			}
			else
				System.out.println(num_three+": Is largest then number two");
		}
		

	}

}
