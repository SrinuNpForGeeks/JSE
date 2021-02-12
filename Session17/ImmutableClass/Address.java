package com.google.ex;


public class Address implements Cloneable {
  
  private String city;
  private  long zipcode;
  
  public Address(){
    
  }

  public Address(String city, long zipcode) {
    this.city = city;
    this.zipcode = zipcode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public long getZipcode() {
    return zipcode;
  }

  public void setZipcode(long zipcode) {
    this.zipcode = zipcode;
  }

  public Address copyObject() 
  {
  	Address addr = null;
  	try
  	{
  		addr = (Address) this.clone();
  		
  	}catch(CloneNotSupportedException exp)
  	{
  		System.out.println(" Cloning is failed");
  	}
  	return addr;
  }
}
