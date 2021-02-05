interface Sample
{
	public static final int count = 10;
    public abstract void display();

}


class SampleImpl implements Sample
{

	public void display()
	{
		System.out.println( " From SampleImpl display() :: "+count);
	}

}



public class InterfaceEx
{

public static void main(String args[])
{
	Sample s = new SampleImpl();
	s.display();

}

}