class Vechicle

{
	private String color;
	private String make;
	private int year;
	private String name;

	public  Vechicle(String color, String make ,int year,String name)
	{
		this.color = color;
		this.make = make;
		this.year = year;
		this.name = name;
	}

	public String getData()
	{

		return color +" : "+make+ " : "+year+ " : "+ name;
	}
}


class Car extends Vechicle
{
	private String model;

	public  Car(String color, String make ,int year,String name,String model)
	{
	super(color,  make , year, name);
	this.model = model;

	}

	public String getModel()
	{
		return model;
	}
}

public class InheritanceApp
	{
		public static void main(String args[])
		{
			Car c = new Car("White","Hundai",2021,"Creta","SUV");
			System.out.println(c.getData()+ " : "+c.getModel());

		}
	}