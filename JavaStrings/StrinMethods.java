package JavaStrings;

public class StrinMethods {

	public static void main(String[] args) {
		
		//ChatAt()
			//CharAt() method returns the character at the specified index in the String
		//Create string
		String strang="Avengers went into past to get the infinity stones";
		//Let's utilize CharAt() <---Index position
		//Check for the first letter of the String
		char firstchar=strang.charAt(0);
		//Check the 6th letter
		char sixchar=strang.charAt(6);
		//check 20th letter
		char twentyth=strang.charAt(20);
		
		System.out.println("Charecter at 0 th index is :"+firstchar);
		System.out.println("Charecter at 6 th index is :"+sixchar);
		System.out.println("Charecter at 20 th index is :"+twentyth);
		
		//equals
		System.out.println("Checking first name and city are qual");
		
		String name_one="Java Program";
		String name_two="Java";
		
		int var=name_one.compareTo(name_two);
		System.out.println(var);
		int vari=name_two.compareTo(name_one);
		System.out.println(vari);
		
		
		
		
	}

}
