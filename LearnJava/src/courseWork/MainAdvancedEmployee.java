package courseWork;

import courseWork.AdvancedEmployee;

public class MainAdvancedEmployee {

	public static void main(String[] args) {
		
		AdvancedEmployee James = new AdvancedEmployee("James McHenry", PositionTitle.PRODUCTION, 2, true, 23.4, "2/5/1998");
		AdvancedEmployee Christ = new AdvancedEmployee("Christ Baer", PositionTitle.MAINTENANCE, 3, false, 21.2, "3/7/2001");
		AdvancedEmployee Alex = new AdvancedEmployee("Alex Janci", PositionTitle.ADMINISTRATION, 1, true, 35.5, "9/8/2016");
		
		System.out.println(James + "\n$" + James.calculatePay(50.0));
		System.out.println("\n");
		System.out.println(Christ + "\n$" + Christ.calculatePay(40.0));
		System.out.println("\n");
		System.out.println(Alex + "\n$" + Alex.calculatePay(45.5));
	}

}
