
package com.google.ex12;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;



public class TransientDeSerializationEx
{

	public static void main(String args[]) throws Exception
	{

		InputStream in = new FileInputStream("User.txt");

		ObjectInputStream objIn = new ObjectInputStream(in);

			User user = (User) objIn.readObject();

		System.out.println(" Serialization Completed :: User Info  "+user);
	}
}