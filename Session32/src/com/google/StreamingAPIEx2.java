package com.google;

import java.util.ArrayList;
import java.util.List;

// Sort the Elements and Print
public class StreamingAPIEx2 {

  public static void main(String[] args) {
    List<SampleEx3> list = new ArrayList<>();
    list.add(new SampleEx3(12,"Srinu"));
    list.add(new SampleEx3(1,"Kavya"));
    list.add(new SampleEx3(15,"Uday"));

    list.stream().sorted().forEach(System.out::println);
  }
}

class SampleEx1 implements  Comparable<SampleEx1>
{
  private Integer id;
  private String name;

  public SampleEx1() {
  }

  public SampleEx1(Integer id, String name) {
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

  @Override
  public int compareTo(SampleEx1 o) {
    return this.id.compareTo(o.id);
  }
}

