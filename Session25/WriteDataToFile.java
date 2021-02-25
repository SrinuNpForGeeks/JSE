
package com.google.ex4;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class WriteDataToFile
{

	public static void main(String args[]) throws Exception
	{

		String mesage = "Welcome to IO Streams";

		OutputStream out = new FileOutputStream("one.txt");

		byte[] byteArr = mesage.getBytes();

		out.write(byteArr);
		System.out.println(" Data has been Transffered to File");
	}
}