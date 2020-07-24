package learnJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionsConcept {

	public static void main(String[] args) {
		
		
		List<String> lists = new ArrayList<String>();
		
		lists.add("Abdul");
		
		lists.add("mubi");
		
		lists.add("agi");
		
		for(String list : lists) {
			
			System.out.println("output is "+list);
			
			
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		Set<String> set1  = new HashSet<String>();
		
		set1.add("abdul");
		
		set1.add("mubi");
		
		set1.add("agi");
		
		for(String set2 : set1) {
			
			System.out.println("output - " + set2);
		}
		
		System.out.println("*************************************");


		Map<String,String> map = new HashMap<String,String>();
		
	map.put("abdul", "good");
	map.put("mubi", "worst");
	map.put("agi", "better");
	
	System.out.println(map.get("abdul"));
	
	Set<Entry<String,String>> sets = map.entrySet();
	
	//passing through map using iterator
	
	Iterator<Entry<String, String>> itr = sets.iterator();
	
	while(itr.hasNext()) {
		
		
		@SuppressWarnings("rawtypes")
		Map.Entry name =(Map.Entry)itr.next();
		
		System.out.println("Key is " + name.getKey());
		
		System.out.println("Value is " + name.getValue());
	}
	
	System.out.println("#######################################");

	//passing through maps using for-each-loop
	
		for (Entry<String, String> set : sets) {

			System.out.println("Key is " + set.getKey());

			System.out.println("Value is " + set.getValue());

		}
	
	
	
	
	}

}
