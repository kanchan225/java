package day13.Inheritance;
class Animal1 {
	  Animal1(){
  }
	public void move() {
	System.out.println("Animals can move");	
	}
}
class Dog extends Animal1 {
		  Dog(){
			  super();
	  }
		public void move() {
		System.out.println("Dog can walk and run");	
	}
		public void bark() {
			System.out.println("Dog can bark");	
	}
}
public class Overriding1 {
	public static void main(String[] args) {
        Animal1 a= new Animal1();
        a.move();
        Dog d=new Dog();
        d.move();
        d.bark();
        Animal1 a1= new Dog();//animal reference but dog object
        a1.move();//move() of Dog class will be called due to Overriding of move()
        // a1.bark(); ----> compile time error since a1 is animals1 class reference and bark() is not overriden
        Animal1 a2= new Animal1();
        a2.move();//move() of Animals1 class will be called
	}
}
