package HasMap_Collections;

import java.util.HashMap;

public class FindKeysInHashMap {

	public static void main(String[] args) {
		// Check particular key exits in the hash map
		//Create hash map object
		HashMap<Integer,String> sports=new HashMap<Integer,String>();

		//Adding values to hashmap
		sports.put(11, "Cricket");
		sports.put(12, "Footbal");
		sports.put(13,"Base ball");
		sports.put(14, "Hockey");
		sports.put(15, "Rogby");
		
		//ChecSysoking Key existence 
		boolean variable=sports.containsKey(11);
		System.out.println("Key 11 is exit in  HashMap?:"+variable);
		//I would like to check 11 is present 
		
		//12 is present 
		boolean variab=sports.containsKey(12);
		System.out.println("Key 12 is exit in  HashMap?:"+variab);
		//14 is present 
		boolean var=sports.containsKey(14);
		System.out.println("Key 14 is exit in  HashMap?:"+var);
		//wether is present or not 
		boolean va=sports.containsKey(18);
		System.out.println("Key 18 is exit in  HashMap?:"+va);
		
		//Checking value existence
		boolean variabl=sports.containsValue("Cricket");
		System.out.println("Key Cricket is exit in  HashMap?:"+variabl);
		
		boolean varia=sports.containsValue("Footbal");
		System.out.println("Key Footbal is exit in  HashMap?:"+varia);
		boolean vari=sports.containsValue("Base ball");
		System.out.println("Key Base ball is exit in  HashMap?:"+vari);
	}

}
