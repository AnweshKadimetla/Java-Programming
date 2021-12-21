package AccessModifiers;
/* the scope  of the private modifier is limited to the class only
 *1.private data members and methods are only acceeesable only within the class
 *2.class and Interface cannot declared as private
 *3.If clas  has private constructor then you cannot create the object of that
 *class from the outside of the class  */
class PrivateClass{
	private double sum=100;
	//Method
	int square(int num) {
		return num*num;
	}
	/* If we create  getter and setter methods we can access to the private data members 
	 * of the class public double getSum() */
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}

public class Private {

	public static void main(String[] args) {
		
		PrivateClass obj=new PrivateClass();
		System.out.println(obj.getSum());
		obj.square(12);
	}

}
