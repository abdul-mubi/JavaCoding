package learnJava;


import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter numbers");
			arr[i] = sc.nextInt();

		}
		
		sc.close();
		
		System.out.print("Unsorted array - ");

		for (int a : arr) {

			System.out.print(a +", ");
		}
		
		System.out.println("");
		
		System.out.print("sorted array - ");

		int[] sortedArray = sort(arr);

		for (int a : sortedArray) {

			System.out.print(a+", ");
		}

	}

	public static int[] sort(int array[]) {

		int size = array.length;
		int temp = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - i; j++) {

				if (array[j - 1] < array[j]) {

					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

				}

			}
		}

		return array;

	}

}
