
package com.google.ex9;

import java.io.OutputStreamWriter;
import java.io.FileWriter;

import java.io.InputStreamReader;
import java.io.FileReader;

public class ReadDataAndWriteToFile2
{

	public static void main(String args[]) throws Exception
	{

		InputStreamReader in = new FileReader("AccessPrivateConstructor.java");
		OutputStreamWriter out = new FileWriter("THREE.txt");


		int ch ;

		while( (ch = in.read()) != -1 )
		{
			out.write(ch);
		}

		out.flush();
		out.close();
		in.close();

		System.out.println(" Data Transafer Successfull !!!");
		
	}
}