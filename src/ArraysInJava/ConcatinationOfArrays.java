package ArraysInJava;

import java.util.Arrays;

public class ConcatinationOfArrays {

	public static void main(String[] args) {
		// joining/combining arrays with one another
		String[] name= {"Sachin","programming"};
		String[] code= {"technicalTrainer","java"};
		String[] concepts= {"core java","Advance java"};
		
		//Array=========>length of it.......
		int nameLength=name.length;
		int codeLength=code.length;
		int conceptsLength=concepts.length;
		String[] result=new String[name.length+code.length+concepts.length];
		
		System.arraycopy(name, 0, result, 0, name.length);
		System.arraycopy(code, 0, result, name.length, code.length);
		System.arraycopy(concepts, 0, result, code.length+code.length, concepts.length);
		System.out.println(Arrays.toString(result));
	}

}
