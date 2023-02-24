package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore{
	
	// key-> Product Id -> Integer & Value -> Product Instance -> Product.
	Map<Integer,Product> db=new LinkedHashMap<Integer,Product>();
	Scanner ip=new Scanner(System.in);
	int totalBill=0; 

	@Override
	public void addProduct() {
		db.put(1, new Product("chocolates",10,10));
		db.put(2, new Product("Biscuits",20,20));
		db.put(3, new Product("IceCreams",30,50));
		db.put(4, new Product("Bread",40,15));
	}

	@Override
	public void displayProduct() {
		Set<Integer> keys=db.keySet();
		for(int key:keys) {
			Product p=db.get(key);
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity : "+p.getQuantity());
			System.out.println("Cost : Rs."+p.getCost());
			System.out.println("-----------------------");
		}
	}

	@Override
	public void checkout() {
		
	}

	@Override
	public void buyProduct() {
		
	}
	
}
