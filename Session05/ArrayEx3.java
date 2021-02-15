
import java.util.Scanner;

public class ArrayEx3
{
	public static void main(String args[])
	{

     		String[] names = new String[5];

               Scanner scan  = new Scanner(System.in); // Scanner connects to the console

               int i = 0;

               // Feeding names to Array

               while( i < names.length)
               {
                    System.out.println(" Please Enter Name :: "+( i + 1));
                    String name = scan.next(); // Pause the console till we enter the name

                    names[i] = name;
                    i++;
               }


               int index = 0;

               System.out.println(" Elements in the Array are");
               while( index < names.length )
               {
                    System.out.println(names[index]);
                    index++;
               }


     		
	}
}