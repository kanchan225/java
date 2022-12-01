package day6.conditionalStatement;

public class IfCondition1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1= 45, num2=25;
        
        if (num1!=num2)	{	
        	 System.out.println("number 1 is not equals to number 2");
        }else {
        	 System.out.println("number 1 is equals to number2");
        }
        
         if (num1>num2)	{	
       	 System.out.println("number 1 is greater than number 2");
       }else {
       	 System.out.println("number 1 is smaller than number2");
       }
        if (num1<=num2)	{	
       	 System.out.println("number 1 is either equals to number 2 or smaller than number 2");
       }else {
       	 System.out.println("number 2 is smaller than number1");
       }
        if (num1==num2 || num1>num2  )	{	
       	 System.out.println("number 1 is either equals to number2 or greater than number 2");
       }else {
       	 System.out.println("number 1 is smaller than number2");
       }
        if (num1==num2 && num1>num2  )	{	
          	 System.out.println("number 1 is  equals to number2 and greater than number 2");
          }else {
          	 System.out.println("number 2 is smaller than number1");
          }
        int sub1=50, sub2=30;
        if (sub1>35 || sub2>35  )	{	
          	 System.out.println("pass......");
          }else {
          	 System.out.println("fail......");
          }
        
        }

}
