package javaLists;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cars = new LinkedList<>();
		cars.add("BMW");
		cars.add("Honda");
		
		System.out.println(cars);
		
		cars.addFirst("Hero");
		System.out.println(cars);
		
		cars.add(2, "Hyundai");
		System.out.println(cars);
		
		cars.remove("Hero");
		System.out.println(cars);
		
		System.out.println(cars.pop());
		
		cars.clear();
		System.out.println(cars);
	}

}
