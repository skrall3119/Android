package courseWork;

import java.text.NumberFormat;

/**
 * 
 * @author Alex
 * Residential Class
 */

public class Residential extends Customer {
	
	double rate = 6;
	double discount = 0;
	boolean isSenior;
	
/**
 * Constructor method
 * @param name
 * @param number
 * @param address
 * @param sqft
 * @param isSenior
 */
	public Residential(String name, String number, String address, double sqft, boolean isSenior) {
		super(name, number, address, sqft);
		
		this.isSenior = isSenior;
		
	}
	/**
	 * Calculates and displays the bill based on userdata.
	 */
	public void calculateCharges() {
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		double cost = (this.squareFootage / 1000) * rate;
		if(this.isSenior == true) {
			discount = (cost * .15);
			cost -= discount;
		}
		
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Customer Phone: " + this.customerPhone);
		System.out.println("Customer Address: " + this.customerAddress);
		System.out.println("Square Footage: " + this.squareFootage);
		System.out.println("Senior discount applicable? " + this.isSenior);
		System.out.println("Discount amount: " + formatter.format(discount));
		System.out.println("Weekly Cost: " + formatter.format(cost));
	}

}
