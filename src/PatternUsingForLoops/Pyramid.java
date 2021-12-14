package PatternUsingForLoops;

public class Pyramid {

	//FUNCTION/METHOD
	public static void PyramidPattern(int n) {
		//outer loop
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.println(" ");
			}
			
			for(int j=1;j<=i;j++)//Inner loop
			{
				System.out.print("* ");
			}
			System.out.println();
		
		}
	}

	public static void main(String[] args) {
 // PYRAMID       *
		//      *   *
		//    *   *   *
		//  *   *   *    *
		int n=5;
		PyramidPattern(n);
	}

}
