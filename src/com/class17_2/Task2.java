package com.class17_2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * . Ask user to enter the item they want to buy and the price for the item.
		 * Then ask user to pay for it. Every time user enters money accumulate the
		 * amount and tell user how much is left to pay off the amount. Whenever user
		 * done with payments tell them "Thank you for shopping!"
		 */
		String item;
		double price, entered=0,left;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the item that you want to buy");
		item = scan.nextLine();
		System.out.println("Please enter the price for it");
		price = scan.nextDouble();
		System.out.println("Please pay for the item. " + price + " is left");
			
			do {	
				entered = scan.nextDouble();
			left=price-entered;
				System.out.println("The " + left + "$ is left");
			price-=entered;
			}
			while (left>0);
				System.out.println("Thanks for shopping!");
		}
	}
