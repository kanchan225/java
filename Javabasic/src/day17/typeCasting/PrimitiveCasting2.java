package day17.typeCasting;
class sample1{
	double test1() {
		System.out.println("Running test1");
		return 4.5;
	}
	int test2() {
		System.out.println("Running test2");
		return 4;
	}
	
}
public class PrimitiveCasting2 {

	public static void main(String[] args) {
		sample1 s1=new sample1();
		//int res= s1.test1();
		int res1=(int) s1.test1();//explicit narrowing
		System.out.println("return value = "+res1);
		System.out.println("return value of test 1 : "+(int) s1.test1());
		
		double res3=s1.test2();//implicit widening
		System.out.println("return value of test2 = "+res3);
		System.out.println("return value of test2 = "+(double)s1.test2());

	}

}
