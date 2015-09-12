package semester1;

import java.util.Scanner;

public class Lesson7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = "";
				
		while(!"exit".equals(text)) {
			
			System.out.println("A monster has approached, do something fool!");
			
			text = input.next(); 
			
			System.out.println("You entered: " + text);
			
			if(text.equals("fight!")) {
				System.out.println("Lower the cannons, the battle begins!");
			}
			if(text.equals("help!")) {
				System.out.println("Here are your commands: ");
				System.out.println("fight!"); 
				System.out.println("You get help from some random dude"); 
				System.out.println("exit"); 
				System.out.println("walk... respect!"); 
			}
			
		}
		
		
	}
}
