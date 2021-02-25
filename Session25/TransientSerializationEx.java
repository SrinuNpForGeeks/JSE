
package com.google.ex12;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class User implements Serializable
{

	private Integer userId;
	private String userName;
	private transient String password;

	public User(Integer userId, String userName,String password)
	{
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public String toString()
	{

		return "userId : "+userId+" userName : "+userName+" password : "+password;
	}
}


public class TransientSerializationEx
{

	public static void main(String args[]) throws Exception
	{

		OutputStream out = new FileOutputStream("User.txt");

		ObjectOutputStream objOut = new ObjectOutputStream(out);

		User user = new User(1242,"Srinu","Test123");

		objOut.writeObject(user);
		
		System.out.println(" Serialization Completed ");
	}
}