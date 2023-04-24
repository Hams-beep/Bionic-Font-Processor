import java.util.Scanner;

	public class colorInput {
	    public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        String color;

	        while (true) {
	            System.out.print("Enter a color (Red, Blue, Green, Black): ");
	            color = scanner.nextLine();

	            if (color.equalsIgnoreCase("Red") ||
	                    color.equalsIgnoreCase("Blue") ||
	                    color.equalsIgnoreCase("Green") ||
	                    color.equalsIgnoreCase("Black")) {
	                break; // valid color entered, exit loops
	            } else {
	                System.out.println("Invalid color. Please try again.");
	            }
	        }

	        System.out.println("You entered: " + color);
	    }
	}