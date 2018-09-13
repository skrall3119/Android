package CourseWork;

import java.util.Scanner;

public class AdvancedArrays {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		String supplies[][] = {{"ice cream", "cones", "dishes", "sprinkles", "chocolate"},
				{"320", "161", "192", "76", "92",}};
		int index;
		
		display(supplies);
		System.out.print("Please select the item you wish to change: ");
		String input = scanner.nextLine();
		switch(input) {
		case "ice cream":
			index = 0;
			changeValue(supplies, index);
			break;
		case "cones":
			index = 1;
			changeValue(supplies, index);
			break;
		case "dishes":
			index = 2;
			changeValue(supplies, index);
			break;
		case "sprinkles":
			index = 3;
			changeValue(supplies, index);
			break;
		case "chocolate":
			index = 4;
			changeValue(supplies, index);
			break;
		default:
			System.out.println("That was an invalid entry. Maybe you should READ your CHOICES!!");
		}
		scanner.close();
	}
	public static void display(String arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"    ");
			}
			
			System.out.println();
		}
	}
	
	public static void changeValue(String arr[][], int index) {
		System.out.println("Please enter how much to increase or decrease. \nInclude a + sign to increase and a - sign to decrease.");
		String value = scanner.nextLine();
		if(value.charAt(0) == '+') {
			String Stringnumber = value.substring(1);
			int originalNumber = Integer.parseInt(arr[1][index]);
			int number = Integer.parseInt(Stringnumber);
			int newNumber = originalNumber + number;
			arr[1][index] = Integer.toString(newNumber);
			display(arr);
		} else if(value.charAt(0) == '-') {
			String Stringnumber = value.substring(1);
			int originalNumber = Integer.parseInt(arr[1][index]);
			int number = Integer.parseInt(Stringnumber);
			if(originalNumber - number < 0) {
				System.out.println("This change will make the count negative. \nIt is impossible to have negative of a physical object. \nPlease try again.");
			} else {
				int newNumber = originalNumber - number;
				arr[1][index] = Integer.toString(newNumber);
				display(arr);
			}
		} else {
			System.out.println("You must specify weather you want to add(+) or subratct(-). Please try again.");
		}
	}
}