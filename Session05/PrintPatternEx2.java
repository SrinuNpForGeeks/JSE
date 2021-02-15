
/*

		1

		1 	3

		1   3   5

		1   3    5  7

		1   3    5  7   9

*/




public class PrintPatternEx2
{
	public static void main(String args[])
	{
		int row  = 1;

			while(row <= 5)
			{

				int col = 1;
				int count = 1;
					while( count <= row)
						{

							if( col % 2 == 1)
							{
								System.out.print(col + "  "); 
								count++;
							}
							
							col++;
						}
					System.out.println();

				row++;
			}


		
	}
}
