package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// Sort the Elements and Print
public class StreamingAPIEx1 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(01);
    list.add(13);
    list.add(9);
    list.add(10);

    System.out.println(" \n Step 1 :: Created a Sorted() Stream then Iterated by creating Consumer object separately");
    Stream<Integer> stream = list.stream().sorted();
    Consumer<Integer> consumer = (value) -> System.out.println(value);
    stream.forEach(consumer);


    System.out.println(" \n Step 2 :: For a Consumer interface accept()"
        + " method implementation can be referred with Method Referencing");
    Consumer<Integer> consumer2 = System.out::println;
    list.stream().sorted().forEach(consumer2);

    System.out.println(" \n Step 3 :: Created a Sorted() Stream Iterated on the fly");
    list.stream().sorted().forEach((value) -> System.out.println(value));


    System.out.println(" \n Step 4 :: Created a Sorted() Stream Iterated on the fly with Method Referencing");
    list.stream().sorted().forEach(System.out::println);


  }
}

