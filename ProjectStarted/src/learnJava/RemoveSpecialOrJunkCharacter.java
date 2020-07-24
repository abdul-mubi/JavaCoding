package learnJava;

public class RemoveSpecialOrJunkCharacter {

	public static void main(String[] args) {
		
		String a = "@!#$^& My Name &!@&*& is #&&$(!@ Abdul @&*#*&@* 004 $$%#%";
		
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(a);

	}

}
