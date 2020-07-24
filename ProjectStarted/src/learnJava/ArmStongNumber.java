package learnJava;

public class ArmStongNumber {

	public static int count(int num) {

		int cube = 0;

		while (num > 0) {
			num = num / 10;
			++cube;
		}

		return cube;
	}

	public static void isArmStrongNum(int num) {

		double cube = count(num);
		int t = num;
		double r = 0;
		int out = 0;
		//int a = 0;

		while (num > 0) {

			r = num % 10;
			num = num/10;

			out = (int) (out + (Math.pow(r, cube)));
		}

		//int a = (int) out;

		if (out == t) {
			System.out.println("Its an Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}

	}

	public static void main(String[] args) {
		
		isArmStrongNum(1741725);
	}

}
