class PrintData
{

	public void print()
	{
		System.out.println(" Hi From PrintData :: Print() ");
	}

	public void print(int count)
	{
				System.out.println(" Hi From print(int) " +count);

	}


	public void print(String name)
	{
				System.out.println(" Hi From print(String) "+name);

	}

}



public class MethodOverLoadingApp
{
	public static void main(String args[])
	{
		PrintData data = new PrintData();
		data.print();
		data.print(10);
		data.print("Srinu");

	}
}