package com.google.ex;

public final class Person {

  private final int personId;
  private final String personName;
  private final Address address;

  public Person()
  {
    personId = 0;
    personName = null;
    address = null;
  }

  public Person(int personId, String personName, Address address) {
    this.personId = personId;
    this.personName = personName;
    this.address = address;
  }

  public int getPersonId() {
    return personId;
  }


  public String getPersonName() {
    return personName;
  }
 

  public Address getAddress() {

    return address.copyObject();
  }

}


