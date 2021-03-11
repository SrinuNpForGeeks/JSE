package com.google;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import org.junit.Test;

public class EmployeeServiceTest {

  EmployeeService service = new EmployeeService();

  @Test
  public void getEmployeeById()
  {
   Employee employee = service.getEmployeeById(101);
   assertTrue(employee != null);
   assertTrue(employee.getDepartmentName().equals("Java"));
   assertTrue(employee.getEmployerName().equals("Srinu"));
   assertTrue(employee.getEmployeeSal().equals(5000f));
  }

  @Test
  public void getEmployeeById_InvalidId()
  {
    Employee employee = service.getEmployeeById(1001);
    assertTrue(employee == null);

  }

  @Test
  public void  maxSalariedEmployee()
  {
    Employee employee = service.maxSalariedEmployee();
    assertTrue(employee != null);
    assertTrue(employee.getDepartmentName().equals("DataScience"));
    assertTrue(employee.getEmployerName().equals("Kalyan"));
    assertTrue(employee.getEmployeeSal().equals(50000f));
  }


  @Test
  public void  maxSalary()
  {
  Double maxSal =  service.maxSal();
  assertTrue(maxSal == 50000f);
  }


  @Test
  public void partitioning()
  {
  Map<Boolean, List<Employee>> partitioningMap = service.partitioning();
  assertTrue(partitioningMap.size() == 2);
  assertTrue(partitioningMap.get(true).size() == 3);
  assertTrue(partitioningMap.get(false).size() == 5);
  assertTrue(partitioningMap.get(true).stream().anyMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Aravind")));
  assertTrue(partitioningMap.get(true).stream().anyMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Kalyan")));
  assertTrue(partitioningMap.get(true).stream().anyMatch(employee -> employee.getEmployerName().equalsIgnoreCase("Akash")));

  }
}
