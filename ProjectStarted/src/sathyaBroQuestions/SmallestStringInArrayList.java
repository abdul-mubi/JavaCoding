package sathyaBroQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SmallestStringInArrayList {

	public static void main(String[] args) {

		String string = "Selenium is one of the Automation Tool in the Market";

		List<String> lists = Arrays.asList(string.split(" "));
		

		Map<String, Integer> maps = new HashMap<String, Integer>();

		for (String list : lists) {

			maps.put(list, list.length());
		}

		Set<Entry<String, Integer>> sets = maps.entrySet();
		int length = lists.get(0).length();
		String name = null;

		for (Entry<String, Integer> set : sets) {

			if (set.getValue() < length) {

				length = set.getValue();
				name = set.getKey();
			}

		}

		System.out.println("Smallest String is " + name + " and their length is " + length);

	}

}
