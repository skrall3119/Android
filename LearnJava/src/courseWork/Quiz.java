package courseWork;

import java.util.Scanner;

/*
 * Variables:
 * - answer, String: Gets user input
 * - total, int: Total questions answered correctly
 * - questions, String[]: Array of questions
 * - answers, String[]: array of answers.
 * 
 * Process:
 * - Loop through the questions array
 * - get user to enter their answer
 * - add 1 to total if correct
 */

public class Quiz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		int total = 0;
		
		String[] questions = {"What is the capitol of Thailand?",
				"What is the alleged age of the Sphinx in Egypt? (In years)", 
				"Who is on the $100 bill?",
				"Who directed The Dark Knight?",
				"What is the worlds tallest building?"};
		String[] answers = {"Bangkok", "4500", "Benjamin Franklin", "Christopher Nolan", "Burj Khalifa"};
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			answer = scanner.nextLine();
			if(answer.equalsIgnoreCase(answers[i])) {
				System.out.println("Correct!");
				total++;
			} else {
				System.out.println("Incorrect!");
			}
		}
		System.out.println("Your score is: " + total + "/5");
		
		scanner.close();
	}
}
