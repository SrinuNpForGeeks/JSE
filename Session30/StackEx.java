package com.google.ex;

import java.util.Stack;

public class StackEx
{

	public static void main(String args[])
	{
		
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(1);
		
		stack.push(2);

		stack.push(3);

		stack.push(4);

		System.out.println(" Top Element :: "+stack.peek());
		System.out.println(" Elements in Stack are  "+stack);
		System.out.println(" pop Element :: "+stack.pop());
		System.out.println(" After remove Elements in Stack are  "+stack);


	}
}