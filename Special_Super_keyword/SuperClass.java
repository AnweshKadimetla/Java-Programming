package Special_Super_keyword;
//With out using Super keyword

//parent calss or super class
public class SuperClass {
	//variable
	int num=100;
	
}

//Child class or sub class or derived class
class Subclass extends SuperClass{
	/* the same variable num is declared int he sub class which is already in the super class*/
	int num=110;
	//Method<-----cpature the behaviour of the class
	void printNumber() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		// 
		Subclass obj=new Subclass();
		obj.printNumber();//------->110
	}
	
	

}
