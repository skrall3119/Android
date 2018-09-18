package courseWork;

import java.util.Scanner;

public class Overload {
	
	public static void printInfo(String name, String number, String businessname) {
		System.out.println(name);
		System.out.println(number);
		System.out.println(businessname);
	}
	
	public static void printInfo(String name, String number) {
		System.out.println(name);
		System.out.println(number);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you a business customer or residential customer?");
		String firstChoice = scanner.nextLine();
		
		String name;
		String number;
		
		firstChoice = firstChoice.toLowerCase();
		
		switch(firstChoice) {
		case "business":
			System.out.print("Please enter a Business name: ");
			String businessName = scanner.nextLine();
			System.out.print("Please enter your name: ");
			name = scanner.nextLine();
			System.out.print("Please enter a phone number: ");
			number = scanner.nextLine();
			printInfo(name, number, businessName);
			break;
		case "resident":
			System.out.print("Please enter your name: ");
			name = scanner.nextLine();
			System.out.print("Please enter a phone number: ");
			number = scanner.nextLine();
			printInfo(name, number);
			break;
		}
		scanner.close();
	}

}
