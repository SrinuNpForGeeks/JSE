package com.google.app;
import com.google.test.Demo;

public class ProtectedTestApp
{
	public static void main(String args[])
	{
		Demo  d = new Demo();
		d.display();
	}
}



// Compilation : javac -d . *.java

// Run : java com.google.app.ProtectedTestApp