package day23.CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;

//Program to get only unique elements from list

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
        a1.add(5);
        a1.add(10);
        a1.add(23);
        a1.add(10);
        a1.add(5);
        a1.add(33);
        a1.add("Kanchan");
        a1.add('A');
        System.out.println("Size of ArrayList: "+a1.size());
        System.out.println("Elements of ArrayList: "+a1);
        
        HashSet h1=new HashSet();
        h1.addAll(a1);
        System.out.println("Only Unique elements of ArrayList: "+h1);
        
        //OR
        HashSet h2=new HashSet(a1);
        System.out.println("Only Unique elements of ArrayList: "+h2);
        
        //a1.removeIf(str -> str.contains(a1.get(0)=a1.get(1)));
	}

}
