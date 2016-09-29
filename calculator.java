package org.tek.interview.question;

import java.util.Map;

public class calculator {


	public static double rounding(double value) {

		return Math.round(value*100.0)/100.0; 
	}

	/**
	 * This method receives a collection of orders. For each order, it iterates on the order lines(olines) and calculates the total price multiplying
	 * item's price into quantity into taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order
	 */
	public void calculate(Map<String, Order> o) {

		double grandtotal = 0;

		// Iterate through the orders
		for (Map.Entry<String, Order> entry : o.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");
			//initialized grandtotal = 0;
			Order r = entry.getValue();
			//System.out.println(r.size());

			double totalTax = 0;
			double total = 0;

			// Iterate through the items in the order
			for (int i = 0; i < r.size(); i++) {    
				// Now Calculating the taxes
				double tax = 0;

				if (r.get(i).getItem().getDescription().contains("imported")) {
					tax = rounding(r.get(i).getItem().getPrice() * 0.15); 					// imported items
					
				} else {
					tax = rounding(r.get(i).getItem().getPrice() * 0.10);
									}

				
				double totalprice = r.get(i).getItem().getPrice() + rounding(tax);

				// Print out the item's total price
				System.out.println(r.get(i).getItem().getDescription() + ": " + rounding(totalprice));

								totalTax += tax;
				total += totalprice;  // totalprice is calculated . but not used. accessing old values
			}

						System.out.println("Sales Tax: " + rounding(totalTax));

			total = total + totalTax;

			// Print out the total amount
			System.out.println("Total: " + rounding(total));  
			grandtotal += total;
		}

		System.out.println("Sum of orders: " + rounding(grandtotal) );
	     
	}
	
	
}
