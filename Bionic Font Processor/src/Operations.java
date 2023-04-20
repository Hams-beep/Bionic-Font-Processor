import java.util.Scanner;

public class Operations {
	void Text() {
		
		int x = 0;
		Scanner ask = new Scanner(System.in);

		System.out.println("Input Text");
		String input = ask.nextLine();
		String textOut[] = input.split(" ");
		System.out.println(textOut[1]);
		
	}
	int ContrastVal() {
		int x = 0;
		int value = 0;	
		Scanner ask = new Scanner(System.in);  	// to add the input feature.
		while (x < 1)
		{    // x is equal to 0 so this repeats until it changes
			System.out.println("Input Contrast percentage.");
			System.out.println("Options: 20%, 40%, 50%, 60%, 80%");
			value = ask.nextInt(); // asks for an input        	
		    if (value == 20 || value == 40 || value == 50 || value == 60 || value == 80) 
		    {
		    	 x++; // adds 1 to x so the while loop stops
		    }
		    else 
		    {
		    	System.out.println("Invalid input.");
		    }
		}	// "while" loop ending
		ask.close();  // closes the ask scanner
		return value;  // sends the contrast value to the main method.
	}
	
	
}