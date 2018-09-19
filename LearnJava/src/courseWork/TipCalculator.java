/* VARIABLES: 
 * - input, Double: User input.
 * - total, Double: sum of all values entered by user.
 * - tax, Double: static value.
 * - tip, Double: static value.
 * 
 * OBJECTS:
 * - scanner, Scanner: Allows user to enter input.
 * - defaultFormat, NumberFormat: rounds decimals to 100th place and inserts a $.
 * 
 * PROCESS: 
 * - asks user to input data until they enter 0.
 * - totals sum of all inputs.
 * - calculates tip, tax, and grand total
 * - displays to user.
 */

package courseWork;

import java.util.Scanner;
import java.text.NumberFormat;

public class TipCalculator {

	public static void main(String[] args) {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the item prices. enter '0' when done: ");
		
		double input;
		double total = 0;
		double tax = .025;
		double tip = .175;
				
		do {
			input = scanner.nextDouble();
			total += input;
		} while (input != 0);
		System.out.println("Yourt total is: " + defaultFormat.format(total));
		System.out.println("Tax at 2.5%: " + defaultFormat.format(total * tax));
		System.out.println("Reccomended tip at 17.5%: " + defaultFormat.format(total * tip));
		System.out.println("Grand Total including tax and tip: " + defaultFormat.format(total + (total * tip) + (total * tax)));
		scanner.close();
	}
}
