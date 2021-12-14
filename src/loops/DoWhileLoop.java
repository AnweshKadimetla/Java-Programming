package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Display the numbers from 1 to 5
		int i=1,n=5;
		//I will make use of DoWhile loop
	/*	do {
			//System.out.println(i);
			//i++;//updating the counter----1,2,3,4,5
			/*if(i==3) 
				break;*/
			//if(i<0)
				//break;
			/* if(i==4)
				continue;
			System.out.println(i);
			i++;
		}while(i<=5);
		System.out.println("while block is false!!!!");*/
		while(i<=5)
		{
			if(i==4) {
				i++;
				continue;
			}
				
			System.out.println(i);
			i++;
		}
	}

}
