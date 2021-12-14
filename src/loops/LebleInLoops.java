package loops;

public class LebleInLoops {

	public static void main(String[] args) {
		// labling concept
		//
		//probably it is suitable in loops and if statements
		first://for loop is labled first
		for(int i=1;i<5;i++) {
			
			second://for loop is labled second
			for(int j=1;j<3;j++) {
				System.out.println("i="+i+"j="+j);
				if(i==2) {
					break first;//the break statement break the first for loop
				}
				
			}
		}

	}

}
