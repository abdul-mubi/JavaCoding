package java_example;

import java.util.Scanner;

public class MultiplesOf10NaturalNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the last number of your limit");
		int userInt = sc.nextInt();
		sc.close();
		
		int[] mainArray = returnArray(userInt);
		
		for(int i=0; i<userInt; i++) {
			System.out.println(mainArray[i]);
		}
		
	}
	
	public static int[] returnArray(int size) {

		int[] myArray = new int[size];

		for (int i = 0; i < size; i++) {

			myArray[i] = (i+1) * 10;
		}

		return myArray;

	}
   
}
