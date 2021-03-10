package com.google;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

  public static void main(String[] args) {
    List<String> list1  = List.of("Srinu","Venu","Akash");
    List<String> list2  = List.of("Kavya","Uday");
    List<String> list3  = List.of("Kalyan","Umesh");

    List < List<String> > list = List.of(list1,list2,list3);

    System.out.println(" Before "+list);

    //flatMap() converts multi level collection to single collection
    List<String> namesList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());

    System.out.println(" After flatMap "+namesList);

    boolean nameExists =  list.stream().flatMap(nlist -> nlist.stream()).anyMatch(name -> name.equalsIgnoreCase("Kalyan"));
    System.out.println(nameExists);

  }
}
