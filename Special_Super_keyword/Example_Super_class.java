package Special_Super_keyword;

class SubClass  {
	
	int num=100;
	//Method<-----cpature the behaviour of the class
	/*SubClass(){
		System.out.println(num);	
		}*/
	

}


public class Example_Super_class extends SubClass{
	//variable
	/* the same variable num is declared int he sub class which is already in the super class*/
	//Bpth class have same variable names like  num<----base class ====num<-----child class
			int num=110;
			//System.out.println(num);
			
			/*Example_Super_class(){
				super();
			}*/
			void printNumber() {
				
				System.out.println(super.num);
			}
			
			public static void main(String[] args) {
				// 
				Example_Super_class obj=new Example_Super_class();
				obj.printNumber();//------->110
			}
			
			
}

