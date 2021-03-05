package com.google.ex;
import java.util.Queue;
import java.util.PriorityQueue;


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

 	public String toString()
 	{
 		return "["+ orderId + " : "+orderName+ "]";
 	}

 	public int compareTo(Order order)
 	{
 		return  this.orderId.compareTo(order.getOrderId());
 	}

 	public boolean equals(Object obj)
 	{
 		Order order = (Order) obj;

 		return this.orderId == order.getOrderId();
 	}

 	public int hashCode()
 	{
 		return this.orderId+1242;
 	}
 }

public class QueueEx4
{

	public static void main(String args[])
	{

		Queue<Order> queue = new PriorityQueue<Order>();

		Order order1 = new Order(2,"Iphone");
		
		Order order2 = new Order(1,"Laptop");

		Order order3 = new Order(10,"Doll");

		Order order4 = new Order(3,"Shirt");


	

		queue.add(order3);
		queue.add(order1);
		queue.add(order4);
		queue.add(order2);


		System.out.println("  First Order in the Queue :: "+queue.peek());


		System.out.println(" Orders in Queue before Remove :: "+queue);

		queue.poll();

		System.out.println(" Orders in Queue After Remove :: "+queue);

		Order searchOrder = new Order(10,"Doll");

		System.out.println(" Order contains with id 10 => "+queue.contains(searchOrder));

		System.out.println(" Order3 hashCode :: "+order3.hashCode());
		System.out.println(" SearchOrder hashCode :: "+searchOrder.hashCode());


	}
}