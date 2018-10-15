package courseWork;

import java.util.Scanner;
import java.util.Random;

public class gobble {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int multipliers[] = {2, 3, 5, 10, 20};
		int inputs[] = {0, 0, 0, 0, 0};
		
		for (int index = 0; index < inputs.length; index++) {
			inputs[index] = scanner.nextInt();
		}
		scanner.close();
		printShit(inputs);
		Random rand = new Random();
		int selectMulti = (int)rand.nextInt(4) + 0;
		inputs[selectMulti] *= multipliers[selectMulti];
		System.out.print("\n");
		printShit(inputs);
		
		
	}
	public static void printShit(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
