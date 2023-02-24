package com;

public class Solution {
	
	public static void main(String[] args) {
		DepartmentalStore d1=new DepartmentalStoreImpl();
		d1.addProduct();
		d1.displayProduct();
		d1.buyProduct();
		d1.checkout();
	}
	
}
