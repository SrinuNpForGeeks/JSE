package com.google.ex;
import com.google.bean.OrderBean;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;


public class ListEx4
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


System.out.println(" Before the sort :: "+orderList);

Collections.sort(orderList);

System.out.println(" After the sort :: "+orderList);


  }
  
}

