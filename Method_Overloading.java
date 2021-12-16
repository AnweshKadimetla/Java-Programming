package PractiseOfJavaPrograms;

public class Method_Overloading {
	//Method Overloading is feature and class allows to create one or more classes with same names and different parameters
	//create methods for Method Overloading
	void trainName(String From,String To) {
		System.out.println("Train From "+From +" "+"To: "+To);
	}
	void trainName(String From,String To,int number) {
		System.out.println("Train From "+From +" "+"To: "+To+"Train Number: "+number);
	}
	void trainName(String From,String To,int number,String type) {
		System.out.println("Train From "+From +" "+"To: "+To+"Train Number: "+number+" "+"Train Type: "+type);
	}

	public static void main(String[] args) {
		Method_Overloading obj=new Method_Overloading();
		obj.trainName("Kurnool", "Bangalore");
		obj.trainName("Hyderbad", "Mumbai", 54738);
		obj.trainName("Tirupati", "Chennai", 59846, "Super Fast");
	}

}
