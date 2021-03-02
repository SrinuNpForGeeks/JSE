package com.google.ex;
import com.google.bean.OrderBean;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;


public class ListEx5
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


Comparator<OrderBean> nameComparator = new Comparator<OrderBean>()
											{

												public int compare(OrderBean order1 , OrderBean order2)
													{
														String order1Name = order1.getItemName();
														String order2Name = order2.getItemName();
														return order1Name.compareTo(order2Name);
													} 
											};



Comparator<OrderBean> idComparator = new Comparator<OrderBean>()
											{

												public int compare(OrderBean order1 , OrderBean order2)
													{
														Integer order1Id = order1.getOrderId();
														Integer order2Id = order2.getOrderId();
														return order1Id.compareTo(order2Id);
													} 
											};

System.out.println(" Before the sort :: "+orderList);


Collections.sort(orderList,nameComparator);

System.out.println(" After the sort based On ItemName :: =>  "+orderList);


Collections.sort(orderList,idComparator);

System.out.println(" After the sort based On Id ::  => "+orderList);


  }
  
}

