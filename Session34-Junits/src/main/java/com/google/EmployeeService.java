package com.google;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeService {

  List<Employee> list ;
  Map<Integer,Employee> employeesMap;

  public EmployeeService()
  {
    Employee emp1 = new Employee(101,"Srinu",5000f,"Java");
    Employee emp2 = new Employee(62,"Kalyan",50000f,"DataScience");
    Employee emp3 = new Employee(73,"Akash",50000f,"Java");
    Employee emp4 = new Employee(89,"Aravind",35000f,"Testing");
    Employee emp5 = new Employee(11,"Kavya",15000f,"Java");
    Employee emp6 = new Employee(15,"Uday",25000f,"DataScience");
    Employee emp7 = new Employee(10,"Arup",25000f,"Java");
    Employee emp8 = new Employee(12,"Umesh",15000f,"Testing");
    list = List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8);

    employeesMap = list.stream().collect(Collectors.toMap(Employee::getEmployerId, Function.identity()));
  }

  public Employee getEmployeeById(Integer employerId)
  {
    return employeesMap.get(employerId);
  }

  public Employee maxSalariedEmployee()
  {
    return list.stream().max(Comparator.comparing(Employee::getEmployeeSal)).orElse(null);
  }

  public Double maxSal()
  {
    return list.stream().mapToDouble(Employee::getEmployeeSal).max().orElse(0d);
  }

  public Map<Boolean,List<Employee>> partitioning()
  {
    return list.stream().collect(Collectors.partitioningBy(employee -> employee.getEmployeeSal() >= 35000f));
  }

}
