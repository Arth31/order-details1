package org.tek.interview.question.test;

import org.tek.interview.question.Item;
import org.tek.interview.question.Order;
import org.tek.interview.question.OrderLine;
import org.tek.interview.question.calculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class TestCalculator {
	
	
	Order order;
	Map<String, Order> o;

	@Before
	public void init() throws Exception{
		o = new HashMap<String, Order>();

		order = new Order();

		order.add(new OrderLine(new Item("book", (float) 13.99), 1));
		order.add(new OrderLine(new Item("music CD", (float) 16.99), 1));
		order.add(new OrderLine(new Item("chocolate bar", (float) 0.99), 1));

		o.put("Order 1", order);

    }
	
	@Test
	public void testRoundingEqual(){
		Assert.assertEquals(1.17, calculator.rounding(1.1665),0);
	}
	@Test
	public void testRoundingNotEqual(){
		Assert.assertNotEquals(1.16, calculator.rounding(1.1665),0);
	}
	
	

}
