package com.class11;

import java.util.Scanner;

public class Main {
	/* For you to do:
If browser is ChRoME
It should print the 
Proceed with chrome Browser
If browser is FireFOX
It should print the 
Proceed with firefox Browser
If browser is Ie
It should print the 
Proceed with ie Browser
If any other browser 
It should print the  
Invalid Browser
	 */
	


	public static void main(String[] args)
	{
		int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
int max=a[0][0];
		for (int i=0;i<a.length;i++ ) {
			for (int b=0;b<a[i].length;b++) 
		if (a[i][b]>max) 
		max=a[i][b];}
		System.out.println(max);
	}
}