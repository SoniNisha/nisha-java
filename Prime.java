
public class Prime {

	public static void main(String[] args) {
		
		int num = 12;
		
		int count_of_factors = 0;
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				count_of_factors += 1;
			}
		}
		
		System.out.println(count_of_factors);
		if(count_of_factors == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
