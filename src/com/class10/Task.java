package com.class10;

public class Task {

	public static void main(String[] args) {
		// .Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		char [] array=new char[6];
		array[0]='A';
		array[1]='B';
		array[2]='C';
		array[3]='D';
		array[4]='E';
		array[5]='F';
		System.out.println(array[1]);
		
		char[] newArray= {'A','B','C','D','E','F'};
		System.out.println(newArray[1]);
	}

}
