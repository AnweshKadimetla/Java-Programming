package PatternUsingForLoops;

public class ReversePyramid {

	public static void main(String[] args) {
		// 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
