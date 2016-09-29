package org.tek.interview.question;


/*
 * represents an item, contains a price and a description.
 *
 */
public class Item {
	private String description;
	private float price;

	public Item(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	//This function gives us the price for particular item
	public float getPrice() {
		return price;
	}
	
	//This function gets the information about item Description 
	public String getDescription() {
		return description;
	}

}
