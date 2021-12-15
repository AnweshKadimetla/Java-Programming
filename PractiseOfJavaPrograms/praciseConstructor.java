package PractiseOfJavaPrograms;

public class praciseConstructor {
	//Constructor is a special type of method 
			//which is mainly used for initialization
			//To create constructor to use  class name same as constructor name with access specifier
			//create No-arg Constructor
	int n;
	String name;
	boolean value;
			/*public praciseConstructor(){
				System.out.println("--This is No-Arg Constructor----");
			}*/
		
			
			
			//create Parameterized constructor
			public praciseConstructor(int num) {
				System.out.println("This is parameterized constructor and value is: "+num);
			}
			
			
			//create default constructor
			public praciseConstructor() {
				System.out.println("n: "+n+" "+"name: "+" "+"value: "+value);
				
			}
			//This Keyword
			
			public praciseConstructor(int n,String name) {
				this.n=n;
				this.name=name;
				System.out.println("number :"+n+" "+"name: "+name);
				
			}
			

	public static void main(String[] args) {
		praciseConstructor obj=new praciseConstructor(20);
		praciseConstructor obj1=new praciseConstructor();
		praciseConstructor obj2=new praciseConstructor(24,"Anwesh");
		
	}

}
