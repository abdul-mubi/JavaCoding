package sathyaBroQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNumInArray {

	public static void main(String[] args) {

		int[] num = {32,65,3,67,23,77,43,456};
		
		//collections
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<num.length;i++) {
			
			list.add(num[i]);	
		}
		
		Collections.sort(list);
		
		System.out.println("Ascending Order - "+list);
		
		Collections.reverse(list);
		
		System.out.println("Descending order - "+list);
		
		//without collections
		
		int temp = 0;
		
		for(int i =0; i<num.length; i++) {
			for(int j =(num.length-1); j>0; j--) {
				
				if(num[j-1]<num[j]) { 
					
					temp = num[j];
					num[j] = num[j-1];
					num[j-1]=temp;
					
				}
			}
		}
		
		System.out.println("Descending order is "+Arrays.toString(num));
		
		for(int i=0; i<num.length;i++) {
			for(int j=1;j<num.length-i;j++) {
				
				if(num[j-1]>num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j]=temp;
					
				}
			}
		}
		
		System.out.println("Ascending order is "+Arrays.toString(num));
		
	}

}
