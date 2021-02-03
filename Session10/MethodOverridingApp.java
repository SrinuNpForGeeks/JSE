class Vechicle

{
	public void run()
	{
		System.out.println(" Vechicle is Running");
	}
}


class Car extends Vechicle
{
	public void run()
	{
		System.out.println(" Car is Running");

	}
}

public class MethodOverridingApp
	{
		public static void main(String args[])
		{
			Car c = new Car();
			c.run();

		}
	}


	//private => default => protected => public 