package day17.typeCasting;
class sample2{
	void test1(double d) {
		System.out.println("d value ="+d);
		int i=(int) d;
		System.out.println("i value ="+i);
		}
//	void test1(int k) {
//		System.out.println("k value ="+k);
//	}
	
	void print(int num) {
		System.out.println("value of num ="+num);
		double num2=num;
		System.out.println("value of num2 ="+num2);
	}
}
public class PrimitiveCasting3 {

	public static void main(String[] args) {
		sample2 s1=new sample2();
		s1.test1(7);
		s1.test1(7.5);//or
		s1.test1((int)7.5);
		
		//s1.print(12.5);
		s1.print((int)12.5);
		//s1.print((double)12);

	}

}
