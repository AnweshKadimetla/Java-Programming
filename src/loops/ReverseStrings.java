package loops;
import java.util.Scanner;
public class ReverseStrings {

	public static void main(String[] args) {
		//program a to Reverse String if string is SACHIN --->reverse is --->NIHCAS
		//Create an object to the scanner class
		String original_string,reverse_string=" ";
		Scanner string=new Scanner(System.in);////is possible to capture input
		System.out.println("enter your string");
		//capture the input from the user
		original_string=string.nextLine();
		//nOTE:Whenever we are dealing with string make sure will look for the 
		//length of the string!!!
		int length=original_string.length();//we got length of the string from length();
		for(int i =length-1;i>=0;i--) {
			reverse_string=reverse_string+original_string.charAt(i);
		}
		System.out.println(reverse_string);
		string.close();
	}

}
