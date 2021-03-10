package com.google;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamingEx2 {

  public static void main(String[] args) {
    List<Integer> list = List.of(11,12,13,14,15,16,17,18,16,17,18);

    System.out.println(" \n skip(2) ");
    //skip(2) skips first two elements
    list.stream().skip(2).forEach(System.out::println);

    System.out.println(" \n limit(5) ");
    //limit(5) prints first 5 elements
    list.stream().limit(5).forEach(System.out::println);

    //count() returns no.of elements in stream
    System.out.println(" \n count() ");
    System.out.println( list.stream().filter(e -> e%2 == 0).count() );

    System.out.println(" \n distinct() ");
    list.stream().distinct().forEach(System.out::println);

    //min()  returns min value from Stream
    System.out.println(" \n min() ");
    Optional<Integer> minValue = list.stream().min(Comparator.comparing(Integer::intValue));
    if(minValue.isPresent() )
    {
      System.out.println(minValue.get());
    }

    //max()  returns max value from Stream
    System.out.println(" \n max() ");
    System.out.println(list.stream().max(Comparator.comparing(Integer::intValue))); //sry in call

    //reduce() :: Can be used for summing the values
    System.out.println("Sum :: "+list.stream().reduce((e1,e2) ->e1+e2));

    //mapToInt() :: Converts IntStream
    System.out.println("maoToInt Sum :: "+list.stream().mapToInt(Integer::intValue).sum());

  }
}
