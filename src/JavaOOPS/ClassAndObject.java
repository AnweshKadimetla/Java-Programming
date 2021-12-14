package JavaOOPS;


	//Storing the value for light
  class Lamp{
	boolean isOn;
	//Method to turn on the light
	 void turnOn() {
		 isOn=true;
		 System.out.println("Light on?"+isOn);
	 }
	 void turnOff() {
		 isOn=false;
		 System.out.println("Light off?"+isOn);
	 }
	
  }
  public class ClassAndObject {
	public static void main(String[] args) {
		Lamp lam=new Lamp();
		//I would like to call methods to make sure
		//The lamp is turn on or turn off
		lam.turnOn();
		lam.turnOff();

	}

}
