package TypeCasting;

public class typeCasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		char a='G';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
				
		System.out.println("\n");
		
		//Explicit conversion
		System.out.println("Explicit Type Casting");
		
		double x=85.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}
