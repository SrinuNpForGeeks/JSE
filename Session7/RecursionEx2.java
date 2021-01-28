class Sample
{

	public void print(int n)
		{
			if( n == 0)
			{
				return;
			}

		System.out.println(n);
			print(n-1);

			

		}
}


public class RecursionEx2
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.print(5);
	}
}