package com.google;

public class MethodReferencing {

  public static void main(String[] args) {
    Demo d = new Demo();
    Test  t = d::display;
    t.print("Srinu");
  }
}

class Demo
{
  public  void display(String name)
  {
    System.out.println("From Demo :: Welcome "+name);
  }
}

interface  Test
{
  public abstract void print(String name);
}