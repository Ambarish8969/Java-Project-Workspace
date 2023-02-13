package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Map<String,Double> map=new LinkedHashMap<String,Double>();
		map.put("Tom",2.4);
		map.put("Ambarish", 3.4);
		map.put("Jhon", 2.1);
		map.put("Iranna",3.4);
		map.put("Dilip", 3.00);
		
		Set<String> keys=map.keySet();
		for(String key:keys) {
			if(map.get(key)>2.5 && map.get(key)<3.5)
			System.out.println("Salary of "+key+" is "+map.get(key)+"LPA");
		}
	}
}
