package day23.Collections;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		System.out.println("Elements are: " + vec.capacity());
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Cat");
		//System.out.println(vec.add("cat"));
		System.out.println("Elements are: " + vec);		
		vec.addElement("mat");
		System.out.println("Elements are: " + vec.capacity());
		System.out.println("Elements are: " + vec);
		for(String str: vec) {
			System.out.println(str);
		}
		vec.setSize(2);
		System.out.println("Elements are: " + vec);
		vec.setSize(13);
		System.out.println("Elements are: " + vec);
	}

}
