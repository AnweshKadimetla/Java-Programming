package PatternUsingForLoops;
import java.util.Scanner;
public class RightDownMirrorStarPattern {
	public static void main(String args[]) {
	//create an object
	int rows;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows");
	rows=sc.nextInt();
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=rows-i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	sc.close();
	}
}
