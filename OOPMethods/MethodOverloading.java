package OOPMethods;

//Method overloading is feature the class allows to more than one methods having same name
class DisplayOverloading{
	//Method 1: name is desp ||Parameter different
	public void disp(char ch) {
		System.out.println(ch);
	}
	//Method 2:name is desp ||different parameters
	public void disp(char ch,int i ) {
		System.out.println(ch+" "+i);
	}
}



public class MethodOverloading {

	public static void main(String[] args) {
		// create object to DisplayOverloading
		DisplayOverloading obj=new DisplayOverloading();
		obj.disp('c');
		obj.disp('a',10);
	}

}
