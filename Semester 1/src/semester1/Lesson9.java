package semester1;

import java.util.Scanner;

public class Lesson9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text = "";
		while (!text.equals("stop")) {
			System.out.println("Please enter a command: ");
			text = input.nextLine();
			switch (text) {
			case "start":
				System.out.println("Machine started!");
				break;
					
			case "stop":
				System.out.println("Machine stopped!");
				break;

			default:
				System.out.println("Command not recognized");
			}
		}
		System.out.println("You died. Good Job.");
	}
}
