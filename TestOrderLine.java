package org.tek.interview.question.test;


import org.tek.interview.question.Item;
import org.tek.interview.question.OrderLine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOrderLine {
	Item item;
	OrderLine oline;
	
	@Before
	public void init() throws Exception{
		item = new Item("Book",10.0f);
		oline = new OrderLine(item,2);
    }
	@Test
	public void testGetQuantity(){
		Assert.assertEquals(2, oline.getQuantity());
	}

	@Test(expected=AssertionError.class)
	public void testQuantityMoreThanZero() throws Exception{
		//item=null;
		new OrderLine(item,0);
		
	}
	@Test(expected=Exception.class)
	public void testItemNotNull() throws Exception{
		item=null;
		new OrderLine(item,1);
		
	}

		
	
	

}
