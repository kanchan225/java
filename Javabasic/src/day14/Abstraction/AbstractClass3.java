package day14.Abstraction;
abstract class Bike{
	protected abstract void run();
	void speed(int spd) {
		System.out.println("Bike Speed : "+spd);
	}
}
class Honda1 extends Bike{
	public void run(){
		System.out.println("Running Safely");
	}
	void speed(int spd) {
		System.out.println("Honda1 Speed : "+spd);
		super.speed(80);
	}
	void color() {
		System.out.println("Honda color is black");
	}
}
public class AbstractClass3 {

	public static void main(String[] args) {
		Bike b1=new Honda1();
		b1.run();
		b1.speed(90);
		//b1.color();

	}

}
