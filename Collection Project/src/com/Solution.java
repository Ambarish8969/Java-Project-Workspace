package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(25, "Apple");
		map.put(26, "Samsung");
		map.put(27, "Sony");
		
		Set<Integer> keys=map.keySet();
		for(int key:keys) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
