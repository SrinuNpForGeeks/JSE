class Sample
{

	private int count;
	private String name;

	public Sample()
	{
		this(15,"Srinu");
		System.out.println(" From default Constructor : Sample");
		
	}

	public Sample(int count,String name)
	{
	 System.out.println(" From Parameter Constructor : Sample");

		this.count = count;
		this.name = name;
	}

	
	public void printData()
	{
		System.out.println(" Count "+count);
		System.out.println(" Name "+name);

	}
}



public class ThisConstructorEx
{
	public static void main(String args[])
	{
		
		Sample s = new Sample();

		s.printData();

	}
}