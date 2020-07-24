package sathyaBroQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArrayListOfIntegerUsingCollection {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> lists = new ArrayList<Integer>();
		
		System.out.println("Enter some numbers");
		
		while(sc.hasNextInt()) {
		
			lists.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println("Numbers in given order - " +lists);
		
		Collections.sort(lists);
		
		System.out.println("Sorted ArrayList Ascending order- "+lists);
		
		Collections.reverse(lists);
		//Collections.sort(lists,Collections.reverseOrder());//Another way of reverse the sorted arraylist
		
		System.out.println("Sorted ArraList decending order- "+lists);
		
	}

}
