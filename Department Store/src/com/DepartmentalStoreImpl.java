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
		System.out.println("Total Bill : "+totalBill);
		System.out.println("Thanks for shopping, Visit again.");
	}

	@Override
	public void buyProduct() {
		System.out.println("Enter Choice : ");
		int choice = ip.nextInt();
		
		Product p=db.get(choice);
		System.out.println(p);
		if(p!=null) {
			System.out.println("Enter the Quantity : ");
			int quantity = ip.nextInt();
			
			if(quantity <= p.getQuantity()) {
				// Calculating current product cost
				int productCost= quantity * p.getCost();
				
				// Adding productCost to total bill
				totalBill = totalBill + productCost;
				
				// Updating the new quantity
				p.setQuantity(p.getQuantity() - quantity);
				
				System.out.println("Ordered "+quantity+" "+p.getName());
				System.out.println("Product Cost : "+productCost);
				System.out.println("Total Bill as of now : "+totalBill);
				
			}else {
				try {
					throw new InvalidQuantityException("Invalid quantity "+p.getQuantity()+" is not available");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		else {
			try {
				throw new InvalidQuantityException("Invalid quantity, kindly enter the valid choice.");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
	
}
