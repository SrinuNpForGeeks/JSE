package com.google.sort.ex;
import java.util.Set;
import java.util.TreeSet;


 class Order  implements Comparable<Order>
 {
 	private Integer orderId;
 	private String orderName;

 	public Order(Integer orderId , String orderName)
 	{
 		this.orderId = orderId;
 		this.orderName = orderName;
 	}

 	public Integer getOrderId()
 	{
 		return orderId;
 	}

	public String getOrderName()
 	{
 		return orderName;
 	}

 	public String toString()
 	{
 		return "["+ orderId + " : "+orderName+ "]";
 	}

 	public int hashCode()
 	{
 		return this.orderId;
 	}

 	public boolean equals(Object obj)
 	{
 		Order order = (Order) obj;

 		return this.orderId == order.getOrderId();
 	}

 	public int compareTo(Order order)
 	{

 		return this.orderId.compareTo(order.getOrderId());
 	}
 	
 }

public class TreeSetSortOrdersEx
{
	public static void main(String args[])
	{

		Set<Order> set = new TreeSet<Order>();

		Order order1 = new Order(2,"Iphone");
		
		Order order2 = new Order(1,"Laptop");

		Order order3 = new Order(10,"Doll");

		Order order4 = new Order(3,"Shirt");
 
		Order order5 = new Order(2,"Iphone");  
		
		Order order6 = new Order(1,"Laptop");


		set.add(order3);
		set.add(order1);
		set.add(order4);
		set.add(order2);
		set.add(order5);
		set.add(order6);


		for(Order orderRef : set)
		{
			System.out.println(orderRef);
		}

		boolean isExists = set.contains(new Order(10,"Doll"));

		System.out.println(" Order contains with id 10 ? "+isExists);


	}
}
