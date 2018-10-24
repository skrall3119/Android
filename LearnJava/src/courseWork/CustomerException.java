package courseWork;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CustomerException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		String address;
		String number;
		String propertyName;
		int numberOfProperties;
		double sqft;
		boolean isSenior;
		int userChoice;
		
		displayMenu();
		userChoice = scanner.nextInt();
		while (userChoice != 1 && userChoice != 2 && userChoice != 3) {
			try {
				displayMenu();
				userChoice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("You have entered an invalid type. Please enter 1,2, or 3.");
				scanner.next();
			}
		}
		scanner.nextLine();
		System.out.println("Please enter your name: ");
		name = scanner.nextLine();
		System.out.println("Please enter your address: ");
		address = scanner.nextLine();
		System.out.println("Please enter your phone number: ");
		number = scanner.nextLine();
		System.out.println("please enter the square footage of your property: ");
		sqft = scanner.nextDouble();
		
		
		if (userChoice == 1) {
			
			System.out.println("Please enter your age: ");
			int age = scanner.nextInt();
			if(age > 65) {
				isSenior = true;
			} else {
				isSenior = false;
			}
			Residential resident = new Residential(name, number, address, sqft, isSenior);
			resident.calculateCharges();
			
		} else if( userChoice == 2) {
			scanner.nextLine();
			System.out.println("Please enter your property name: ");
			propertyName = scanner.nextLine();
			System.out.println("How many properties will you be allowing us to maintain? There is a 10% discount when we maintain multiple properties.");
			numberOfProperties = scanner.nextInt();
			Commercial commerce = new Commercial(name, number, address, sqft, propertyName, numberOfProperties);
			commerce.calculateCharges();
		}
		scanner.close();

	}
	
	public static void displayMenu() {
		System.out.println("Thank you for choosing Janci's Lawncare.");
		System.out.println("Are you Residential, or Commercial? Please enter the number only.");
		System.out.println("1. Residential");
		System.out.println("2. Commercial");
		System.out.println("3. Done");
	}

}

