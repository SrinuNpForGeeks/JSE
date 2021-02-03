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
		System.out.println(" Car is Running ");
	}
}



public class RuntimePollymorphismEx
	{
		public static void main(String args[])
		{

				Vechicle v = new Car();
				v.run();

		}
	}


