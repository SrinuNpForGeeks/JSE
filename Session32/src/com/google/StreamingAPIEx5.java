package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Sort the Elements and Print
public class StreamingAPIEx5 {

  public static void main(String[] args) {

    List<String> list1 = List.of("Srinu","Venu","Akash");
    List<String> list2 = List.of("Kalyan","Umesh");
    List<String> list3 = List.of("Uday","Kavya");

    List < List<String> > list = List.of(list1,list2,list3);

    System.out.println( " Actual list "+list);

    //flatMap() converts multi level collection to single level collection
    Set<String> namesSet = list.stream().flatMap(namesList -> namesList.stream()).collect(Collectors.toSet());
    System.out.println(" After flatMap () "+namesSet);

    Boolean nameExist =  list.stream()
          .flatMap(namesList -> namesList.stream())
          .anyMatch(name -> name.equalsIgnoreCase("Srinu"));

    System.out.println(" nameExist "+nameExist);
  }

}

