// VARIABLES: temperature, String; input, Double; 
// PLAN: if temperature is less than 97.5, temperature is low.
// if temperature is between 97.5 and 99.5, temperature is normal.
// if temperature is greater than 99.5, temperature is high.

import java.util.Scanner;

public class controls {

	public static void main(String[] args) {
		double temperature; 
		String input;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter a temperature between 92, and 104.");
		input = scanner.nextLine();
		temperature = Double.parseDouble(input);
		scanner.close();
		
		if(temperature < 97.5) {
			System.out.println("Temperature is low!");
		} else if(temperature>=97.5 && temperature <= 99.5){
			System.out.println("Temperature is normal!");
		} else {
			System.out.println("Temperature is too high!");
		}

	}

}
