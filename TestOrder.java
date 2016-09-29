package org.tek.interview.question.test;


import org.tek.interview.question.Item;
import org.tek.interview.question.Order;
import org.tek.interview.question.OrderLine;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOrder {
	
	Item item1;
	Item item2;
	OrderLine oline1;
	OrderLine oline2;
	Order order;
	
	@Before
	public void init() throws Exception{
		item1 = new Item("Book",10.0f);
		item2 = new Item("Perfume",20.0f);
		oline1 = new OrderLine(item1,2);
		oline2 = new OrderLine(item2,4);
		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		orderLines.add(orderLine1);
		orderLines.add(orderLine2);
		order = new Order();

    }
	@Test(expected=IllegalArgumentException.class)
	public void testOrderLineNullException() throws Exception{
		oline1=null;
		order.add(oline1);
	}
	@Test
	public void testOrderLineNotNullException() throws Exception{
		order.add(oline1);
		order.add(oline2);
	}
	
	@Test
	public void testOrderSize() throws Exception{
		order.add(oline1);
		order.add(oline2);
		Assert.assertEquals(2,order.size(),0);
	}
	
	
	

}
