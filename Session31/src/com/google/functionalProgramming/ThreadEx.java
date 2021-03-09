package com.google.functionalProgramming;

public class ThreadEx {

  public static void main(String[] args) {
    Thread t = new Thread(() -> System.out.println("Thread is running..."));
    t.start();
  }

}
