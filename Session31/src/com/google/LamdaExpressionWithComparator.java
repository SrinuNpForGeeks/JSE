package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaExpressionWithComparator {

  public static void main(String[] args) {
    Employee emp1 = new Employee(10, "Srinu");
    Employee emp2 = new Employee(12, "Kalyan");
    Employee emp3 = new Employee(1, "Kavya");
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(emp1);
    employeeList.add(emp2);
    employeeList.add(emp3);

    System.out.println(" Before Sort = > " + employeeList);

    Collections.sort(employeeList, (e1, e2) -> e1.getEmployeeId().compareTo(e2.getEmployeeId()));
    System.out.println(" After  Sort Based on employee Id= > " + employeeList);

    Collections
        .sort(employeeList, (e1, e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()));
    System.out.println(" After  Sort Based on employeeName = > " + employeeList);
  }
}

class Employee {

  private Integer employeeId;
  private String employeeName;

  public Employee(Integer employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {

    return "[" + employeeId + " : " + employeeName + " ]";
  }
}
