package day15.package2;

import day15.package1.ProtectedMembers;
//import day15.package1.*;
public class AccessProtectedMembers3 extends ProtectedMembers{
     int num=657;
	public static void main(String[] args) {
		 AccessProtectedMembers3 p1=new AccessProtectedMembers3();
		 System.out.println("Accessing protected members from another class outside of package");
		    	System.out.println(p1.accnum);
		    	p1.displayAccnum();
		 ProtectedMembers p2=new ProtectedMembers(); 
		// System.out.println(p2.accnum);
	    	//p2.displayAccnum();
		 ProtectedMembers p3=new AccessProtectedMembers3();
//		 System.out.println(p3.accnum);
//	    	p3.displayAccnum();
		}

}
class AccessProtectedMembers4 extends AccessProtectedMembers3{

	public static void main(String[] args) {
		 AccessProtectedMembers3 p1=new AccessProtectedMembers3();
		 System.out.println("Accessing protected members from another class outside of package");
		    	//System.out.println(p1.accnum);---> not accessible from child class
		    	//p1.displayAccnum();---> not accessible from child class
		 
		 System.out.println(p1.num);    
		 AccessProtectedMembers4 p2=new AccessProtectedMembers4();
		 System.out.println(p2.accnum);
		 p2.displayAccnum();
		 
		 AccessProtectedMembers3 p3=new AccessProtectedMembers4();
		 //System.out.println(p3.accnum);
		// p3.displayAccnum();
	}

}
