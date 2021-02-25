
package com.google.ex7;

import java.io.*;

public class ReadDataFromFile3
{

	public static void main(String args[]) throws Exception
	{

		InputStream in1 = new FileInputStream("AccessPrivateConstructor.java");
		InputStream in2 = new FileInputStream("AccessPrivateField.java");

		InputStream segIn = new SequenceInputStream(in1,in2);

		int ch ;

		while( (ch = segIn.read()) != -1 )
		{
			System.out.print( (char) ch);
		}

	}
}