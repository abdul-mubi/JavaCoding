package java_example;

public class Asmnt2Scenario1 extends Method_Overload {

	public static void main(String[] args) {
		
		Asmnt2Scenario1 obj1 = new Asmnt2Scenario1();
		
		obj1.multiply(30, 30);
		obj1.multiply(200.5f, 30.8f);

	}

	public void multiply(float a, float b) {

		float c = a * b;
		System.out.println("Executing from Child Class and float result is "+ c);

	}

}
