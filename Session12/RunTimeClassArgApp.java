class Sample
{
	static
	{
		System.out.println(" From Sample static :: Class loaded ");
	}

	public Sample()
	{
		System.out.println(" From Sample Constructor :: Sample Object is created");
	}

	public void getInfo()
	{
		System.out.println(" From Sample :: getInfo() method");
	}

}



public class RunTimeClassArgApp
{

	public static void main(String args[]) throws Exception
	{
		if(args.length == 0)
		{
			System.out.println(" \n Please pass Sample class as a command line argument");
		}else
		{
			String cname = args[0]; // "Sample"

			Class c = Class.forName(cname);  
			// forName(String), Converts "Sample" to class format then loads to the RAM after then create a "java.lang.Class" object which contains meta info about loaded class "Sample"

			System.out.println(" Loaded Classname :: "+c.getName());


			Sample s = (Sample) c.newInstance(); // It's going to create Loaded class Sample Object.

			s.getInfo();

		}

	}

}

/*


class Sample {..}


JVM adds as 
class Sample extends Object { ... }


Sample s = (Sample) c.newInstance();  // Object o = new Sample();


*/
