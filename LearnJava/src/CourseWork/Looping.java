// VARIABLES: input, Int; option1, String; option2, String; option3, String; option4, String; option5, String;
package CourseWork;
import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		int input;
		
		final String option1 = "Cheeseburger";
		final String option2 = "Double Cheeseburger";
		final String option3 = "Chicken Sandwich";
		final String option4 = "Hot Wings";
		final String option5 = "Hot Dog";
		
		System.out.println("Welcome to Sonic!");
		System.out.println("We serve the most typical American food in the industry!");
		System.out.println("Please choose a number between 1 and 5 inclusive to make your choice!");
		System.out.println("Your choices are: ");
		System.out.println("1: " + option1);
		System.out.println("2: " + option2);
		System.out.println("3: " + option3);
		System.out.println("4: " + option4);
		System.out.println("5: " + option5);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter your selection below!");
		input = scanner.nextInt();
		
		if(input > 5 || input < 1) {
			do {
				System.out.println("You have made an invalid choice!");
				System.out.println("Your choices are: ");
				System.out.println("1: " + option1);
				System.out.println("2: " + option2);
				System.out.println("3: " + option3);
				System.out.println("4: " + option4);
				System.out.println("5: " + option5);
				System.out.println("Please Enter your selection below!");
				
				input = scanner.nextInt();
			
			} while(input > 5 || input < 1);
		}
		
		switch(input) {
		case 1: System.out.print("You have selected: " + option1);
		break;
		case 2: System.out.print("You have selected: " + option2);
		break;
		case 3: System.out.print("You have selected: " + option3);
		break;
		case 4: System.out.print("You have selected: " + option4);
		break;
		case 5: System.out.print("You have selected: " + option5);
		break;
		default: System.out.println("That is an incorrect choice! please try again!");
		}
		
		scanner.close();
	}

}
