
public class ifElse {

	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 300;
		
		if(num1 == num2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
		System.out.println(100 == 200);
		System.out.println(1000 == 1000);
		
		System.out.println(100 > 20);
		System.out.println(10 > 200);
		
		System.out.println(100 < 200);
		System.out.println(100 < 50);
		
		System.out.println(1000 > 1000);
		System.out.println(1000 >= 1000);
		System.out.println(1000 >= 500);
		
		System.out.println(1000 <= 200);
		System.out.println(100 <= 200);
		System.out.println(100 <= 100);
		
		System.out.println(100 != 100);
		System.out.println(100 != 200);
		
		
		int a = 50;
		int b = 30;
		if(a>b) {
			System.out.println("Greater : "+a);
		}
		else {
			System.out.println("Greater : "+b);
		}
	}

}
