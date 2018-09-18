package courseWork;
import java.util.Scanner;
import java.lang.Math;

public class methods {
	
	public static double getTriangleArea(double base, double height) {
		return 0.5 * (base * height);
	}
	
	public static double getRectangleArea(double base, double height) {
		return base * height;
	}
	
	public static double getTrapezoidArea(double a, double b, double height) {
		return ((a + b)/2) * height;
	}
	
	public static double getCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static void main(String args[]) {
		double base;
		double height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a shape.");
		System.out.println("Options are: Triangle, Rectangle, Trapezoid, and Circle");
		System.out.print("Select Shape: ");
		String input = scanner.nextLine();
		input = input.toLowerCase();
		
		switch (input){
			case "triangle":
				System.out.println("Enter the base amd the height: ");
				System.out.print("Length: ");
				base = scanner.nextDouble();
				System.out.print("Height: ");
				height = scanner.nextDouble();
				System.out.println("the area of the triangle is: "+ getTriangleArea(base, height));
				break;
			case "rectangle":
				System.out.println("Enter the base length and the height: ");
				System.out.print("Length: ");
				base = scanner.nextDouble();
				System.out.print("Height: ");
				height = scanner.nextDouble();
				System.out.println("The area of the rectangle is: " + getRectangleArea(base, height));
				break;
			case "trapezoid":
				System.out.println("Enter the length of the top side, the bottom side, and the height: ");
				System.out.print("Top side length: ");
				double a = scanner.nextDouble();
				System.out.print("Bottom side length: ");
				double b = scanner.nextDouble();
				System.out.print("Height value: ");
				height = scanner.nextDouble();
				System.out.println("The area of the trapezoid is: " + getTrapezoidArea(a, b, height));
				break;
			case "circle":
				System.out.print("Enter the radius of the circle: ");
				double radius = scanner.nextDouble();
				System.out.println("The area of the circle is: " + getCircleArea(radius));
				break;
				
		}
		scanner.close();
	}
}
