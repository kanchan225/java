package day21.ScannerAndStringClass;
final class TestImmutableClass{
	final String name;
	final int salary;
	TestImmutableClass(String s1, int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Kanchan", 75000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		
		TestImmutableClass t2=new TestImmutableClass("Kanchan1", 750001);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());

	}

}
