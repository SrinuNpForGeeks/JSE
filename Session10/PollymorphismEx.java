class Vechicle

{
	public void run()
	{
		System.out.println(" Vechicle is Running");
	}
}


class Car extends Vechicle
{
	public void getData()
	{
		System.out.println(" GetData :: From Car");
	}
}

class Bus extends Vechicle
{
}

public class PollymorphismEx
	{
		public static void main(String args[])
		{

			 Vechicle v ;

			v = new Car();
			 
			v = new Bus();

			v.run();
				// Single Parent Ref can able to point of any number of child objects

		}
	}


