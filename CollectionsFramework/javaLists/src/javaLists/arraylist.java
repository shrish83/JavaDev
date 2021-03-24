package javaLists;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Pineapple");
		fruits.add("Orange");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		fruits.set(2, "Passion Fruit");
		System.out.println(fruits.get(1));
		fruits.remove(1);
		
		System.out.println(fruits);
	}

}
