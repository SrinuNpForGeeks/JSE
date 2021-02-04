

class Sample
{
	private  int count = 10; // Non-Static Variable
	
	public Sample()
		{
			count++;
		}

		public int getCount()
		{
			return count;
		}
}



public class NonStaticVarEx
{
	public static void main(String args[])
	{
		Sample s1 = new Sample();
		System.out.println(" s1 :: count "+s1.getCount());

		Sample s2 = new Sample();
		System.out.println(" s2 :: count "+s2.getCount());


		Sample s3 = new Sample();
		System.out.println(" s3 :: count "+s3.getCount());

	}
}