public class PrintEvenNumbersCountEx
{
	public static void main(String args[])
	{

		int i = 1;
		int count = 0;

		while(i <= 50)
		{
               if( i%2 == 0)
               {
               	 count++;
               }

			i++;
		}

          System.out.println( " Total Even Count "+count);

	}
}


