package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		Bank b=new BankImpl(5000);

		while(true) {

			System.out.println("1:Deposit\n2:Withdraw\n3:Chcek Balance\n4:Exit");
			int choice=ip.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter deposit amount : ");
				b.deposit(ip.nextInt());
				break;
			case 2:
				System.out.println("Enter withdrawing amount : ");
				b.withdraw(ip.nextInt());
				break;
			case 3:System.out.println(b.getBalance());
			break; 
			case 4:
				System.out.println("Thank You. Use me Again");
				System.exit(0);
				break;
			default:System.out.println("Invalid Choice");
			}
			System.out.println("---------------------------");
//			ip.close();
		}
	}
}