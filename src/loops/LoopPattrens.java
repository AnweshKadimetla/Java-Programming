package loops;

public class LoopPattrens {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * * * * 
		for(int x=1;x<=6;x++) {
			//nested for :loop with in a loop
			System.out.print("F");
			for(int y=1;y<=x;y++) {
				System.out.print("S");
				for(int z=1;z<=x;z++) {
					System.out.print("*");
			}
			
		}
			System.out.println();
	}

	}
}
