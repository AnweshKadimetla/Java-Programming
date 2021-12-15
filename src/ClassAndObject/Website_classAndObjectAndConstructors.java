package ClassAndObject;



public class Website_classAndObjectAndConstructors {
	
	//States are also called fields
		String webname;
		int webAge;
		//
		//Constructor to initialize the values for states/fields
		public Website_classAndObjectAndConstructors(String webname, int webAge) {
			super();
			this.webname = webname;
			this.webAge = webAge;
		}

		
	public static void main(String[] args) {
		// What is class in OOPs,Objects and constructors in this program..
		Website_classAndObjectAndConstructors object=new Website_classAndObjectAndConstructors("TechMasters", 10);
		Website_classAndObjectAndConstructors object_one=new Website_classAndObjectAndConstructors("Cpgemini", 20);
		Website_classAndObjectAndConstructors object_two=new Website_classAndObjectAndConstructors("Wipro", 30);
		System.out.println("Current WebPage"+object.webname);
		System.err.println("Current Age is"+object.webAge);
		System.out.println("Current WebPage"+object_one.webname);
		System.err.println("Current Age is"+object_one.webAge);
		System.out.println("Current WebPage"+object_two.webname);
		System.err.println("Current Age is"+object_two.webAge);
	}
		
}
