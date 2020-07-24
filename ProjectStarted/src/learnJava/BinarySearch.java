package learnJava;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a= {23,45,67,89,102,120};
		
		int x = 102;
		
		System.out.println("index of given number is "+binarySearch(a,x));
	}
	
	public static int binarySearch(int[] a, int x) {
		
		int start = 0;
		int end = a.length-1;
		
		
		while(start<=end) {
			
			int mid = (start + end) /2;
			
			if (a[mid] == x)
				return mid;
			if (a[mid]>x)
				end = mid-1;
			if(a[mid]<x)
				start = mid+1;
			
		}
		return -1;
		
		
		
	}

}
