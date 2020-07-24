package learnJava;

public class PalindromeNumber {

	public static boolean isPalindromeNum(int num) {

		int rev = 0;
		int temp = num;

		while (temp > 0) {

			rev = (rev*10) + (temp % 10) ;
			temp = temp / 10;
		}

		return rev==num;
	}

	public static void main(String[] args) {
		
		System.out.println(isPalindromeNum(989));
		

	}

}
