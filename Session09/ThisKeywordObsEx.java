class Sample
{

	private int count;
	private String name;

	public Sample()
	{
		count = 10;
		name = "Uday";
	}

	public void setCount(int c)
	{
		count = c;
	}

	public void setName(String nm)
	{
		name = nm;
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



public class ThisKeywordObsEx
{
	public static void main(String args[])
	{
		
		Sample s = new Sample();

		System.out.println(" Count "+s.getCount());
		System.out.println(" Name "+s.getName());

	}
}