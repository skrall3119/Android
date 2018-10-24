package courseWork;

import java.text.NumberFormat;

public class Commercial extends Customer {
	
	double rate = 5;
	double discount = 0;
	String propertyName;
	int numberOfProperties;

	/**
	 *  Commercial Class
	 * @param name
	 * @param number
	 * @param address
	 * @param sqft
	 * @param propertyName
	 * @param numberOfProperties
	 */
	public Commercial(String name, String number, String address, double sqft, String propertyName, int numberOfProperties) {
		super(name, number, address, sqft);
		
		this.numberOfProperties = numberOfProperties;
		this.propertyName = propertyName;
		
	}
	/**
	 * Calculates and displays the the bill based on userdata.
	 */
	public void calculateCharges() {
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		double cost = (this.squareFootage / 1000) * rate;
		if(this.numberOfProperties > 1) {
			discount = (cost * .1);
			cost -= discount;
		}
		
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Customer Phone: " + this.customerPhone);
		System.out.println("Customer Address: " + this.customerAddress);
		System.out.println("Property Name: " + this.propertyName);
		System.out.println("Square Footage: " + this.squareFootage);
		System.out.println("Number of Properties: " + this.numberOfProperties);
		System.out.println("Multi-Property Discount amount: " + formatter.format(discount));
		System.out.println("Weekly Cost: " + formatter.format(cost));
	}
}
