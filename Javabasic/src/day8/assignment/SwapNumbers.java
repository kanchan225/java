package day8.assignment;

public class SwapNumbers {

	public static void main(String[] args) {
		float num1= 22.5f, num2=10;
		System.out.println("First number is:"+num1);
		System.out.println("Second number is:"+num2);
		
		System.out.println("*******************************");
		
		float num = num1;
		num1=num2;
		num2=num;
		
		System.out.println("First number is:"+num1);
		System.out.println("Second number is:"+num2);
		
		/*0r
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		System.out.println("First number is:"+num1);
		System.out.println("Second number is:"+num2);
		*/
	}

}
