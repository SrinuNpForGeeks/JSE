package com.google.functionalProgramming;


@FunctionalInterface
interface  Sample
{
  public abstract void print();
}

class Test
{
  public void demo(Sample s)
  {
    s.print();
  }
}

public class LamdaExpressionEx {

  public static void main(String[] args) {

    Test t = new Test();
    t.demo(() -> System.out.println(" Demo on Functional Interfaces") );
  }
}
