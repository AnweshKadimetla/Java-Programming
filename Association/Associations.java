package Association;


class CarClass{
	String carname;
	int CarId;
	
	//parameterized constructor
	CarClass(String name,int id){
		this.carname=name;
		this.CarId=id;
	}
}

class Driver extends CarClass{
	String drivename;
	Driver(String name,String cname,int cid){
		super(cname,cid);//super() is used for initialization with the help of Constructor
		this.drivename=name;
	}
}



public class Associations {
	//
	
		public static void main(String[] args) {
			Driver obj=new Driver("Sachin", "Ford Eco Sport", 9988);
			System.out.println("Driver name: "+obj.drivename);
			System.out.println("Carname: "+obj.carname);
			System.out.println("Car I: "+obj.CarId);
		}
}
