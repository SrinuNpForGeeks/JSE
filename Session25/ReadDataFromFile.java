
package com.google.ex5;

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadDataFromFile
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("one.txt");

		int ch ;

		while( (ch = in.read()) != -1 )
		{
			System.out.print( (char) ch);
		}

	}
}