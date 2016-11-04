package JavaClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Inflater;

public class Array {
	
	

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>(2);
		list.add("Anjali");
		list.add("Raj");
		ArrayList<Integer> list1=new ArrayList<Integer>(3);
		list1.add(2);
		System.out.println(list1);
		for (String X: list) {
			System.out.println(X);
			System.out.println(list.size());
			
			list.remove(0);
		}
		for (String X: list) {
			System.out.println(X);
		}
		
	}}

