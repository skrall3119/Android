//VARIABLES: number, Integer; numberName, String;
//PLAN: get user to input a number 1-10, and based on input will result in corresponding value.
// if the value is invalid, it will tell them to re enter a new value with the given criteria.

package courseWork;
import java.util.Scanner;

public class switchPractice {

	public static void main(String[] args) {
		int number;
		String numberName;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number name translator to spanish!");
		System.out.println("Please enter a number between 1 and 10: ");
		number = scanner.nextInt();
		scanner.close();
		
		switch (number) {
			case 1: numberName = "Uno";
			break;
			case 2: numberName = "Dos";
			break;
			case 3: numberName = "Tres";
			break;
			case 4: numberName = "Quatro";
			break;
			case 5: numberName = "Cinco";
			break;
			case 6: numberName = "Seis";
			break;
			case 7: numberName = "Siete";
			break;
			case 8: numberName = "Ocho";
			break;
			case 9: numberName = "Nueve";
			break;
			case 10: numberName = "Dies";
			break;
			default: numberName = "That is not a valid entry. Please enter a number between 1 and 10";
		}
		System.out.println(numberName);
	}

}
