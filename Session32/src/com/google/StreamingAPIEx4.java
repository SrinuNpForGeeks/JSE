package com.google;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Sort the Elements and Print
public class StreamingAPIEx4 {

  public static void main(String[] args) {
    List<Sample> list = new ArrayList<>();

    list.add(new Sample(1,"Kavya"));
    list.add(new Sample(15,"Uday"));
    list.add(new Sample(19,"Arup"));
    list.add(new Sample(2,"Kiran"));
    list.add(new Sample(12,"Srinu"));
    list.add(new Sample(21,"Kalay"));
    list.add(new Sample(18,"Arvind"));
    list.add(new Sample(12,"Srinu NP"));

    // Print Sample object where name starts with "K"
    list.stream().filter((s) -> s.getName().startsWith("K") ).forEach(System.out::print);

    // Collect Sample objects where name starts with "K"
    Set<Sample> sampleSet  =
        list.stream().filter((s) -> s.getName().startsWith("K")).collect(Collectors.toSet());
    System.out.println(" SampleSet => "+sampleSet);

    //findFirst() :: Returns object from a stream in a first Occurrence for the given filter
    Sample sample = list.stream().filter(s -> s.getId() == 12).findFirst().orElse(null);
    System.out.println(" SampleRef " +sample);

    //findAny() :: Returns object from a stream when the condition is match, findAny() useful in parallel stream
    Sample sample2 = list.stream().filter(s -> s.getId() == 12).parallel().findAny().orElse(null);
    System.out.println(" SampleRef " +sample2);

    System.out.println(" findFirst() " +IntStream.range(1,100).parallel().findFirst()); // Always returns 1
    System.out.println(" findAny() " +IntStream.range(1,100).parallel().findAny()); // you can get a choice of element

    boolean idExists = list.stream().parallel().anyMatch(s -> s.getId() == 12);
    System.out.println(" idExists  "+idExists);

    // count()
    Long Kcount  = list.stream().filter(s -> s.getName().startsWith("K")).count();
    System.out.println( " Kcount "+Kcount);

    // map()
   Set<String> names =  list.stream().map(Sample::getName).collect(Collectors.toSet());
   System.out.println(" All the Names" +names);

    // map() + filter
    Set<String> names2 =  list.stream()
                              .map(Sample::getName)
                              .filter(name -> name.startsWith("A"))
                              .collect(Collectors.toSet());
    System.out.println(" Names Starts with A" +names2);

  }

}

