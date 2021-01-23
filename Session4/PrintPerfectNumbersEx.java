public class PrintPerfectNumbersEx
{
	public static void main(String args[])
	{

		
		int n = 1;

   while( n  <= 1000)
   {
   	    int i = 1;
		int sum = 0;
		while(i < n)
		{
			if( n % i == 0)
				{
					sum = sum + i; 
				}

				i++;

		}
      if( sum == n)
      {
      	System.out.println(n);
      }

      n++;
   }
		

	}
}