package com.google.ex;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class ListEx3
{
  public static void main(String args[])
  {

  	List<Integer> list = new LinkedList<Integer>();
  	list.add(12);
  	list.add(01);
  	list.add(5);
  	list.add(56);
  	list.add(8);

  	System.out.println(" Before sort => "+list);

  	Collections.sort(list);

  	System.out.println(" After sort => "+list);


  }
  
}

