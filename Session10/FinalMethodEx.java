class Vechicle

{
	public final void fuelType()
	{
		System.out.println(" Run withs petrol ");
	}
}


class Car extends Vechicle
{
	public void fuelType()
	{
		System.out.println(" Run withs Diesel");
	}
}


public class FinalMethodEx
	{
		public static void main(String args[])
		{

			 Vechicle v = new Car();
			 v.fuelType();

		}
	}


