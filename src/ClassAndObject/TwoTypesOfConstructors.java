package ClassAndObject;

public class TwoTypesOfConstructors {
	//fields--->states--->datatypes
	int carmodel;
	String carname;
	long carprice;
	String carcolor;
	String manufacture;
	
	//Default constructor===>Assigning values then and there
	TwoTypesOfConstructors(){
		carmodel=2021;
		carname="Hyundai creta";
		carprice=1400000;
		carcolor="Red";
		manufacture="Honda";
	}
	
	//Parameterized constructor
	public TwoTypesOfConstructors(int carmodel, String carname, long carprice, String carcolor, String manufacture) {
		super();
		this.carmodel = carmodel;
		this.carname = carname;
		this.carprice = carprice;
		this.carcolor = carcolor;
		this.manufacture = manufacture;
		System.out.println("This is printing from default constructorcarmodel:"+"\n"+carmodel+"carname:"+"\n"+carname+" "+"carprice:"+carprice+"\n"+"carcolor:"+carcolor+"\n"+"manufacture:"+manufacture);
	}

	

	public static void main(String[] args) {
		//Constructors 1.Default Constructo 2.Parameterized constructor
		TwoTypesOfConstructors obj=new TwoTypesOfConstructors();
		TwoTypesOfConstructors TwoTypesOfConstructorsobje = new TwoTypesOfConstructors(2021,"Hyundai creta",1400000,"red","Honda");
		System.out.println("carmodel"+obj.carmodel);
		

	}

	
}
