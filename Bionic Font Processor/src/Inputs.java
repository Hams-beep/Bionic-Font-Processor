import java.util.Scanner;

public class Inputs {
	
	public String[] Text(Scanner sc) 
	{	
		int numWords = 0;
        boolean x = true;   
        String words[] = null;
        // Split the input string into words
        while (x) 
        {
        	System.out.println("Please enter a text with 100 words:");
        	String userInput = sc.nextLine();
        	words = userInput.split(" ");
        	numWords = words.length;
        	if (numWords <= 100) 
        	{
        		System.out.println("Input accepted");
        		x = false;
        	} else if (numWords > 100) {
        		System.out.println("You entered " + numWords + " words. Please enter " + (numWords - 100) + " fewer words.");
        	
        	}
        }
        return words;
	}
	
	public int ContrastVal(Scanner sc) 
	{
		boolean isInvalid = true;
		int value = 0;
		while (isInvalid)
		{    // x is equal to 0 so this repeats until it changes
			System.out.println("Input Contrast percentage.");
			System.out.println("Options: 20%, 40%, 50%, 60%, 80%");
			value = sc.nextInt(); // asks for an input    
			sc.nextLine();
			if (value == 20 || value == 40 || value == 50 || value == 60 || value == 80) 
		    {
		    	 isInvalid = false; 
		    }
		    else 
		    {
		    	System.out.println("Invalid input.");
		    }
		}	// "while" loop ending
		return value;  // sends the contrast value to the main method.
	}
	
	public String colorInput(Scanner sc) 
	{
		String color;

        while (true) {
            System.out.print("Enter a color (Red, Blue, Green, Black): ");
            color = sc.nextLine();

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
        return color;
	}
	
	
}