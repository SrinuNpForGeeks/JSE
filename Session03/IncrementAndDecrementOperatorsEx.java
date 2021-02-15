public class IncrementAndDecrementOperatorsEx
{
	public static void main(String args[])
	{

			int a = 10;
			int b = 10;
		
			int c = 10;
			int d = 10;

			System.out.println( "\npost increment a = "+ (a++));  //  a= 10
			System.out.println( " a = "+a); // a = 11



			System.out.println( "\nPre increment a = "+ (++b));  //  b= 11
			System.out.println( " b = "+b); // b = 11



			System.out.println( "\npost deincrement c = "+ (c--));  //  c= 10
			System.out.println( " c = "+c); // a = 9



			System.out.println( "\nPre Deincrement d = "+ (--d));  //  b= 9
			System.out.println( " d = "+d); // d = 9

		

	}
}