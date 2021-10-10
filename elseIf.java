
public class elseIf {

	public static void main(String[] args) {
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("POSITIVE");
		} 
		else if(num < 0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}
		
		
		int new_number = 100;
		
		if(new_number > 0) {
			System.out.println("Greater than 0");
		}
		if(new_number > 50) {
			System.out.println("Greater than 50");
		}
		if(new_number > 90) {
			System.out.println("Greater than 90");
		}
		
		
		int my_number = 100;
		
		if(my_number > 0) {
			System.out.println("Greater than 0");
		}
		else if(my_number > 50) {
			System.out.println("Greater than 50");
		}
		else if(my_number > 90) {
			System.out.println("Greater than 90");
		}

	}

}
