
public class typeCasting 
{

	public static void main(String[] args) 
	{
		System.out.println("Implicit type Conversion");
		char C = 'A';
		
		int a = C;
		System.out.println("value of a" +  a);
		
		float b = C;
		System.out.println("value of a" + b);
		
		long l = C;
		System.out.println("value of a" + l);
		
		double d = C;
		System.out.println("value of a" + d);
		
		System.out.println("\n");
		
		
		System.out.println("Explicit Conversion");
		
		double h = 45.5;
		int x = (int)h;
		
		System.out.println(x);
	}

}
