public class PrimeNumberEx
{
	public static void main(String args[])
	{

		int i = 1;
		int count = 0;
		int n = 5;

		while(i <= n)
		{
			if( n % i == 0)
				{
					count++;
				}

				i++;

		}
      if( count == 2)
      {
      	System.out.println(n + " is a Prime Number ");
      }else
      {
      	System.out.println(n + " is not a Prime Number ");
      }

	}
}

/*
	Given is Prime, If the div factors count is 2.

		5 => div factors count is 2 i.e (1,5) Prime
		2 => div factors count is 2 i.e (1,2) Prime
		6 => div factors count is 4 i.e (1,2,3,6) Not a Prime 

*/