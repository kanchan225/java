package day15.package2;
import day15.package1.PublicMembers;
//import day15.package1.*;
 class AccessPublicMembers3 {

	public static void main(String[] args) {
		System.out.println("Accessing public members from another class outside the package");
		System.out.println(PublicMembers.num);
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accnum);
		p1.displayAccnum();
		
    }
}
 
class Demo {

	public static void main(String[] args) {
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accnum);
		p1.displayAccnum();
   }
}
class Demo1 extends PublicMembers {

	public static void main(String[] args) {
		Demo1 p1=new Demo1();
		System.out.println(p1.accnum);
		p1.displayAccnum();
		
		PublicMembers p2=new Demo1();
		System.out.println(p2.accnum);
		p2.displayAccnum();
		
		PublicMembers p3=new PublicMembers();
		System.out.println(p3.accnum);
		p3.displayAccnum();
		
   }
}
class Demo2 extends Demo1 {

	public static void main(String[] args) {
		Demo1 p1=new Demo1();
		System.out.println(p1.accnum);
		p1.displayAccnum();
		
		Demo1 p2=new Demo2();
		System.out.println(p2.accnum);
		p2.displayAccnum();
		
		Demo2 p3=new Demo2();
		System.out.println(p3.accnum);
		p3.displayAccnum();
   }
}
