package day17.typeCasting;

class Grandparent1 {
	void myhome() {
		System.out.println("Home belongs to Grandparents");
	}
}
class Parent1 extends Grandparent1 {
	void show() {
		System.out.println("parent method show is called");
	}
	void callme() {
		System.out.println("parent method callme is called");
	}
}
class Child1 extends Parent1 {
	void readme() {
		System.out.println("child method readme is called");
	}
}
public class DerivedCasting1 {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Parent1 p1=new Parent1();
		p1.myhome();
		p1.show();
		p1.callme();
		Parent1 p2=new Child1();
		p2.myhome();
		p2.show();
		p2.callme();
		Parent1 p3=c1;
        Grandparent1 g1=new Child1();//auto Up-casting
        Grandparent1 g2=new Parent1();
        Grandparent1 g3=(Grandparent1)new Child1();//explicit Up-casting
        Grandparent1 g4=(Grandparent1)new Parent1();
        Grandparent1 g5=c1;
        Grandparent1 g6=p1;
        Grandparent1 g7=p2;
        Grandparent1 g8=p3;
        Grandparent1 g9=(Grandparent1)p3;
	}

}
