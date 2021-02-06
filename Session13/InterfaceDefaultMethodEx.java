interface  Parent
{

	public default void display()
	{
		System.out.println(" From Parent :: display() ");
	}
}


class Child implements Parent
{

	public  void display()
	{
		System.out.println(" From Child :: display() ");
	}

}

class Child2 implements Parent
{

}

public class InterfaceDefaultMethodEx
{

	public static void main(String args[])
	{

		Parent p = new Child();
		p.display(); 

		Parent p2 = new Child2();
		p2.display();
	}

}