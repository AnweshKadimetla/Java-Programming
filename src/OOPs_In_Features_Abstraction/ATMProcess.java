package OOPs_In_Features_Abstraction;



//parent class
abstract class BankProcess{
	//abstract method
	abstract void  account();
	//Regular process bank
	public void credit() {
		System.out.println("This is credited method");
		System.out.println("Money credited");
		System.out.println("but how??");
	}
}

class Account extends BankProcess{
	public void Imps() {
		System.out.println("Money credited through Imps");
	}
	public void cash() {
		System.out.println("Money credited through cash");
	}
	public void Netbanking() {
		System.out.println("Money credited through Netbanking");
	}
	void account() {
		System.out.println("this is abstract method");
	}
}



public class ATMProcess {

	public static void main(String[] args) {
	
		Account obj=new Account();
		obj.credit();
		obj.Imps();

	}

}
