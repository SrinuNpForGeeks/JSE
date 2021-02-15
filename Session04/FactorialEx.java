public class FactorialEx
{
	public static void main(String args[])
	{

		int n = 3;
		int fact = 1;
		int temp = n;
		while( n >= 1)
		{

			fact = fact * n; 
			n--;
		}

		System.out.println( temp+" Factorial is "+fact);
	}
}


/*

	5! => 5 * 4 * 3 * 2 * 1 = 120
*/