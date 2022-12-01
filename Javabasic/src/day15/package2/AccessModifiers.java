package day15.package2;

import day15.package1.Modifiers;

public class AccessModifiers {

	public static void main(String[] args) {
		Modifiers m1=new Modifiers();
//		System.out.println("Private variable : "+m1.num1);
//		System.out.println("Default variable : "+m1.num2);
//		System.out.println("Protected variable : "+m1.num3);
		System.out.println("Public variable : "+m1.num4);
     }
}
class AccessModifiers1 extends Modifiers{
	public static void main(String[] args) {
		AccessModifiers1 m1=new AccessModifiers1();
		//System.out.println("Private variable : "+m1.num1);
		//System.out.println("Default variable : "+m1.num2);
		System.out.println("Protected variable : "+m1.num3);
		System.out.println("Public variable : "+m1.num4);
	}
}