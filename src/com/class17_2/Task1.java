package com.class17_2;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// 1. Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers
		Scanner scan = new Scanner(System.in);
		int sum1=0,sum2=0;
		System.out.println("Please enter integer number");
		int num1 =scan.nextInt();
		System.out.println("Please enter integer number");
		int num2 =scan.nextInt();
		for (int a=num1;a<=num2;a++) {
		if (a%2==0) {
			sum1=sum1+a;
		}else {
			sum2=sum2+a;
		}
		}
	System.out.println("The sum of even numbers is "+sum1+". And the sum of odd numbers is "+sum2 );
	}
}
