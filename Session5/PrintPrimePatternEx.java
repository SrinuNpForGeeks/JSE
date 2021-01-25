
/*

		2

		2   3

		2   3  5

		2   3  5  7

	    2   3  5  7  11

*/




public class PrintPrimePatternEx
{
	public static void main(String args[])
	{
		int row  = 1;

			while(row <= 25)
			{

				int col = 1;
				int count = 1;
					while( count <= row)
						{

							int divFact = 0;
							int i = 1;
							while( i <= col )
							{
								if( col % i == 0)
									{
										divFact++;
									}
								i++;
							}

							if( divFact == 2)
							{
								System.out.print(col +"  ");
								count++;
							}
							
							col++;
						}
					System.out.println();

				row++;
			}


		
	}
}
