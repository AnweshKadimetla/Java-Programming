package javaconditionalstatements;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// write a program to check given year is leap or not
		int year;
	      System.out.println("Enter an Year ");//enter a year
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      sc.close();
	      //Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
	      //Check if the year is divisible by 400, DISPLAY "leap year"
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      //Otherwise, DISPLAY "not leap year"
	      else
	         System.out.println("Specified year is not a leap year");
	}

}
