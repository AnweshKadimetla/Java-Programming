package PractiseOfJavaPrograms;

//Paqrent class
 class ParentTwo{
	//Parameterized Constructor
	 ParentTwo(int a,String name){
		
		 System.out.println("name:"+name+" Feedback: 5 out of "+a);
		 
	 }
}


public class Practice_Super_Constructor extends ParentTwo {
	//Parameterized constructor
	Practice_Super_Constructor(int a,String name){
		super(a,name);
	}

	public static void main(String[] args) {
		// create object 
		//Assign values to parameterized constructor of parent class
		Practice_Super_Constructor obj=new Practice_Super_Constructor(5,"Sachin sir");

	}

}
