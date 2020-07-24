package learnJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		
		
		String[] names = { "Java", "Qtp", "Selenium", "WebDriver","Java"};
		
		//Using HashMap:
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String name: names) {
			
		Integer count = map.get(name);
		
		if(count==null) {
			
			map.put(name, 1);
		}
		else {
			
			map.put(name, ++count);
		}
			
		}
		
		Set<Entry<String,Integer>> sets =map.entrySet();
		
		for(Entry<String,Integer> set : sets) {
			
			if(set.getValue() > 1) {
			System.out.println("Map:\nDuplicate value is " + set.getKey());
			System.out.println("Number of times repeated is " +set.getValue());
			}
		}
		System.out.println("*****************************");
		//Using HashSet :
		
		Set<String> set = new HashSet<String>();
		
		for(String name : names) {
			
			boolean status = set.add(name);
			
			if(status == false) {
				
				System.out.println("Set:\nDuplicate value is " +name);
				
			}
			
		}
		
		System.out.println("*****************************");
		//Using For loop
		
		for(int i = 0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i]==names[j]) {
					
					System.out.println("For Loop:\nDuplicate value is " + names[i]);
				}
				
				
			}
		}

	}

}
