abstract class Sample
{

	 int count;

	public Sample()
	{
		count = 10;
		System.out.println(" Sample :: Constructor ");

	}

	public abstract void print();
} 


class Demo extends Sample
{

	public Demo()
	{
			super();// JVM adds
			System.out.println(" Demo :: Constructor ");
	}

	public void print()
	{
		System.out.println(" Count :: "+count); // JVM adds super.count
	}
}



public class AbstractClassEx2
{

	public static void main(String args[])
	{

		Sample s = new Demo();
		s.print();
		 

	}
}

