package Java8;

interface lam{
	public int sum(int a,int b);
	
}
interface lamb{
	public String display();
}




public class LambdaExpression {

	public static void main(String[] args) {
		lam obj=(a,b)->a+b;
			System.out.println(obj.sum(10, 20));
		
	
	lamb lambd=()->{
		return "This is Practice";
		
	};
	System.out.println(lambd.display());
}
}
