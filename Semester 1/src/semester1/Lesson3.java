package semester1;

public class Lesson3 {

	public static void main(String[] args) {
		
		int myInt = 7;
		//strings are objects that hold text. the word text refers to the string, hello is text object 
		String text = "Hello";
		
		String space = " ";
		
		String name = "Bob";
		
		String greeting = text + space + name;
		
		System.out.println(greeting);
		
		System.out.println("Hello" + " " + "Bob");
		
		System.out.println("My integer is: " + myInt);
		
		double myDouble = 7.8;
		
		char dot = '.';
		
		char comma = ',';
		System.out.println("My Number is: " + myDouble + space + name + dot);
		
		System.out.println(dot + space + comma);
	}
}
