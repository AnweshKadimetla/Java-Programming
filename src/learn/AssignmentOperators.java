package learn;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment operators +=,-=,==,*=,/=,%=
		int number_one=32;
		number_one += 32;
		System.out.println("Assignment += operator : "+number_one);
		number_one -= 32;
		System.out.println("Assignment -= operator : "+number_one);
		number_one *= 32;
		System.out.println("Assignment *= operator : "+number_one);
		number_one %= 32;
		System.out.println("Assignment %= operator : " + number_one);
		System.out.println("=========================================");
		int number_two=43;
		number_two += 43;
		System.out.println("Assignment += operator : "+number_two);
		number_one -= 43;
		System.out.println("Assignment -= operator : "+number_two);
		number_one *= 43;
		System.out.println("Assignment *= operator : "+number_two);
		number_one %= 43;
		System.out.println("Assignment %= operator : " + number_two);

	}

}
