package day17.polymorphism;
class Animal{
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal{
	void eat() {
		System.out.println("Herbivores Eat plants");
	}
}
class omnivores extends Animal{
	void eat() {
		System.out.println("Omnivores Eat plants and meat");
	}
}
class carnivores extends Animal{
	void eat() {
		System.out.println("Carnivores Eat plants");
	}
}
public class Runtime {

	public static void main(String[] args) {
		Animal A =new Animal();
		A.eat();
		Animal A1=new herbivores();	
        A1.eat();
        Animal A2=new omnivores();	
        A2.eat();
        Animal A3=new carnivores();	
        A3.eat();
	}

}
