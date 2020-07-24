package learnJava;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Abdul";

		int size = name.length();// size = 5

		//reverse string-type1
		String rev = "";

		for (int i = size - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
        }
		System.out.println(rev);
		
		//reverse string-type2
		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println(sb);

	}

}
