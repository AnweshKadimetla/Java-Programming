package learn;
import java.util.Scanner;
public class JavaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		double fnum,snum,result;
		//create a scanner object
		Scanner input=new Scanner(System.in);
		//select the operator
		System.out.println("choose operator : '+', '-', '*', '/', '%'");
		operator=input.next().charAt(0);
		//Ask the user input number
		System.out.println("enterfirst number ");
		fnum=input.nextDouble();
		System.out.println("enter second number ");
		snum=input.nextDouble();
		switch(operator) {
		//perform addition between two numbers
		case '+' :
			result=fnum+snum;
			System.out.println("addition of two numbers");
			System.out.println(fnum+ "+" +snum+ "="+result);break;
		//perform substraction between two numbers
		case '-' :
			result=fnum-snum;
			System.out.println("substraction of two numbers");
			System.out.println(fnum+ "-" +snum+ "="+result);break;
		//perform Multiplication between two numbers
		case '*' :
			result=fnum*snum;
			System.out.println("Multiplication of two numbers");
			System.out.println(fnum+ "*" +snum+ "="+result);break;
		//perform Multiplication between two numbers
		case '/' :
			result=fnum/snum;
			System.out.println("division of two numbers");
			System.out.println(fnum+ "/" +snum+ "="+result);break;
		//perform Modulus between two numbers
		case '%' :
			result=fnum%snum;
			System.out.println("Modulus of two numbers");
			System.out.println(fnum+ "%" +snum+ "="+result);break;
		}
		
	}

}
