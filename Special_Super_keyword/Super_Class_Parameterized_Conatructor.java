package Special_Super_keyword;

class Super{
	String cname;
	int speed;
	//parameterized constructor 
	Super(String cname,int speed){
		this.cname=cname;
		this.speed=speed;
		System.out.println("cname: "+cname+" "+"speed: "+speed);
	}
}

public class Super_Class_Parameterized_Conatructor extends Super{
	//parameterized constructor
	int number;
	Super_Class_Parameterized_Conatructor(int number,String cname,int speed){
		super( cname,speed);
		this.number=number;
		System.out.println("number: "+number);
	}
		public static void mmain(String[] args) {
			//create constructor
			Super_Class_Parameterized_Conatructor obj=new Super_Class_Parameterized_Conatructor(100,"Sachin",140);
		}
}
