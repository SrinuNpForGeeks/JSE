package com.google;

public class EmployeeStreams {

  public static void main(String[] args) {

    EmployeeService service = new EmployeeService();

    System.out.println(" \n Employee by Id 101"+service.getEmployeeById(101));

    System.out.println(" \n MaxSalairies Employee Details"+service.maxSalariedEmployee());

    System.out.println(" \n MaxSalary "+service.maxSal());

    System.out.println(" \n Partitioning by Sal >=35K "+service.partitioning());
  }


}
