
@FunctionalInterface
interface Sample
{
	public abstract void display();
}



public class FunctionalInterfaceEx
{
	public static void main(String args[])
	{
		 Sample s = () -> { 
							System.out.println(" Implemented through Lamda Expressions \n Functional Interface Example");
						  };

		s.display();

		
	}
}