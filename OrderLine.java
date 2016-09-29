package org.tek.interview.question;


/*
 * represents an order line which contains the @link Item and the quantity.
 *
 */

public class OrderLine {

	private int quantity;
	private Item item;
	

	/*
	 * @parameter item Item of the order
	 * 
	 * @parameter quantity Quantity of the item
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;               		
		this.quantity = quantity;   
		}
	
	public int getQuantity() {
		return quantity;
	}

	public Item getItem() {
		return item;
	}

	
}