package learnJava;

public class SwapTwoIntegerWithoutTemp {

	public static void main(String[] args) {
		
		long x = 345;
		long y = 45454;
		//by using + operator
		x = x+y;
		
		y = x-y;
		
		x = x -y;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("************************");
		//by using * operator
		
		x = x * y;

		y = x / y;

		x = x / y;

		System.out.println(x);
		System.out.println(y);
		
		System.out.println("************************");
		//by using XOR : ^
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
