class Sample
{
	int count ;
	String name;

	public Sample()
	{
		System.out.println(" From Parent Sample Constructor ");
	}

}


class SampleChild extends Sample
{
	public SampleChild()
	{
		
		System.out.println(" From Child SampleChild Constructor");
	}
	public void printData()
	{
		System.out.println(" Count "+count); // jvm adds super.count
		System.out.println(" Name "+name); // jvm adds super.name
	}
}



public class InheritanceObservationEx
{
	public static void main(String args[])
	{

		SampleChild s = new SampleChild();
		s.printData();

	}
}

