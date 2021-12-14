package javaconditionalstatements;
import java.util.Scanner;
public class CheckVowel {

	public static void main(String[] args) {
		// a,A,e,E,i,I,o,O,u,U------->True
		boolean isVowel=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet");
		char ch=sc.next().charAt(0);
		sc.close();
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':isVowel=true;
		}
		 if(isVowel==true) {
			 System.out.println(ch+"is a vowel");
		 }
			 else if((ch>'a' && ch<='z')||(ch>'A' && ch<='Z')){
				 System.out.println(ch+" is  Consonent");}
			 else
				 System.out.println("input is not alphobet");

	}

}
