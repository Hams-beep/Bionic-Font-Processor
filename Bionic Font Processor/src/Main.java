import java.util.Scanner;
public class Main
{

	public static void main(String[] args) 
	{
		int Contrast = 0;
		Scanner sc = new Scanner (System.in);
		Inputs input = new Inputs();//to call the ContrastCal class
		
		String text[] = input.Text(sc);
		
		Contrast = input.ContrastVal(sc); //calls the operations class and the method ContrastVal and put it in the variable, Contrast
		System.out.println("Contrast Value is " + Contrast + "%.");
		
		String colorText = input.colorInput(sc);
		System.out.println("Your color is " + colorText);
		
		for(int x=0; x < text.length; x++)
		{
			int wordLength = text[x].length();
			int index = OperateMath.boldWord(Contrast, wordLength);
			System.out.println("Emphasized: "+ text[x].substring(0, index));
			System.out.println("Normal: " + text[x].substring(index, text[x].length()));
			System.out.println(text[x]);		
		}
		sc.close();		
	}

	
}
