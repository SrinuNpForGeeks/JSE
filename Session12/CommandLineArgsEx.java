
public class CommandLineArgsEx
{

public static void main(String args[])  
{

 	if(args.length == 0)
 	{
 		System.out.println(" Please Pass Command Line Arguments ");
 	}
 	else
 	{
 		System.out.println(" Command Line Arguments are");
 		for(int i = 0; i < args.length ; i++)
 		{
 			System.out.println(args[i]);
 		}
 	}
		
}

}


