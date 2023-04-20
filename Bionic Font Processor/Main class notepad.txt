import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int Contrast = 0;
		
		Operations operate = new Operations();
			//to call the ContrastCal class
	   // operate.Text();
		Contrast = operate.ContrastVal(); //calls the operations class and the method ContrastVal and put it in the variable, Contrast
		System.out.println("Contrast Value is " + Contrast + "%.");
		
		
		
		
		
	}

}
