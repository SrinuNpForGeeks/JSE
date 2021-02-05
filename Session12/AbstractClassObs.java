abstract class Sample
{

	public abstract void getInfo();
	

	public void getData()
	{
		System.out.println(" From Sample :: getData() ");
	}

} 


abstract class SampleChild extends Sample
{
   
}


public class AbstractClassObs
{

	public static void main(String args[])
	{
		//Sample s = new Sample();
		//s.getInfo();
	}
}

// 