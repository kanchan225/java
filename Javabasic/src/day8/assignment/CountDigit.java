package day8.assignment;

public class CountDigit {
     int num=5461, num2=640830;
	public static void main(String[] args) {
		CountDigit c1=new CountDigit();
		System.out.println("Given number is :"+c1.num);
		int  counter=0;
		for(;c1.num>0; c1.num=c1.num/10) {
			counter++;
		}
		System.out.println(" Count of digit in given number:"+counter);

		 System.out.println("*************************************************");
		 System.out.println("Given number is :"+c1.num2);
	    counter=0;
        while(c1.num2>0) {
        	counter++;
        	c1.num2=c1.num2/10;
        }
        System.out.println(" Count of digit in given number:"+counter);
	
	int num1=2435, counter1=0;
	for(num1=2435; num1>0; num1=num1/10) {
		counter1++;//1,1+1=2,
	}
	System.out.println(" Count of digit in given number:"+counter1);
	}
}
