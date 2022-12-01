package day6.conditionalStatement;

public class IfCondition1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int year=2021;
      if (((year % 4==0) && (year % 100 !=0) || (year % 400 == 0))) {
   	   System.out.println("LEAP YEAR");
          }
      else {
   	   System.out.println("COMMON YEAR");
      }
       year=1996;
      if (((year % 4==0) && (year % 100 !=0) || (year % 400 == 0))) {
   	   System.out.println("LEAP YEAR");
          }
      else {
   	   System.out.println("COMMON YEAR");
      }
      
      checkleapYear(2020);
      
      System.out.println("Given year is leap year :" +checkleapYear(2020));
      System.out.println("Given year is leap year :" +checkleapYear(2010));
      
      boolean res =  checkleapYear(2020);
      System.out.println("29th feb is there :" +res);
     
      res =  checkleapYear(2022);
      System.out.println("29th feb is there:" +res);
          
	}
      static boolean checkleapYear(int year) {
    	  if (((year % 4==0) && (year % 100 !=0) || (year % 400 == 0))) {
    	   	   System.out.println("LEAP YEAR");
    	   	   return true;
           }
    	      else {
    	   	   System.out.println("NON LEAP YEAR");
    	   	   return false;
    	      }
      
	}

}
