package com.google.ex;

public final class Person {

  private final int personId;
  private final String personName;


  public Person()
  {
    personId = 0;
    personName = null;

  }

  public Person(int personId, String personName) {
    this.personId = personId;
    this.personName = personName;

  }

  public int getPersonId() {
    return personId;
  }


  public String getPersonName() {
    return personName;
  }
 
  public String toString()
  {
    return personId + " : "+personName;
  }
}


