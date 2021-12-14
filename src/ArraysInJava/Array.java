package ArraysInJava;

public class Array {

	public static void main(String[] args) {
		// Before an arryList lets talk arrays
		
		//declare and initialize an array
		int[] age={10,20,30,40,50};
		System.out.println("FirstElement "+age[0]);
		System.out.println("SecondElement "+age[1]);
		System.out.println("ThirdElement "+age[2]);
		System.out.println("forthelement "+age[3]);
		System.out.println("fifthelement "+age[4]);
		//System.out.println(age);
		//int age_two[]= {};
		//int []age_three= {};
		
		//System.out.println(age);
		//System.out.println(age_two);
		//System.out.println(age_three);
		age[0]=12;
		age[1]=14;
		age[2]=16;
		age[3]=18;
		age[4]=20;
		System.out.println("new create arrays--------------------");
		System.out.println("FirstElement "+age[0]);
		System.out.println("SecondElement "+age[1]);
		System.out.println("ThirdElement "+age[2]);
		System.out.println("forthelement "+age[3]);
		System.out.println("fifthelement "+age[4]);
		System.out.println("-----elements accessed through the loop------");
		//we can also access the arraysusing loos(for)
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		
		
	}

}
