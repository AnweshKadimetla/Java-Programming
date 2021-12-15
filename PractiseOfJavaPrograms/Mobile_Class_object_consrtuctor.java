package PractiseOfJavaPrograms;

public class Mobile_Class_object_consrtuctor {
	//Fields 
	String phonename="vivo";
	int phoneprice=20000;
	String color="White";
	//Create No-Argument constructor
	Mobile_Class_object_consrtuctor(){
		System.out.println("Phone name:"+phonename+" "+"phoneprice:"+phoneprice+" "+"phonecolor:"+color);
	}

	public static void main(String[] args) {
		// create object to the Mobile_Class_object_consrtuctor
		Mobile_Class_object_consrtuctor coj=new Mobile_Class_object_consrtuctor();

	}

}
