package day23.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println(list.add("Grapes"));
		// accessing particular element
		System.out.println(list.get(0));
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		// changing the element
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		// Sorting the list
		Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});
	
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		System.out.println("*********with used Iterator Object**********");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
