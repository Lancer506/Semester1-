package semester1;

public class Lesson11 {
	public static void main(String[] args) {

		String[] words = new String[3];
		
		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "bannana", "pear", "kiwi"};
		
		for(String fruit: fruits)	{
			System.out.println(fruit);
		}
		//primitive types begin with lowercase letters
		int value = 0;
		//non primitive type, a class
		String text = null;
		System.out.println(text);
		//references arrays
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		
		texts[0] = "one";
		
		
	}
}
