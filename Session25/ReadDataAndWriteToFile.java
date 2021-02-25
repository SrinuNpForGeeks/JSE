
package com.google.ex8;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.FileInputStream;

public class ReadDataAndWriteToFile
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("AccessPrivateConstructor.java");
		OutputStream out = new FileOutputStream("Two.txt");


		int ch ;

		while( (ch = in.read()) != -1 )
		{
			out.write(ch);
		}

		System.out.println(" Data Transafer Successfull !!!");
		
	}
}