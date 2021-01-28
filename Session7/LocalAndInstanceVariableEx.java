class Sample
{
	int no;
	String name;
	boolean flag;
	float price;  // Instance Variables


	public void display()
	{
		int a = 10;
		int b = 15; // Local Variables

		System.out.println(" no : "+no);
		
		System.out.println(" name : "+name);

		System.out.println(" flag : "+flag);

		System.out.println(" price : "+price);

		System.out.println( " a "+a);
		System.out.println( " b "+b);

	}



}


public class LocalAndInstanceVariableEx
	{
		public static void main(String args[])
		{
			Sample s = new Sample();
			s.display();
		}
	}