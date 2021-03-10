package com.google;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectingOnStreams {

  public static void main(String[] args) {
    Employee emp1 = new Employee(101,"Srinu",5000f,"Java");
    Employee emp2 = new Employee(62,"Kalyan",50000f,"DataScience");
    Employee emp3 = new Employee(73,"Akash",50000f,"Java");
    Employee emp4 = new Employee(89,"Aravind",35000f,"Testing");
    Employee emp5 = new Employee(11,"Kavya",15000f,"Java");
    Employee emp6 = new Employee(15,"Uday",25000f,"DataScience");
    Employee emp7 = new Employee(10,"Arup",25000f,"Java");
    Employee emp8 = new Employee(12,"Umesh",15000f,"Testing");
    Employee emp9 = new Employee(73,"Akash",25000f,"Java");


    List<Employee> list = List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9);

    Set<String> departments = list.stream().map(Employee::getDepartmentName).collect(Collectors.toSet());
    System.out.println(departments);


    // Collectors.groupingBy() groups the data based on given key
    Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
    map.keySet().stream().forEach(key -> System.out.println(key + " : "+map.get(key)));

    List<Integer> numbersList = List.of(1,2,3,4);

    System.out.println("\n averagingInt() " +numbersList.stream().collect(Collectors.averagingInt(Integer::intValue)));
    System.out.println("\n summingInt() " +numbersList.stream().collect(Collectors.summingInt(Integer::intValue)));
    System.out.println("\n summarizingInt() " +numbersList.stream().collect(Collectors.summarizingInt(Integer::intValue)));


    List<String> namesList = List.of("Srinu","Kalyan");

    System.out.println(namesList.stream().collect(Collectors.joining(",")));

    System.out.println(namesList.stream().collect(Collectors.partitioningBy(e -> e.startsWith("S"))));


  }
}
