package sathyaBroQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String string = "Selenium is one of the Automation Tool in the Market";
		string = string.toLowerCase();
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<string.length(); i++) {
			
			if(string.charAt(i)!=' ') {
			
			if(map.containsKey(string.charAt(i))) {
				
				map.put(string.charAt(i), map.get(string.charAt(i))+1);
			}else {
				
				map.put(string.charAt(i), 1);
			}
			}
			
		}
		
	  
		Iterator<Entry<Character, Integer>> itr= map.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Character, Integer> entry = itr.next();
			
			System.out.println("Occurance of "+entry.getKey()+" is "+entry.getValue());
		}
		
		
	}

}
