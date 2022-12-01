package day23.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;

//Program to validate list is in sorted order or not
public class Assignment2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
        a1.add(5);
        a1.add(10);
        a1.add(15);
        a1.add(26);
        a1.add(27);
        a1.add(99);
        System.out.println("Size of ArrayList: "+a1.size());
        System.out.println("Elements of ArrayList: "+a1);
        
        ArrayList a2=new ArrayList();
        a2.addAll(a1);
        
        Collections.sort(a1);
        //System.out.println("Elements of ArrayList are sorted: "+a2.equals(a1));
        //or
        if(a2.equals(a1)) {
        	System.out.println("Elements of ArrayList are sorted");
        }else {
        	System.out.println("Elements of ArrayList are not sorted");
        }
	}

}
