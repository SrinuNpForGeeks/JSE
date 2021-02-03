class Car

{
	private final int wheels = 10;

	public int getWheels()
	{
		return wheels;
	}


}



public class FinalVarEx
	{
		public static void main(String args[])
		{
			Car c = new Car();

			System.out.println(" Wheels "+c.getWheels());
		}
	}


