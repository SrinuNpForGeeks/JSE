package com.google.bean;
import java.io.Serializable;

public class OrderBean implements  Comparable<OrderBean>
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

public boolean equals(Object obj)
{
    OrderBean order = (OrderBean) obj;

   if(this.orderId == order.getOrderId())
        return true;

    else 
        return false;
}


public int hashCode()
{

    return this.orderId;

}



@Override
public int compareTo(OrderBean bean)
{
    if(this.orderId == bean.getOrderId())
        {
          return 0;
        }
    else if(this.orderId > bean.getOrderId())
          {
            return 1;
          }
    else
        {
          return -1;
        }
}

public String toString()
{
  return "[" + orderId+" : "+orderBy+" : "+itemName+" : "+orderAmount + " ]";
}

}





