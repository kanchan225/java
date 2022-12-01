package day2.localvariables;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Program starts");
    int num1=30, num2=7;
    int result=num1+num2;
    System.out.println("Number 1 is :"+num1);
    System.out.println("Number 2 is :"+num2);
    System.out.println("Addition of two number ="+result);
    result=num1-num2;
    System.out.println("Subtraction of two number ="+result);
    result=num1*num2;
    System.out.println("Multiplication of two number ="+result);
    result=num1/num2;
    System.out.println("Division of two number ="+result);
    num1=25;
    System.out.println(" Updated Number 1 is :"+num1);
    System.out.println(" Updated Division of two number ="+result);
    result=num1/num2;
    System.out.println(" Updated Division of two number ="+result);
    
    char grade1='A', grade2='B';
    System.out.println(grade1+grade2);
    System.out.println('a'+'b');
	}

}
