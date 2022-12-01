package day17.typeCasting;
class parent{
	void myhome() {
		System.out.println("Parent Home");
	}
}
class child extends parent{
	void mycar() {
		System.out.println("child car");
	}
}
public class DerivedCasting {

	public static void main(String[] args) {
		child c1=new child();
		c1.myhome();
		c1.mycar();
		parent p1=new parent();
		p1.myhome();
		System.out.println("Using Upcasting");
		parent p2= c1;// auto or implicit up-casting
		p2.myhome();
		//p2.mycar(); 
		parent p3=new child();//auto or implicit up-casting
		p1.myhome();
		parent p4=(parent) new child();//explicit up-casting
		parent p5=(parent) c1;//explicit up-casting
	}

}
