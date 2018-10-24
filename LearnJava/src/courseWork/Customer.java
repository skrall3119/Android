package courseWork;

/**
 * Customer Superclass.
 * @author alex
 *
 */
public class Customer {
	
	String customerName;
	String customerPhone;
	String customerAddress;
	double squareFootage;
	
	/**
	 * Constructor
	 * @param name
	 * @param number
	 * @param address
	 * @param sqft
	 */
	public Customer(String name, String number, String address, double sqft){
		this.customerName = name;
		this.customerPhone = number;
		this.customerAddress = address;
		this.squareFootage = sqft;
	}
}
