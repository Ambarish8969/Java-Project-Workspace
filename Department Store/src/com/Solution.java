package com;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to XYZ Deparmental Store");
		System.out.println("********************************");
		
		Scanner ip=new Scanner(System.in);
		DepartmentalStore d1=new DepartmentalStoreImpl();
		
		d1.addProduct();
		
		int choice =1;
		while(choice == 1) {
			d1.displayProduct();
			d1.buyProduct();
			System.out.println("------------------");
			System.out.println("Press 1 to continue shopping or any other num to checkout");
			choice = ip.nextInt();
		}
		d1.checkout();
	}
	
}
