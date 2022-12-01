package day8.assignment;

public class Assignment2 {
    static float multiplication(float num1, float num2) {
    	float result=num1*num2;
    	System.out.println("number 1 is :"+num1);
    	System.out.println("number 2 is :"+num2);
    	return result;
    }
	public static void main(String[] args) {
		System.out.println(" multiplication of number=" +multiplication(25,15));
		
		System.out.println("***************************************************");
		
		float a= 20.5f, b= 15.5f;
		float result=multiplication(a, b);
		System.out.println(" multiplication of number :"+result);
		
		System.out.println("***************************************************");
		
		float result1=multiplication(32.5f, 6);
		System.out.println(" multiplication of number :"+result1);
		
		Assignment2.multiplication(10,5);
	}

}
