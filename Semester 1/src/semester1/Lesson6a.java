package semester1;

public class Lesson6a {
	public static void main(String[] args) {
		//Does not equal !=
		//"=" means, assignment, this means that. "==" is a test for equality
		//e.g.
			//boolean condition = 5 == 7;
			//System.out.println(condition);
		
		int myInt = 10;
		
		if(myInt < 10) { //suppose 'if' wasn't resolved, anything in its brackets wouldn't resolve either
			System.out.println("Yes, its true.");
		}
		else if(myInt > 20){ //else if resolves when if doesn't 
			 System.out.println("No, its flase.");
		}
		else {
			System.out.println("None of the above.");
		}
	}
}
