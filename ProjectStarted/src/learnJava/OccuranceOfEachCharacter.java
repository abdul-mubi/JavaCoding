package learnJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfEachCharacter {
	
	
	public static void main(String[] args) {
		

		 String name = "Programming";

		
		//Using HashMap
		Map<Character,Integer> maps = new HashMap<Character,Integer>();
		
		for(int i =0; i<name.length(); i++) {
			
			Integer count = maps.get(name.charAt(i));
			
			if(count == null) {
				
				maps.put(name.charAt(i), 1);
			}else {
				
			    maps.put(name.charAt(i), ++count);
              
			}	
		}
		
		Iterator<Entry<Character, Integer>> itr = maps.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			@SuppressWarnings("rawtypes")
			Map.Entry entry=(Map.Entry) itr.next();
			
			System.out.println("Occurance of "+entry.getKey()+" is "+entry.getValue());
			
		}
		
		System.out.println("*******************************");
		//Using while loop
		
		 String name1 = "Programming";
		 
		while(name1.length()>0) {
			
			char ch= name1.charAt(0);
			
			int count = charCount(ch, name1);
			
			System.out.println("Occurance of "+ch+ " is "+ count);
			
			name1=name1.replace(""+ch,"");
			
		}
		
	}
	
	public static int charCount(char ch, String name) {
		
		int count = 0;
		while(name.indexOf(ch) != -1) {//ch = p
			
			++count;
			
			name = name.substring((name.indexOf(ch)+1));//rogramming
		}
		return count;
	}

}
