package demoApplicatons;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class GrandParent extends GlobalVariable {
	
	
	public static void main(String[] args) {

		String string = "Hey java is Java best language is java";
		
		String[] arrays = string.split(" ");
		
		Map<String, Integer> maps = new HashMap<String,Integer>();
		
		for(String array : arrays) {
			
			//Integer count = maps.get(array);
			
			array = array.toLowerCase();
			
			if(maps.containsKey(array)) {
				
				maps.put(array, maps.get(array)+1);
			}else {
				
				maps.put(array, 1);
			}
		}
		
		int temp = 0;
		String name = null;
		
		//Set<Entry<String,Integer>>sets = maps.entrySet();//if i use iterator i can't use if (entry.getvalue>1), 
		                                                 //here entry.getvalue is considered as object
		                                                 // we can't compare object with integer
		
		for(Map.Entry<String,Integer> map : maps.entrySet()) {
			
			if (map.getValue()>temp) {
				
				temp = map.getValue();
				name = map.getKey();
				//System.out.println("Duplicate word is "+set.getKey()+ " and repeating number is "+set.getValue());
			}
			
		}
		
		System.out.println("Biggest repeated number is "+temp+" and word name is "+name);
	}
	


}
