package PractiseOfJavaPrograms;
import java.util.Scanner;
public class PractiseJavaMethods {
	
	//Declaration of method
	 public void arrayMethod(int number) {
		 //for loop is used to calculate values
		 for(int i=1;i<=10;i++) {
			 System.out.println(number+"*"+i+"="+number*i);
		 }
	 }
	  
	 public int secondMethond() {
		 System.out.println("-------This is Second Method----------");
		 int a=10;
		 int b=20;
		 int mul=a*b;
		 return mul;
	 }
	 public int thirdMethond() {
		 System.out.println("-------This is Third Method----------");
		 int a=10;
		 int b=20;
		 int add=a+b;
		 return add;
	 }
	 
	 

	public static void main(String[] args) {
		//create an object for Scanner class
		Scanner sc=new Scanner(System.in);
		//Input from the user
		System.out.println("Enter your number");
		int n=sc.nextInt();
		//create an object to the class
		 PractiseJavaMethods pjm=new  PractiseJavaMethods();
		 //call to the method
		 pjm.arrayMethod(n);
		 // call to the second method
		 int result=pjm.secondMethond();
		 System.out.println(result);
		 int results=pjm.thirdMethond();
		 System.out.println(results);

	}

}
