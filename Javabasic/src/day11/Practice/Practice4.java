package day11.Practice;
class A{
	void reverseNumber(int num) {
		System.out.println("given number1 is : "+num);
		int rev=0, rem;
		for (int i=num; i>0; i=i/10) {
			   rem=i%10;
			   rev=rev*10+rem;
			}
		System.out.println("revrese of given number : "+rev);
	}
	boolean palindromeNumber(int num) {
		System.out.println("given number2 is : "+num);
		int copy=num, rev=0, rem;
		while ( num>0 ) {
			   rem=num%10;
			   rev=rev*10+rem;
			   num=num/10;
			}
		if(copy==rev) {
			return true;
		}else {
			return false;
		}
		}
	static void CheckLeapYear(int year) {
		System.out.println("given year is : "+year);
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
		System.out.println("given year is leap year");
	    }else {
	    	System.out.println("given year is not a leap year");
	    }
    }
}	
class B extends A{
	protected void reverseNumber(int num) {
		super.reverseNumber(2483);
		System.out.println("class B given number1 is : "+num);
		int rev=0, rem;
		for (int i=num; i>0; i=i/10) {
			   rem=i%10;
			   rev=rev*10+rem;
			}
		System.out.println("revrese of class B given number : "+rev);
	}
	public boolean palindromeNumber(int num) {
		System.out.println("Given number2 is palindrome : "+super.palindromeNumber(646));
		System.out.println("Class B given number2 is : "+num);
		int copy=num, rev=0, rem;
		for (int i=num; i>0; i=i/10) {
			   rem=i%10;
			   rev=rev*10+rem;
			}
		if(copy==rev) {
			return true;
		}else {
			return false;
		}
		}
	public boolean palindromeNumber(int num, float rev) {
		System.out.println("Class B given number3 is : "+num);
		int copy=num,  rem;
		for (int i=num; i>0; i=i/10) {
			   rem=i%10;
			   rev=rev*10+rem;
			}
		if(copy==rev) {
			return true;
		}else {
			return false;
		}
		}
	static void CheckLeapYear(int year) {
		A.CheckLeapYear(1992);
		System.out.println("class B given year is : "+year);
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
		System.out.println("given year is leap year");
	    }else {
	    	System.out.println("given year is not a leap year");
	    }
    }
	static void CheckLeapYear() {
		int year=2015;
		System.out.println("class B given year2 is : "+year);
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
		System.out.println("given year is leap year");
	    }else {
	    	System.out.println("given year is not a leap year");
	    }
    }
}	
public class Practice4 {

	public static void main(String[] args) {
		A obj1=new B();
		obj1.reverseNumber(123);
		System.out.println("Given number2 of class B is palindrome :"+obj1.palindromeNumber(131));
		//System.out.println("Given number2 of class B is palindrome :"+obj1.palindromeNumber(131, 0.0f));
	    A.CheckLeapYear(1900);
	    B obj2=new B();
		obj2.reverseNumber(60839);
		System.out.println("Given number2 of class B is palindrome :"+obj2.palindromeNumber(54674));
		System.out.println("Given number2 of class B is palindrome :"+obj2.palindromeNumber(131, 0.0f));
		B.CheckLeapYear(2000);
		B.CheckLeapYear();
	}

}
