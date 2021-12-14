package PatternUsingForLoops;
//import java.util.Scanner;
public class LeftAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int rows;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		rows=sc.nextInt();*/
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
