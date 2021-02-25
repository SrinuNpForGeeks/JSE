
package com.google.ex6;

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadDataFromFile2
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("AccessPrivateConstructor.java");

		int ch ;

		while( (ch = in.read()) != -1 )
		{
			System.out.print( (char) ch);
		}

	}
}