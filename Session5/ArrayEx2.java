
public class ArrayEx2
{
	public static void main(String args[])
	{

     		int[] studentNos = new int[5];

               studentNos[0] = 11;
               
               studentNos[1] = 21;

               studentNos[2] = 31;

               studentNos[3] = 41;

               studentNos[4] = 51;


               int index = 0;

               System.out.println(" Elements in the Array are");
               while( index < studentNos.length )
               {
                    System.out.println(studentNos[index]);
                    index++;
               }


     		
	}
}