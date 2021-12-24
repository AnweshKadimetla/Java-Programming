package JavaStrings;

public class JStrings {

	public static void main(String[] args) {
		
		
		//Literal //new objects<---String in java
		//General way to create "Strings"
		String abc="This is an example of string";
		System.out.println(abc);
		//with using object to create "strings"
		String fname=new String("My first name is Sachin");
		String city=new String("I belong to Bidar Karnataka");
		String designation=new String("I am freelanch tecnical trainer");
		System.out.println(fname);
		System.out.println(city);
		System.out.println(designation);
		
		//How to check the type of string
		
		System.out.println(abc.getClass().getSimpleName());
		System.out.println(fname.getClass().getSimpleName());
		
		
			
		
	}

}
