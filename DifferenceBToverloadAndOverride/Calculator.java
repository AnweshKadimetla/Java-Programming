package DifferenceBToverloadAndOverride;

public class Calculator {
	//I need to create method
	 int add(int num_o,int num_t) {
		return num_o+num_t;
	}
	 int add(int num_o,int num_t,int num_th) {
			return num_o+num_t+num_th;
		}
	 int add(int num_o,int num_t,int num_th,int num_f) {
			return num_o+num_t+num_th+num_f;
		}
	 int add(int num_o,int num_t,int num_th,int num_f,int num_fi) {
			return num_o+num_t+num_th+num_f+num_fi;
		}

	public static void main(String[] args) {
		// 
		Calculator obj=new Calculator();
		System.out.println("sum of two numbers: "+obj.add(20, 21));
		System.out.println("sum of three numbers: "+obj.add(20, 21, 22));
		System.out.println("sum of four numbers: "+obj.add(20, 21, 22, 23));
		System.out.println("sum of five numbers: "+obj.add(20, 21, 22, 23, 24));
	}
}
//Account creation
//Ticket Reservation