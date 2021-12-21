package collections;

import java.util.ArrayList;

public class AdvancePractice {
	//Using loop can we add elements to the arralist?
	
	public static void main(String[] args) {
		//For Loop
		//we had created an array object to store the elments on it.
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for(int i=0;i<1;i++) {
			//we need to add the element to arraylist
			numbers.add(0, 10);
			numbers.add(1, 20);
			numbers.add(2, 30);
			numbers.add(3, 40);
			System.out.println("array elements are"+numbers);
		}
	}

}
