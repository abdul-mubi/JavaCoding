package demoApplicatons;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		String name = "madam naan abdul yaay";

		String[] arr = name.split(" ");
		
		String rev ="";
		
		//System.out.println(arr.length);

		//int[] intarray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			String string = arr[i];
			
			for(int j=string.length()-1; j>=0; j--) {
				
				rev = rev + string.charAt(j);
				
			}
			
			
			
			if (rev.equals(string)) {

				int size = rev.length();
				
				list.add(size);

			}
			
			rev = "";

		}
		
		//System.out.println(list.size());
		
		for(int a: list) {
			
			System.out.println(a);
		}

	}
}