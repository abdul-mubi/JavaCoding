package learnJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class SortingOfArrayList {
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer>list= new ArrayList<Integer>();
		
		//System.out.println("Enter numbers");
		
		list.add(34);
		list.add(3345);
		list.add(12);
		list.add(9);
		list.add(5647);
		
		System.out.println("Unsorted numbers are "+ list);
		
		//Sorting for ArrayList
		Collections.sort(list);
		System.out.println("sorted numbers are "+list);
		
		/*//reverse for arrayList - type1
		Collections.reverse(list);
		System.out.println("Reversed sorted numbers are "+list);*/
		
		// reverse for arrayList - type2
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reversed sorted numbers are " + list);
		
		//to print last number 
		System.out.println("Last value is "+ list.get(list.size()-1));

        // to print the ArrayList - type1
		/*for(int a : list) {
			
			System.out.println("values in assending order - "+a);
		}
		*/
		
		// to print the ArrayList - type2
		ListIterator<Integer> itr = list.listIterator();
		
		System.out.print("Asscending Order - ");
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next()+", ");
		}
		
		System.out.println();
		System.out.print("Descending Order - ");
		
		while(itr.hasPrevious()) {
			
			System.out.print(itr.previous()+", ");
		}
		
	}

}
