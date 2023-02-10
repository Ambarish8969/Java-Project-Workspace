package com.rohan;

import java.util.Scanner;

public class Menu {
	Scanner ip=new Scanner(System.in);
	int VegBiryani=150;
	int Vegthali=200;
	int Kajupaneer=150;

	int Non_vegBiryani=200;
	int Non_vegThali=250;
	int ChickenMasala=150;

	int total;
	int quantity; 
	
	public int displayMenu() {
		System.out.println("--------------------------");
		System.out.println("-----Wecome to Hotel Rohan-----");
		System.out.println("-------------Menu--------------");
		System.out.println("Enter your choice : 1 for Veg and 2 for Non-veg");
		int choice=ip.nextInt();
		if(choice==1) {
			System.out.println("1:VegBiryani\n2:Vegthali\n3:Kajupaneer\n4:Exit");
		}else if(choice==2) {
			System.out.println("1:Non-vegBiryani\n2:Non-vegThali\n3:ChickenMasala\n4:Exit");
		}else {
			System.out.println("Invalid Choice");
		}
		return choice;
	}
	
	public void getBill() {
		System.out.println("Your total bill : "+total);
	}
	
	public void createVegOrders() {
		System.out.println("Select your Dishes with no-of plates :");
		while(true) {
			int choice=ip.nextInt(); 
			switch(choice) {
			case 1:
				quantity=ip.nextInt();
				total=total+VegBiryani*quantity;
				break;
			case 2: 
				quantity=ip.nextInt();
				total=total+Vegthali*quantity;
				break;
			case 3:
				quantity=ip.nextInt();
				total=total+Kajupaneer*quantity;
				break;
			default: 
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to Continue your order : ");
			String choice1=ip.nextLine();
			if(choice1=="yes") {
				createVegOrders();
			}else {
				getBill();
				System.exit(0);
			}
		}
	}
	
	public void createNonOrders() {
		System.out.println("Select your Dishes with no-of plates :");
		while(true) {
			int choice=ip.nextInt(); 
			switch(choice) {
			case 1:
				quantity=ip.nextInt();
				total=total+Non_vegBiryani*quantity;
				break;
			case 2: 
				quantity=ip.nextInt();
				total=total+Non_vegThali*quantity;
				break;
			case 3:
				quantity=ip.nextInt();
				total=total+ChickenMasala*quantity;
				break;
			default: 
				System.out.println("Invalid Choice");
				
			}
			System.out.println("Do you want to Continue your order : ");
			String choice1=ip.next();
			if(choice1=="yes") {
				createNonOrders();
			}else {
				getBill();
				System.exit(0);
			}
		}
	}
	
}
