abstract class Car
{

  public void fuelType()
  {
  	System.out.println(" \n\n From Car Common Implementation :: Runs with either Petrol Or Diesel");
  }

  public abstract void engineCap();

} 


class FordEcoSport extends Car
{

	public void engineCap()
	{
		System.out.println(" \n\n From FordEcoSport :: Petrol 1EngineCap , Diesel 1.5EngineCap ");
	}

}


class SCross extends Car
{

	public void engineCap()
	{
		System.out.println(" \n\n From SCross ::  Petrol 1EngineCap , No Diesel version ");
	}
}




public class AbstractClassesEx
{

	public static void main(String args[])
	{
		  Car	c;

		c = new FordEcoSport();
		c.fuelType();
		c.engineCap();


	 	c = new SCross();
		c.engineCap();


	}
}

