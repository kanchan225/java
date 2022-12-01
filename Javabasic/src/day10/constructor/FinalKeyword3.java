package day10.constructor;

public class FinalKeyword3 {

	int cube(final  int n) {
		System.out.println("Given number is : "+n);
		//n=n+2;
		return n*n*n;
	}
	public static void main(String[] args) {
		FinalKeyword3 f1=new FinalKeyword3();
		System.out.println("Cube of Given Number = "+f1.cube(5));

	}

}
