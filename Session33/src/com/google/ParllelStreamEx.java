package com.google;

import java.util.List;

public class ParllelStreamEx {

  public static void main(String[] args) {
    List<Integer> list = List.of(10,1,5,6,8,99,112);

    System.out.println(" \n\n Sequence Stream :: ");

    list.stream().forEach(element ->
        System.out.println("From SequenceStream "+Thread.currentThread().getName()+ " ::  element => " +element ) );

    list.stream().parallel().forEach(element ->
        System.out.println("From Parallel Stream "+Thread.currentThread().getName()+ " ::  element => " +element ) );


  }
}
