package java_example;

public class Asmnt2Scenario2 extends Method_Overload {

	public static void main(String[] args) {
		
		Asmnt2Scenario2 obj1 = new Asmnt2Scenario2();
		
		obj1.multiply(30, 30);
		
		Method_Overload obj2 = new Method_Overload();

	}

	public void multiply(int a, int b) {

		int c = a + b;
		System.out.println("Executing from Child Class and float result is "+ c);

	}

}
