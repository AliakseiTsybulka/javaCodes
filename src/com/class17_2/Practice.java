package com.class17_2;

public class Practice {

	public static void main(String[] args) {
		for (int e=1;e<=4;e++) {
			for (int f=1;f<=6;f++) {
				if (e==1||e==4||f==1||f==6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}