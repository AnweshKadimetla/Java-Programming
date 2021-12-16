package Super_Constructor;

//Sub class
public class SubClass extends ParentClass{
	//Default constructor
	SubClass(){
		/* compile implicitly adds super() here has the first statement of this constructor*/
		
		System.out.println("constructor of child class");
	}
	SubClass(int num,int number,String name){
		super(number,name);
		System.out.println("Argument constructor of child class");
	}
	//Method
	void disp() {
		System.out.println("Hello Guys!!!Take a break.");
	}
	public static void main(String[] args) {
		// create object of child class
		//ParentClass poj=new ParentClass();
		//ParentClass po=new ParentClass();
		//SubClass obj=new SubClass();
		//obj.disp();
		System.out.println("*****************");
		SubClass object=new SubClass(100,100,"hi");
		object.disp();
	}

}
