class Sample
{

	public void print(int n)
		{
			if( n == 0)
			{
				return;
			}

			print(n-1);

			System.out.println(n);

		}
}


public class RecursionEx
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.print(5);
	}
}