package PractiseOfJavaPrograms;

public class Car_Class_Object_Constructor {
	//Fields
	int carprice;
	String carname;
	String carcolor;
	
	//Create constructor
	Car_Class_Object_Constructor(int carprice,String carname,String carcolor){
		System.out.println("carprice:"+carprice+"\n"+"carname:"+carname+"\n"+"carcolor:"+carcolor);
	}

	public static void main(String[] args) {
		// 
		Car_Class_Object_Constructor carobj=new Car_Class_Object_Constructor(10000000,"Audi","Red");
	}

}
