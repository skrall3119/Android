package courseWork;

import courseWork.PositionTitle;

public class AdvancedEmployee {
	
	private String name;
	PositionTitle position;
	private int shift;
	private boolean salary;
	private double payRate;
	private String date;
	
	
	
	
	//Constructor
	public AdvancedEmployee(String name, PositionTitle position, int shift, boolean salary, double payRate, String date) {
		
		this.name = name;
		this.position = position;
		this.shift = shift;
		this.salary = salary;
		this.date = date;
		this.payRate  = payRate;
	}
	
	//Getter methods
	public String getEmployeeName() {
		return this.name;
	}
	
	public PositionTitle getEmployeePosition() {
		return this.position;
	}
	
	public int getShift() {
		return this.shift;
	}
	
	public boolean getSalary() {
		return this.salary;
	}
	public double getPayRate() {
		return this.payRate;
	}
	public String getDate() {
		return this.date;
	}
	
	//Setter methods
	public void setEmployeeName(String employeeName) {
		this.name = employeeName;
	}
	
	public void setEmployeePosition(PositionTitle employeePosition) {
		this.position = employeePosition;
	}
	public void setEmployeeShift(int employeeShift) {
		this.shift = employeeShift;
	}
	public void setSalary(boolean salary) {
		this.salary = salary;
	}
	public void setPayRate(double pay) {
		this.payRate = pay;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public boolean IsOvertime(double hoursIn) {
		if(hoursIn > 40) {
			return true;
		} else {
			return false;
		}
	}
	
	private double calcOTHours(double hoursIn, double pay, double overtime, double modifier) {
		overtime = hoursIn - 40;
		pay = this.payRate * 40;
		pay += ((this.payRate * modifier) + this.payRate) * 1.5 * overtime;
		return pay;
	}
	
	public double calculatePay(double hoursIn) {
		
		double pay = 0;
		double OTHours = 0;
		double modifier = 0;
		
		switch(this.shift) {
		case 1:
			if (IsOvertime(hoursIn)) {
				return calcOTHours(hoursIn, pay, OTHours, modifier);
			} else {
				return this.payRate * hoursIn;
			}
		case 2: 
			modifier = 0.05;
			if(IsOvertime(hoursIn)) {
				return calcOTHours(hoursIn, pay, OTHours, modifier);
			} else {
				return ((this.payRate * modifier) + this.payRate) * hoursIn;
			}
		case 3: 
			modifier = 0.1;
			if(IsOvertime(hoursIn)) {
				return calcOTHours(hoursIn, pay, OTHours, modifier);
			} else {
				return ((this.payRate * modifier) + this.payRate) * hoursIn;
			}
			default:
				return 0.0;
		}
	}
	
	//String representation
	public String toString() {
		String result = "Name: " + this.name + "\n" + "Employee Position: " + this.position
				+ "\n" + "Employee Shift: " + this.shift + "\n" + "Is salary?: " + this.salary + "\n"
				+ "Rate of pay: $" + this.payRate;
		return result;
	}
	
}