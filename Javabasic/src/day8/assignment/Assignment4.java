package day8.assignment;

public class Assignment4 {
	static void quotient(int num1, int num2) {
		System.out.println("number 1 is :"+ num1);
		System.out.println("number 2 is :"+ num2);
		System.out.println("quotient ="+ (num1/num2));
	}

	public static void main(String[] args) {
		Assignment4.quotient(55,11);
		System.out.println("**********************************");
		int a=88, b=22;
		quotient(a, b);
		
		System.out.println("**********************************");
		System.out.println("remainder of number3/number4 =" +remainder(24, 5));
		int result=remainder(37, 8);
		System.out.println("remainder of 37/8 = "+result);

	}
    static int remainder(int num3,int num4) {
    	int mode=num3%num4;
    	System.out.println("number 3 is :"+ num3);
		System.out.println("number 4 is :"+ num4);
		return mode;
    }
}
