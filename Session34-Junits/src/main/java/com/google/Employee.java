package com.google;
public class Employee {

  private Integer employerId;
  private String employerName;
  private Float employeeSal;
  private String departmentName;

  public Employee()
  {

  }

  public Employee(Integer employerId, String employerName, Float employeeSal,
      String departmentName) {
    this.employerId = employerId;
    this.employerName = employerName;
    this.employeeSal = employeeSal;
    this.departmentName = departmentName;
  }

  public Integer getEmployerId() {
    return employerId;
  }

  public void setEmployerId(Integer employerId) {
    this.employerId = employerId;
  }

  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  public Float getEmployeeSal() {
    return employeeSal;
  }

  public void setEmployeeSal(Float employeeSal) {
    this.employeeSal = employeeSal;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString()
  {
    return "["+employerId+ " , "+employerName+" , "+employeeSal+","+departmentName+"]";
  }

  @Override
  public int hashCode()
  {
    return this.employerId;
  }

  @Override
  public boolean equals(Object obj)
  {
    com.google.Employee emp = (com.google.Employee)obj;
    return this.employerId == emp.getEmployerId();
  }

}
