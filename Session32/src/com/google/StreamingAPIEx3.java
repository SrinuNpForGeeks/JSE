package com.google;

import java.util.ArrayList;
import java.util.List;

// Sort the Elements and Print
public class StreamingAPIEx3 {

  public static void main(String[] args) {
    List<SampleEx3> list = new ArrayList<>();
    list.add(new SampleEx3(12,"Srinu"));
    list.add(new SampleEx3(1,"Kavya"));
    list.add(new SampleEx3(15,"Uday"));
    list.add(new SampleEx3(19,"Arup"));

    list.stream().sorted((s1, s2) -> s1.getId().compareTo(s2.getId()) ).forEach(System.out::print);
    System.out.println("\n");
    list.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName()) ).forEach(System.out::print);

  }
}

class SampleEx3
{
  private Integer id;
  private String name;

  public SampleEx3() {
  }

  public SampleEx3(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString()
  {
    return "[ "+id + " : "+ name +"]";
  }

}

