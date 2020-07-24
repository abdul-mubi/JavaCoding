package sathyaBroQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDupUsingCollections {

	public static void main(String[] args) {

		String[] names = { "Java", "Qtp", "Selenium", "WebDriver", "Java" };		

		// Using HashMap:

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String name : names) {

			if(map.containsKey(name)) {
				
				map.put(name, map.get(name)+1);
			}else {
				
				map.put(name, 1);
			}

		}

		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) itr.next();
			System.out.println(entry.getKey());
			
		}
		
		//HashSet
		
		Set <String> sets = new HashSet<String>();
		
		for(int i =0; i<names.length; i++) {
			
			if(!sets.add(names[i])) {
				System.out.println("Duplicate values are removed");
			}
		}
		
		System.out.println("Original values are ");
		for(String set:sets) {
			
			System.out.println(set);
		}
		
		
		
	}

}
