package com.rohan;

public class Solution {
	public static void main(String[] args) {
		Menu obj=new Menu();
		int choice=obj.displayMenu();
		if(choice==1) {
			obj.createVegOrders();
		}else {
			obj.createNonOrders();
		}
	}
}
