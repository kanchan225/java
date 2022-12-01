package day23.CollectionAssignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

//Program to add list into Queue
public class Assignment3 {

	public static void main(String[] args) {
	Vector vec= new Vector();
	vec.add("kanchan");
	vec.add("1236");
//	vec.add(349);
//	vec.add('A');
	vec.add("22.5");
	vec.add("kanchan");
	//vec.add(null);
	vec.add("null");
	System.out.println("Size of vec: "+vec.size());
	System.out.println("Elements of vec: "+vec);
	
	Queue que=new PriorityQueue(vec);
	//Queue que=new ArrayDeque(vec);
	//que.add(1);
	que.add("Rama");
	que.add("Kanchan");
	que.add("1236");
	//que.addAll(vec);
	System.out.println("Size of que: "+que.size());
	System.out.println("Elements of que: "+que);
	
	Vector vec1= new Vector();
	//ArrayList vec1=new ArrayList();
	vec1.add(25);
	vec1.add(1236);
	vec1.add("Kanchan");
	vec1.add(78);
	vec1.add('a');
	vec1.add(1);
	System.out.println("Elements of vec1: "+vec1);
	
	Queue que1=new ArrayDeque(vec);
	que1.add(25);
	que1.add("Rohit");
	System.out.println("Elements of que: "+que1);
	}

}
