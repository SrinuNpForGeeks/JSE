

class Sample
{
	private static int count ;

	static
	{

		System.out.println( " From Sample Static Block \n");
		count = 10;
	}

	public Sample()
	{
		
		System.out.println(" Sample Object is created :: Sample Constructor is invoked");
	}

	public static int getCount()
	{
		return count;
	}

}



public class StaticBlockEx2
{
	public static void main(String args[])
	{

		System.out.println(" Sample Count :: "+Sample.getCount());
		
	}
}