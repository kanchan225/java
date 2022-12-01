package day8.assignment;

public class LeapYear {

	public static void main(String[] args) {
		CheckLeapYear(1900);
        int year = 2000;
        CheckLeapYear(year);
        System.out.println("Given year is leap year :"+CheckLeapYear2(2000));
        System.out.println("Given year is leap year :"+CheckLeapYear2(1900));
	}
	static void CheckLeapYear(int year) {
		System.out.println("Given year is :"+year);
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
			System.out.println("Given year is Leap Year");
		}
		else {
			System.out.println("Given year is Common Year");
		}
	}

	static boolean CheckLeapYear2(int year) {
		System.out.println("Given year is :"+year);
		if(year%4==0) {
			if (year%400==0) {
				return true;
			} else {
				return false;
			}
		}
		else if	(year%100!=0)	{
			return true;
		} else {
			return false;
		}
		}
	
}
