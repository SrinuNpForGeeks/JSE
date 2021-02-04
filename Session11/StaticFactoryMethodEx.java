class Sample
{

	private Sample()
	{
		System.out.println(" \n From Sample :: Constructor => Object is created");
	}

	public void getInfo()
	{
		System.out.println(" \n From Sample ::  getInfo() ");
	}

	public static Sample getSample()
	{

		System.out.println(" \n From Static Factory Method ");
		Sample s = new Sample();
		return s;
	}
	 // StaticFactoryMethod


}

public class StaticFactoryMethodEx
{
	public static void main(String args[])
	{
		Sample s = Sample.getSample();
		s.getInfo();
	}
}