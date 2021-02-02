class Sample
{

	private int count;
	private String name;

	public Sample()
	{
	}

	public void setCount(int count)
	{
		this.count = count;  
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCount()
	{
		return count;  // jvm adds implicitly this.count
	}
	public String getName()
	{
		return name; // this.name
	}
}



public class ThisKeywordObsEx2
{
	public static void main(String args[])
	{
		
		Sample s = new Sample();

		s.setCount(5);
		s.setName("Kavya");

		System.out.println(" Count "+s.getCount());
		System.out.println(" Name "+s.getName());

	}
}