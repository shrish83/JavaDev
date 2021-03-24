import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		ArrayList<Integer> list = new ArrayList(n);
		
		//add
		for(int i = 1;i<5;i++) {
			list.add(i);
		}
		
		//print a list
		System.out.println(list);
		
		//print elemnts in a list
		for(int i : list) {
			System.out.println(i);
		}
			
		//remove
		list.remove(3);
		//print a list
		System.out.println(list);
				
		//print elemnts in a list
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			}
	}

}
