package java_example;

public class ConstructorWithAttributes {

	public static void main(String[] args) {

		ConstructorWithAttributes obj1 = new ConstructorWithAttributes(1001);
		ConstructorWithAttributes obj2 = new ConstructorWithAttributes(3456f);
		ConstructorWithAttributes obj3 = new ConstructorWithAttributes();

	}

	ConstructorWithAttributes(int a) {

		System.out.println(a);
	}

	ConstructorWithAttributes(float b) {
		
		System.out.println(b);
	}

	ConstructorWithAttributes() {

		System.out.println("No Attribute");
	}
}
