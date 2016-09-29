package org.tek.interview.question.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.tek.interview.question.Item;
import org.tek.interview.question.OrderLine;
import org.junit.Test;
import org.mockito.Mockito;
import org.tek.interview.question.calculator;
import org.tek.interview.question.Order;



public class TestCalclator {
	
	
	Order order;
	Map<String, Order> o1;

	@Before
	public void init() throws Exception{
		o1 = new HashMap<String, Order>();

		order = new Order();

		order.add(new OrderLine(new Item("book", (float) 13.99), 1));
		order.add(new OrderLine(new Item("music CD", (float) 16.99), 1));
		order.add(new OrderLine(new Item("chocolate bar", (float) 0.99), 1));

		o1.put("Order 1", order);

    }
	
	@Test
	public void testRoundingNotEqual(){
		Assert.assertNotEquals(1.46, calculator.rounding(1.4665),0);
	}
	
	@Test
	public void testRoundingEqual(){
		Assert.assertEquals(1.47, calculator.rounding(1.4665),0);
	}
	
	

}
