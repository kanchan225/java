package day14.Abstraction;
interface Animal121{
	int age=26;
	public void animalsound();// interface method (does not have body)
	public void sleep();
}
interface Reptile{
	public void colour();
}
class pig2 implements Animal121{
	int age=26;
	public void animalsound() {
		System.out.println("The pig says : wee wee" );
	}
	public void sleep() {
		System.out.println("Zzzzzz" );
	}
}
class Dog5 extends pig2 implements Reptile{
	public void colour() {
		System.out.println("color : blue" );
	}
	public void animalsound() {
		System.out.println("The dog says : bhow bhow" );
	}
}
public class Interface7  {
	public static void main(String[] args) {
		Dog5 obj=new Dog5();
		obj.colour();
		obj.animalsound();
        obj.sleep();
        pig2 obj1=new pig2();
		//obj1.colour();
		obj1.animalsound();
        obj1.sleep();
        pig2 obj2=new Dog5();
		//obj2.colour();
		obj2.animalsound();
        obj2.sleep();
        
	}

}
