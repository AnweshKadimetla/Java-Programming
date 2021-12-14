package learn;
import java.util.Scanner;
public class AssignmentOperatorDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_one, number_two,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		number_one=sc.nextInt();
		//System.out.println("enter second number");
		//number_two=sc.nextInt();
		number_one += number_one;
		System.out.println("Assignment += operator : "+number_one);
		number_one -= number_one;
		System.out.println("Assignment -= operator : "+number_one);
		number_one *= number_one;
		System.out.println("Assignment *= operator : "+number_one);
		
		
		System.out.println("enter second number");
		number_two=sc.nextInt();
		number_two /= number_two;
		System.out.println("Assignment /= operator : "+number_one);
		
		
	}

}
