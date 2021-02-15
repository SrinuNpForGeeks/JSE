class Car
{

	String fuelType = "Petrol";
	int wheels = 4; // Data Members or Instance Variables 

	public void run()
	{

		System.out.println(" Car is running");

	}

}

public class CarApp
{
	public static void main(String args[])
	{
		Car	c1 = new Car();
		System.out.println( " Car FuelType "+c1.fuelType);
		System.out.println( " No.Of Wheels "+c1.wheels);

		c1.run();

	}
}




