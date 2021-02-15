class Sample
{

	public int fact(int n)
		{
			if( n == 1)
			{
				return 1;
			}

			return n * fact(n-1);

		}
}


public class FactRecursionEx
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		int result = s.fact(5);
		System.out.println("Result is :: "+result);
	}
}





