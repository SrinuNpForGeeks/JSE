class Parent
{

	public static void display()
	{
		System.out.println(" From Parent :: display() ");
	}
}


class Child extends Parent
{

	public static void display()
	{
		System.out.println(" From Child :: display() ");
	}

}

public class StaticMethodCannotOverrideEx
{

	public static void main(String args[])
	{

		Parent p = new Child();
		p.display(); // Method overriding can not be applicable on static methods.
	}

}