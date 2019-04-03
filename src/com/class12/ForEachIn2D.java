package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		String[][] groceryList= {
				{"bananas","dates","oranges","apples"},
				{"tomatoes","cucumbers","avocado","onions"},
				{"milk","eggs","oats","bread"}
		};
		for (String[] newArray : groceryList) {
			for (String list : newArray) {
				System.out.print(list+" ");
			}
			System.out.println();
		}
	}

}
