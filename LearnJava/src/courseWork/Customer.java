package courseWork;

public class Customer {
	
	String customerName;
	String customerPhone;
	String customerAddress;
	double squareFootage;
	
	public Customer(String name, String number, String address, double sqft){
		this.customerName = name;
		this.customerPhone = number;
		this.customerAddress = address;
		this.squareFootage = sqft;
	}
}
