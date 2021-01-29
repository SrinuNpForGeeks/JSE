class Sample
{

	 private int number;
	 private String name;

	 public Sample()
	 {
	 	System.out.println(" Default Constructor is Invoked");
	 	name = "Srinu";
	 	number = 111;
	 	System.out.println(" Data initialization is completed");
	 }// Default Constructor

	public void setNumber(int no)
	{
			number = no;
	}

	public void setName(String nm)
	{
		name = nm;
	}

	public int getNumber()
	{
		return number;

	}

	public String getName()
	{
		return name;
	}


}


public class DefaultConstructorEx
{
	public static void main(String args[])
	{
		Sample s = new Sample();

		System.out.println(" Number : "+s.getNumber());
		System.out.println(" Name   : "+s.getName());

	}
}


// public => Can be accessed any where  within the package and outside package

// protected => Can be accessed  within the package and outside the package can be accessed through inheritance.

// default =>  Can be accessed  within the package and outside the package can  not be accessed .

// private => Can be accessed only within the class.


















