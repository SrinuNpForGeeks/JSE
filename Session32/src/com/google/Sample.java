package com.google;

public class Sample {

  private Integer id;
  private String name;

  public Sample() {
  }

  public Sample(Integer id, String name) {
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

  public String toString() {
    return "[ " + id + " : " + name + "]";
  }
}
