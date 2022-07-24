

class accesSpecifiers 
{
	void display() 
	{
		System.out.println("Default access Specifier");
	}
}

public class accessSpecifiers1 
{

	public static void main(String[] args) 
	{
		System.out.println("Default Access Specifiers");
		accesSpecifiers obj = new accesSpecifiers();
		obj.display();
		

	}

}
