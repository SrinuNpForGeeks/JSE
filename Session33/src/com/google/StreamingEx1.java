package com.google;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingEx1 {

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

    //anyMatch() : returns true atleast one employee name is equal to "Srinu"
    boolean anyMatch  = list.stream().anyMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Srinu") );
    System.out.println("anyMatch() " +anyMatch); //true

    //allMatch() : expects all the employee names should be Srinu
    boolean allMatch  = list.stream().allMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Srinu") );
    System.out.println("allMatch() " +allMatch); //false

    //noneMatch() : none of the employee name should be Srinu
    boolean noneMatch  = list.stream().noneMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Srinu") );
    System.out.println("noneMatch() " +noneMatch); //false

    //findFirst() always returns the First Occurance of the given Element
   Employee findFirst = list.stream().filter(employee -> employee.getDepartmentName().equals("Java")).parallel().findFirst().orElse(null);
   System.out.println("findFirst() " +findFirst);

    //findAny() always returns random element found in collection
    Employee findAny = list.stream().filter(employee -> employee.getDepartmentName().equals("Java")).parallel().findAny().orElse(null);
    System.out.println("findAny() " +findAny);

    // Single Level Of Sorting :: Sorting based on EmployeeName
    System.out.println("\n\n SingleLevel Sorting");
    list.stream().sorted(Comparator.comparing(Employee::getEmployerName)).forEach(System.out::println);

    // Multi Level Of Sorting :: First Sort based on EmployeeName :: ThenSort Employee Sal
    System.out.println("\n\n Multi - Level Sorting");
    list.stream().sorted(Comparator.comparing(Employee::getEmployerName).thenComparing(Employee::getEmployeeSal)).forEach(System.out::println);

    //mapToDouble() returns Double Stream
    System.out.println( "Total Salary "+ list.stream().mapToDouble(Employee::getEmployeeSal).sum());

    System.out.println(list.stream().collect(Collectors.partitioningBy(employee -> employee.getEmployeeSal() >= 35000f)));

    System.out.println(list.stream().collect(Collectors.partitioningBy(employee -> employee.getEmployeeSal() >= 35000f,Collectors.groupingBy(Employee::getDepartmentName))));

  }
}
