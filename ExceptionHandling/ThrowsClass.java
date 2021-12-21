package ExceptionHandling;

import java.io.IOException;

public class ThrowsClass {
	
	void display()throws IOException{ //Exception Declaration 
	    throw new IOException("device error");
	  }  
	
	  void show()throws IOException{  
	    display();  
	  }  
	  
	  void print(){  
	   try{  
	    show();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

	public static void main(String[] args) {
		ThrowsClass obj=new ThrowsClass();  
		   obj.print();  

	}

}
