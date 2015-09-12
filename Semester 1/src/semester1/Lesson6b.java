package semester1;

public class Lesson6b {

	public static void main(String[] args) {
		
		int loop = 0;
		
		while(5 == 5) {
			System.out.println("Looping: " + loop);
			
			
			//loop++ will increase it by one until its no longer < 5
			loop++;
			if(loop == 5) {
				break;  
			}
			System.out.println("Running ");
		}
	}

}
