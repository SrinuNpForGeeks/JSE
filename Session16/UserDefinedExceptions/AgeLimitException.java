package com.google.exp;

public class AgeLimitException extends Exception
{
	public AgeLimitException(){

	}

	public AgeLimitException(String message)
	{
		super(message);
	}

}



/*


public class Throwable
{
	private String message;

	public Throwable(){

	}

	public Throwable(String message){
		this.message = message;
		
	}

	public String getMessage()
	{
		return message;
	}
}


public class Exception extends Throwable
{
	public Exception()
{


}

public Exception(String messge)
{
	super(messge);
}


}

*/

