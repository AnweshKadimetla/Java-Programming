package PractiseOfJavaPrograms;


public class Practice_Static_Keyword {
	
	//Static variable
	static String Flite_Color="White";
	static int Flite_Speed=500;
	
	//Static Method
	static void about_Flite() {
		System.out.println("Flite_Color"+Flite_Color+" "+"Flite_Speed:"+Flite_Speed);
	}
	//Static block
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		//we don't need to create object because we had used static keyword to method
		Practice_Static_Keyword obj=new Practice_Static_Keyword();
		obj.about_Flite();

	}

}
