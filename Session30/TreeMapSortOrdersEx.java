package com.google.sort.ex;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;


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

public class TreeMapSortOrdersEx
{
	public static void main(String args[])
	{

		 Map<Order,String> map = new TreeMap<Order,String>();

		Order order1 = new Order(2,"Iphone");
		
		Order order2 = new Order(1,"Laptop");

		Order order3 = new Order(10,"Doll");

		Order order4 = new Order(3,"Shirt");
 
		Order order5 = new Order(2,"Iphone");  
		
		Order order6 = new Order(1,"Laptop");


		map.put(order1,"Hyd");
		
		map.put(order2,"Pune");

		map.put(order3,"India");

		map.put(order4,"USA");

		map.put(order5,"Canada");

		map.put(order6,"KMM");

		Set<Order> set = map.keySet();

		for( Order orderRef : set)
			{
				System.out.println(orderRef + " =  "+map.get(orderRef));
			}


		Order order7 = new Order(1,"Laptop");

		System.out.println( " containsKey(orer-1) "+map.containsKey(order7));

	}
}
