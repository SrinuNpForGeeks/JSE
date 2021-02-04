

class Sample
{

	static
	{

		System.out.println( " From Sample Static Block \n");
	}

	public Sample()
	{
		System.out.println(" Sample Object is created :: Sample Constructor is invoked");
	}

}



public class StaticBlockEx
{
	public static void main(String args[])
	{

		new Sample();
		new Sample();
		new Sample();
		
	}
}