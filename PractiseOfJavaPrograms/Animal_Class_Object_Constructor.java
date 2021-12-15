package PractiseOfJavaPrograms;

public class Animal_Class_Object_Constructor {
	
	//Declare Fields
	String animal_name;
	String animal_color;
	int animal_leg_count;
	//parameterized Constuctor
	Animal_Class_Object_Constructor(String animal_name,String animal_color,int animal_leg_count){
		System.out.println("animal_name"+animal_name+"\n"+"animal_color"+animal_color+"\n"+"animal_leg_count"+animal_leg_count);
	}

	public static void main(String[] args) {
		// create object 
		Animal_Class_Object_Constructor obj=new Animal_Class_Object_Constructor("Dog","Black",4);

	}

}
