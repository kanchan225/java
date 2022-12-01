package Day19.ObjectClass;
class Demo{
	void display() {
		System.out.println("I am display()...");
	}
}
public class Example1 extends Demo{
    static int last_roll=100;
    int roll_no;
    Example1(){
    	roll_no=last_roll;
    	last_roll++;
    }
	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1);//d1.toString()---->string representation of an object & it print the address of object
		Demo d2=new Demo();
		System.out.println(d2.toString());
		System.out.println("***************************************");
		Example1 s=new Example1();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("***************************************");
		Demo d=new Example1();
		System.out.println(d);
		System.out.println("***************************************");
		System.out.println(new Example1());

	}

}
