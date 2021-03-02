package com.google.bean;
import java.io.Serializable;

public class OrderBean implements Serializable
{
  private Integer orderId;
  private String orderBy;
  private String itemName;
  private Float orderAmount;

  public OrderBean(){
  	
  }

  public OrderBean(Integer orderId, String orderBy, String itemName, Float orderAmount) {
    this.orderId = orderId;
    this.orderBy = orderBy;
    this.itemName = itemName;
    this.orderAmount = orderAmount;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public Float getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Float orderAmount) {
    this.orderAmount = orderAmount;
  }


}