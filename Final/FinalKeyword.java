package Final;


public class FinalKeyword {
	 final int value;
	//It must be initialized constructor 
	FinalKeyword() {
		value=101;
		System.out.println(value);
	}

	public static void main(String[] args) {
		FinalKeyword obj=new FinalKeyword();
		//System.out.println(obj.value);
		//obj.myMethod();

	}

}
