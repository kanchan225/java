package Day19.ObjectClass;
class Test{
	void callme() {
		System.out.println("Hello");
	}
}
public class Example4 extends Test {
	static int last_roll=100;
	int roll_no;
	@Override
	public int hashCode() {
		return 505;
	}
	
	@Override
	public String toString() {
		return "BasicCoreJava";
	}

	public static void main(String[] args) {
		Example4 e=new Example4();
		System.out.println(e.hashCode());
		System.out.println(e);
		
		Test t=new Test();
		System.out.println(t.hashCode());
		System.out.println(t);
	}

}
