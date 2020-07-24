package learnJava;

import java.util.Scanner;

public class LetterSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		//take value from user
		System.out.println("Enter word");
		String input = sc.next();
		
        //find length of the string
		int size = input.length();

		//declare length size as char array size
		char[] a = new char[size];

		for (int i = 0; i < size; i++) {

			a[i] = input.charAt(i);
		}

		System.out.print("Unsorted value are ");

		for (char z : a) {

			System.out.print(z + ", ");
		}

		System.out.println();

		//pass char array a as parameter to sort method and stored in char array b
		char[] b = sort(a);

		System.out.print("Sorted value are ");

		for (char c : b) {
			System.out.print(c + ", ");
		}

		sc.close();

	}

	public static char[] sort(char[] arr) {

		int size = arr.length;
		char temp;

		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}

		}

		return arr;
	}

}
