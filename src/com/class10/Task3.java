package com.class10;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using element of array: �Saturday is Java coding Day�.
		String[] days =new String[] {"Java", "Saturday", "day", "coding", "is"};
		String sentence = days[1]+" "+days[4]+" "+days[0]+" "+days[3]+" "+days[2];
		System.out.println(sentence);
	}

}
