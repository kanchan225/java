package day21.ScannerAndStringClass;

public class SingleObject1 {
	/**
	 * 1. constructor should be private
	 * 2. create static ref variable of the class
	 * 3. create static method which return current class object
	 */
	int age=25;
	//1. constructor should be private
	private SingleObject1() {
		System.out.println("Sampleton class cons");
	}
	//2. create static ref variable of the class
	public static SingleObject1 singleObj=new SingleObject1();
	//3. create static method which return current class object
	public static SingleObject1 getSampletonObject1() {
		return singleObj;
	}
	public void display(int num) {
		System.out.println("I am display()");
		age=num;
	}
}
class Demo1{
	
	public static void main(String[] args) {
		//SingleObject s1=new SingleObject();
		
		SingleObject1 s1=SingleObject1.getSampletonObject1();//new SingleObject();
		System.out.println(s1.age);
		s1.display(30);
		System.out.println(s1.age);
		SingleObject1 s2=SingleObject1.getSampletonObject1();
		//s1 and s2 both are reffering to singleObj no new object is created
		System.out.println(s2.age);
		s2.display(35);
		System.out.println(s2.age);
		System.out.println(s1.age);
	}
}