package learnJava;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String a = "Abdul";
		String b = "Mubi";
		
		System.out.println("Before Swap a is "+a);
		System.out.println("Before Swap b is "+b);
		
		//type-1
		a = a + b;
		
		b = a.substring(0, (a.length()-b.length()));
		
		a = a.substring(b.length());
		
		System.out.println("After Swap a is "+a);
		System.out.println("After Swap b is "+b);
		
		//type-2
		a = a.concat(b);
		
		b = a.replace(b, "");
		
		a = a.replace(b, "");
		
		System.out.println("After Swap a is "+a);
		System.out.println("After Swap b is "+b);

	}

}
