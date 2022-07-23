package chaining;

public class Parent 
{
	int x;
	
	Parent()
	{
		
		System.out.println(x);
	}

    Parent(int i) 
	{
		this.x = i;
		System.out.println("Print :" + x);
	}
}
