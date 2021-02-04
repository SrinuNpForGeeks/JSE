class Sample
{

	private static final Sample s ;

	static
	{
		s = new Sample();
	}

	private Sample()
	{
		System.out.println(" Sample Object is created");
	}

	public static Sample getSample()
	{
		return s;
	}

	public void getInfo()
	{
		System.out.println(" From  non static Sample :: getInfo() ");
	}
}



public class SingleTonEx
{
	public static void main(String args[])
	{
		Sample s1 = Sample.getSample();

		Sample s2 = Sample.getSample();

		Sample s3 = Sample.getSample();

		s1.getInfo();



	}
}