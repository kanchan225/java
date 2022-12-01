package day3.globalvariables;

public class StaticGlobalVariableExample4 {
	static int num1, num2=35, result;
     public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("number 1 is :"+num1);
     System.out.println("number 2 is :"+num2);
     result=num1+num2;
     System.out.println("result is :"+result);
     System.out.println("*************************");
     num1=20; result=num1+num2;
     System.out.println("Updated number 1 is :"+num1);
     System.out.println("number 2 is :"+num2);
     System.out.println("Updated result is :"+result);
     System.out.println("******************************");
     num1=65; num2=25; result=num1-num2;
     System.out.println("Updated number 1 is :"+num1);
     System.out.println("number 2 is :"+num2);
     System.out.println("Updated result is :"+result);
	}

}
