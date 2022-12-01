package day13.Inheritance;
class fruitA{
	int fruitAge;
	fruitA(){
		System.out.println("fruit class constructor");
		fruitAge=7;
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
class mango extends fruits{
	int fruitAge;
	mango(){
		System.out.println("mango class constructor");
		fruitAge=5;
	}
	public void taste() {
		System.out.println("mango are tart in taste");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}
public class Inheritance8 {
 
	public static void main(String[] args) {
		mango m=new mango();
		m.shape();
		m.taste();
		System.out.println(m.fruitAge);

		fruitA f=new fruitA();
		f.taste();
		System.out.println(f.fruitAge);

	}

}
