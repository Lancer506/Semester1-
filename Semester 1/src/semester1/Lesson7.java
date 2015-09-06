package semester1;

import java.util.Scanner;

public class Lesson7 {
	public static void main(String[] args) {
		//Ctrl+Shift+O
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a floating point value: ");
		
		//Wait for the user to enter something
		double value = input.nextDouble(); 
		
		//Tell user what was entered
		System.out.println("You entered: " + value);
	}
}
