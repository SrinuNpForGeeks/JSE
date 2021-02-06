interface  Parent
{

	public static void display()
	{
		System.out.println(" From Parent :: display() ");
	}
}


class Child implements Parent
{

	public static void display()
	{
		System.out.println(" From Child :: display() ");
	}

}


public class InterfaceStaticMethodEx
{

	public static void main(String args[])
	{

		Parent p = new Child();
		Parent.display();
	}

}