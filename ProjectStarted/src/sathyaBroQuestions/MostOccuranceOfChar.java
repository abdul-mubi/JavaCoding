package sathyaBroQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MostOccuranceOfChar {

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
		
		int most = 0;
		char character = 'a';
		
		while(itr.hasNext()) {
			
			Map.Entry<Character, Integer> entry = itr.next();
			
			if(entry.getValue()>most) {
				most = entry.getValue();
				character = entry.getKey();
			}
		}
		
		System.out.println("Most occuring Character is "+character+" and number is "+most);
		
		
	}

}
