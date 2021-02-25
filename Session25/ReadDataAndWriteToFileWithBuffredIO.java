
package com.google.ex10;

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.InputStream;
import java.io.FileInputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


public class ReadDataAndWriteToFileWithBuffredIO
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("AccessPrivateConstructor.java");
		OutputStream out = new FileOutputStream("FOUR.txt");

		BufferedInputStream bufIn = new BufferedInputStream(in);
		BufferedOutputStream bufOut = new BufferedOutputStream(out);


		int ch ;

		while( (ch = bufIn.read()) != -1 )
		{
			bufOut.write(ch);
		}

		bufOut.flush(); 
		bufOut.close();
	    bufIn.close();
		
	

		System.out.println(" Data Transafer Successfull !!!");
		
	}
}