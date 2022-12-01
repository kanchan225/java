package day4_2.methodOverloading;
class Display{
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int num) {
		System.out.println(c+ " " +num);
	}
	public void disp(double c, double num) {
		System.out.println(c+ " " +num);
	}
}
public class Overloading4 {

	public static void main(String[] args) {
		Display d=new Display();
		d.disp('K');
		d.disp('K', 15);
		d.disp('K', 'a');
		d.disp(20, 25);
		System.out.println("********************************* ");
		Overloading4 obj=new Overloading4();
		obj.call(121);
		obj.call(12.5);
	}
	public void call(int num) {
		System.out.println("Calling....... " +num);
	}
	public void call(double num) {
		System.out.println("Calling....... " +num);
	}

}
