

class Sample
{

	private static int count = 10;
	  

	  public static void getData()
	  {
	  	System.out.println(" From static method Count :: "+count);

	  }
	

}



public class StaticMethodEx
{
	public static void main(String args[])
	{
		
			Sample.getData();
	}
}