
package com.google.ex11;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class DeSerializationEx
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("Employee.txt");

		ObjectInputStream objIn = new ObjectInputStream(in);

			Employee emp = (Employee) objIn.readObject();

		System.out.println(" Serialization Completed :: Employee Info  "+emp);
	}
}