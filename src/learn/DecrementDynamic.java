package learn;
import java.util.Scanner;
public class DecrementDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		number--;
		System.out.println("post decrement increment : "+number);
		--number;
		System.out.println("pre decrement increment : "+number);
	}

}
