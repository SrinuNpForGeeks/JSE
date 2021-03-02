package com.google.ex;
import com.google.bean.OrderBean;
import java.util.List;
import java.util.LinkedList;


public class ListEx1
{
  public static void main(String args[])
  {

List<OrderBean> orderList = new LinkedList<OrderBean>();

OrderBean order1 = new OrderBean(111,"Srinu","IPhone11",60000f);
OrderBean order2 = new OrderBean(555,"Srinu","Laptop",50000f);
OrderBean order3 = new OrderBean(67,"Srinu","Plants",5000f);
OrderBean order4 = new OrderBean(12,"Srinu","Shirts",1000f);

orderList.add(order1);
orderList.add(order2);
orderList.add(order3);
orderList.add(order4);


for(OrderBean orderRef: orderList)
{
  System.out.println(orderRef.getOrderId()+ " : "+orderRef.getOrderBy()+" : "+orderRef.getItemName()+" : "+orderRef.getOrderAmount());
}

  }
  
}