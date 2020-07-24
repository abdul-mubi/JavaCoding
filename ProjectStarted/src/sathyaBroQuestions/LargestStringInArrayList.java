package sathyaBroQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LargestStringInArrayList {

	public static void main(String[] args) {

		String string = "Selenium is one of the Automation Tool in the Market";
		
		List<String> lists = Arrays.asList(string.split(" "));
	 
		
		Map<String, Integer> maps = new HashMap<String,Integer>();
		
		for(String list:lists) {
			
			maps.put(list, list.length());
		}
		
		Set<Entry<String,Integer>> sets = maps.entrySet();
		int length =0;
		String name = null;
		
		for(Entry<String,Integer> set :sets) {
			
			if(set.getValue()>length) {
				
				length = set.getValue();
				name = set.getKey();
			}
			
		}
		
		System.out.println("Largest String is "+name+" and their length is "+length);
		
	}

}
