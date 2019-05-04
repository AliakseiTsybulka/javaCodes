package homework;

import java.util.ArrayList;
class Main {
	 static ArrayList<String> names() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shiva");
		list.add("Sandish");
		list.add("Asel");
		return list;
	}
	public static void main(String[] args){
   ArrayList<String> output= names();
   System.out.println(output);
   
 }
	
	
}
/*
We will be manipulating elements of an ArrayList by using List methods.

Create a method in which you will be storing names into ArrayList and your method should return that arrayList object.

Please add the three names like Shiva,Sandish,Asel

Output would be:

[Shiva, Sandish, Asel]
*/