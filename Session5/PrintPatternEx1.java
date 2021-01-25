
/*

		1

		1 	2

		1   2   3

		1   2    3  4

		1   2    3  4   5

*/




public class PrintPatternEx1
{
	public static void main(String args[])
	{
		int row  = 1;

			while(row <= 5)
			{

				int col = 1;
					while( col <= row)
						{
							System.out.print(col + "  ");
							col++;
						}
					System.out.println();

				row++;
			}


		
	}
}


/*
   step1 : outerLoop :  row = 1  

   		   while ( 1 < = 5)

					{
							initilizing : col = 1

									inner Loop : step 1:  col = 1
											    while( 1 <= 1)
												 {
													print 1
												}

												 step 2:  col = 2 
												 	while ( 2 <= 1) breaks
	

								new Line 

								row ++;

					}



 step2 : outerLoop :  row = 2 

   		   while ( 2 < = 5)

					{
							initilizing : col = 1

									inner Loop : step 1:  col = 1
											    while( 1 <= 2)
												 {
													print 1
												}

												 step 2:  col = 2 
												 	while ( 2 <= 2) 
												 				print 2

												 step 3 col = 3 
												 		 while ( 3 <= 2 ) breaks
	

								new Line 

								row ++;

					}




output :   1

		   1  2

*/


















