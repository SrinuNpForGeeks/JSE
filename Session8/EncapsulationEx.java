class Sample
{

	private int number;
	private String name;

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


public class EncapsulationEx
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.setNumber(111);
		s.setName(" Srinu");

		System.out.println(" Number : "+s.getNumber());
		System.out.println(" Name   : "+s.getName());

	}
}


// Time complexity : O(n)