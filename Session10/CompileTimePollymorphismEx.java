class Vechicle

{
	public void run()
	{
		System.out.println(" Vechicle is Running");
	}

	public void run(int speed)
	{
		System.out.println(" Vechicle is Running with Speed :: "+speed);
	}
}


class Car extends Vechicle
{
	public void run()
	{
		System.out.println(" Car is Running ");
	}
}



public class CompileTimePollymorphismEx
	{
		public static void main(String args[])
		{

				Vechicle v = new Car();
				v.run(); // Runtime Pollymorphism

				v.run(120); // Compiletime Pollymorphism

		}
	}


