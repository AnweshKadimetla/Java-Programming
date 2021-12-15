package PractiseOfJavaPrograms;

abstract class Abs{
	//Abstract method
	abstract void cricket();
	public void details() {
		System.out.println("Today is Cricket match");
		System.out.println("Which team vs which team");
	}
}


public class Practice_Abstaction_two extends Abs {
	void cricket() {
		System.out.println("IND vs PAK");
	}

	public static void main(String[] args) {
		// create object
		Practice_Abstaction_two obj=new Practice_Abstaction_two();
		obj.details();
		obj.cricket();
		

	}

}
