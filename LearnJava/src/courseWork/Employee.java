package courseWork;

public class Employee {
	
	private String name;
	private int number;
	private int shift;
	
	
	//Constructor
	public Employee(String name, int number, int shift) {
		
		this.name = name;
		this.number = number;
		this.shift = shift;
	}
	
	//Getter methods
	public String getEmployeeName() {
		return this.name;
	}
	
	public int getEmployeeNumber() {
		return this.number;
	}
	
	public int getShift() {
		return this.shift;
	}
	
	//Setter methods
	public void setEmployeeName(String employeeName) {
		this.name = employeeName;
	}
	
	public void setEmployeeNumber(int employeeNumber) {
		this.number = employeeNumber;
	}
	public void setEmployeeShift(int employeeShift) {
		this.shift = employeeShift;
	}
	
	//String representation
	public String toString() {
		String result = "Employee Name: " + this.name + "\n" + "Employee Number: " + this.number
				+ "\n" + "Employee Shift: " + this.shift + "\n";
		return result;
	}
	
	
	public static void main(String args[]) {
		Employee Alex = new Employee("Alex", 333, 3);
		Employee Conor = new Employee("Conor", 117, 2);
		Employee Zack = new Employee("Zack", 223, 1);
		
		System.out.println(Alex);
		System.out.println(Conor);
		System.out.println(Zack);
		
	}
}
