package com.class17_2;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=0;a<4;a++) {
			for (int b=5;b>0;b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		
		for (int c=0;c<5;c++) {
			for (int d=0;d<c;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int e=1;e<=4;e++) {
			for (int f=1;f<=6;f++ ) {
				if (f!=1||f!=6) {
					System.out.print("");
				} else {
				System.out.print("*");
			}
			}
		}
		
	}
}
