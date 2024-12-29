package com.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortBasedOnValues {

	public static void main(String[] args) {
         
		Map<String,Integer> hashMap=new HashMap<>();
		hashMap.put("ranjith",35);
		hashMap.put("naveen",45);
		hashMap.put("parry",50);
		hashMap.put("raneeth",51);
		hashMap.put("Anu",35);
		
		
		//hashMap.entrySet().stream().sorted(Comparator.comparingByValue()).forEach(System.out::println);
		hashMap.entrySet()
	       .stream()
	       .sorted(Map.Entry.comparingByValue())
	       .forEach(System.out::println);
		
		Map<String,Integer> linked=hashMap.entrySet()
		.stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(
				Map.Entry::getKey,
				Map.Entry::getValue,
				(x,y)->x,
				LinkedHashMap::new));
		System.out.println(linked.entrySet());
		
		List<Map.Entry<String, Integer>> list=new ArrayList<>(hashMap.entrySet());
		Collections.sort(list,(x,y)->x.getValue().compareTo(y.getValue()));
		Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry:list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(linkedHashMap.entrySet());

		

	}

}
