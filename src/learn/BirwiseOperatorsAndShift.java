package learn;

public class BirwiseOperatorsAndShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number=12;
      int number_two=14;
      int result=number&number_two;
      System.out.println("Bitwise AND operator is performed,and value is"+result);
      result=number|number_two;
      System.out.println("Bitwise OR operator is performed,and value is"+result);
      result=number^number_two;
      System.out.println("Bitwise XOR operator is performed,and value is"+result);
      System.out.println("-----Shift operations------ ");
      result=~number;
      System.out.println("Bitwise NOT operator is performed,and value is"+result);
      result=~number_two;
      System.out.println("Bitwise NOT operator is performed,and value is"+result);
      result=number<<4;
      System.out.println("Bitwise Left shift operator is performed,and value is"+result);
      result=number>>4;
      System.out.println("Bitwise Right shift operator is performed,and value is"+result);
	}

}
