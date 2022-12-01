package day20.SystemClass;
class Demo{
	void display() {
		System.out.println("Demo class display method");
	}
	void callMe() {
		System.out.println("Demo class callme method");
	}
	Demo() {
			System.out.println("Demo class constructor.....");
		}
}
public class StaticReference {
    static int age=30;
    final static Demo d1=new Demo();
    static void calling() {
		System.out.println("Calling..........");
	}
    void test() {
		System.out.println("StaticReference class test method");
	}
	public static void main(String[] args) {
		StaticReference.d1.display();//classname.static-refVariable.non-staticMethod
		StaticReference.d1.callMe();//classname.static-refVariable.non-staticMethod
        //d1.callMe();
		
		Demo d1=new Demo();
		d1.display();
		d1.callMe();
		
		StaticReference s1=new StaticReference();
		s1.test();
		s1.calling();
		
		StaticReference.calling();
		System.out.println(StaticReference.age);
		
	}

}
