package com.google.ex;
import java.util.Set;
import java.util.LinkedHashSet;


 class Order  
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
 	
 }

public class SetExWihHashCodeAndEquals
{
	public static void main(String args[])
	{

		Set<Order> set = new LinkedHashSet<Order>();

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



	}
}
