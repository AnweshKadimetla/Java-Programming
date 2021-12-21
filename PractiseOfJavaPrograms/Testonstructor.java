package PractiseOfJavaPrograms;

public class Testonstructor {
	int t=10;
	Testonstructor(){
		t=40;
	}
	public static void main(String[] args) {
		// create object
		Testonstructor obj=new Testonstructor();
		System.out.println(obj.t);

	}

}
