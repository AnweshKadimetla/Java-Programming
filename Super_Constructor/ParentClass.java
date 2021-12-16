package Super_Constructor;
//parent class
public class ParentClass {
	int number;
	String name;
		//Method
	ParentClass(){
		System.out.println("Parent constructor");
	}
		//parameterized constructor
		ParentClass(int numb,String name){
			this.number=numb;
			this.name=name;
			System.out.println("number="+number+" "+"name="+name);
		}
	}

