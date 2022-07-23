package chaining;

public class Child extends Parent
{
	Child()
	{
		this(11);
		System.out.println("No args");
	}
	Child(int x)
	{
		System.out.println("Printing x :" + x);
	}
}
